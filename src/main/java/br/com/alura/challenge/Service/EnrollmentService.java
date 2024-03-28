package br.com.alura.challenge.Service;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Entity.EnrollmentEntity;
import br.com.alura.challenge.Repository.CourseRepository;
import br.com.alura.challenge.Repository.EnrollmentRepository;
import br.com.alura.challenge.Repository.UserRepository;
import br.com.alura.challenge.Request.EnrollmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;

    public EnrollmentEntity saveEnrollment(EnrollmentRequest enrollmentRequest){

        EnrollmentEntity enrollment = enrollmentRequest.saveRequestObject();

        if(userRepository.existsByUserName(enrollmentRequest.getUser())){
            if(courseRepository.existsByCode(enrollmentRequest.getCourse())){

                List<CourseEntity> course = courseRepository.findByCode(enrollmentRequest.getCourse());

                if(course.get(0).getStatus().getDescription().equals("ENABLE")){

                    if(enrollmentRepository.findByCode(enrollmentRequest.getCourse(), enrollmentRequest.getUser()).isEmpty()){
                        return enrollmentRepository.save(enrollment);
                    }else throw new RuntimeException("Usuario ja matriculado");

                }else throw new RuntimeException("Curso desativado");

            }else throw new RuntimeException("Curso não cadastrado");

        }else throw new RuntimeException("Usuario não cadastrado");
    }

    public EnrollmentEntity updateHateCourse(EnrollmentRequest enrollmentRequest) {

        if(!enrollmentRepository.findByCode(enrollmentRequest.getCourse(), enrollmentRequest.getUser()).isEmpty()){
            List<EnrollmentEntity> enrollmentList = enrollmentRepository.findByCode(enrollmentRequest.getCourse(), enrollmentRequest.getUser());
            enrollmentList.get(0).setHate(enrollmentRequest.getHate());
            return enrollmentRepository.save(enrollmentList.get(0));
        }else throw new RuntimeException("Usuario não matriculado");


    }
}


