package br.com.alura.challenge.Service;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Repository.CourseRepository;
import br.com.alura.challenge.Request.CourseRegisterRequest;
import br.com.alura.challenge.Useful.CourseValidation;
import br.com.alura.challenge.Useful.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
