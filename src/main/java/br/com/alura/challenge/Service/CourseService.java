package br.com.alura.challenge.Service;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Enum.RoleEnum;
import br.com.alura.challenge.Enum.StatusEnum;
import br.com.alura.challenge.Repository.CourseRepository;
import br.com.alura.challenge.Request.CourseRegisterRequest;
import br.com.alura.challenge.Request.ListRequest;
import br.com.alura.challenge.Useful.CourseValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    CourseValidation courseValidation= new CourseValidation();

    public  CourseEntity saveCourse(CourseRegisterRequest courseRegisterRequest){
        CourseEntity course = courseRegisterRequest.saveRequestObject();

        if(courseRegisterRequest.getRolePermission().description.equals("ADMINISTRATOR")){
            if(courseValidation.codeNameValidation(courseRegisterRequest.getCode())){
                if(!courseRepository.existsByCode(courseRegisterRequest.getCode())){
                    return  courseRepository.save(course);

                }else throw new RuntimeException("Código do curso já existe.");

            }else throw new RuntimeException("Codigo do curso inválido.");

        }else throw new RuntimeException("Permissão negada - Apenas administradores podem alterar ou adicionar cursos.");


    }

    public List<CourseEntity> findCourses(ListRequest listRequest){

        if(listRequest.getRole().description.equals("ADMINISTRATOR")){
            return courseRepository.findByStatus(listRequest.getStatus());

        }else throw new RuntimeException("Permissão negada - Apenas administradores podem alterar ou adicionar cursos.");
    }
}
