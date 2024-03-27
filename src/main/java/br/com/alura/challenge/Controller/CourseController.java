package br.com.alura.challenge.Controller;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Entity.UserEntity;
import br.com.alura.challenge.Request.CourseRegisterRequest;
import br.com.alura.challenge.Request.UserRegisterRequest;
import br.com.alura.challenge.Service.CourseService;
import br.com.alura.challenge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private final CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/register-course")
    public ResponseEntity<CourseEntity> registerCourse(@RequestBody CourseRegisterRequest courseRegisterRequest){
        CourseEntity course = courseService.saveCourse(courseRegisterRequest);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }
}
