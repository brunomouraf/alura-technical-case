package br.com.alura.challenge.Controller;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Entity.EnrollmentEntity;
import br.com.alura.challenge.Request.CourseRegisterRequest;
import br.com.alura.challenge.Request.EnrollmentRequest;
import br.com.alura.challenge.Service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController {

    private final EnrollmentService enrollmentService;
    @Autowired
    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping("/enrollment")
    public ResponseEntity<EnrollmentEntity> registerCourse(@RequestBody EnrollmentRequest enrollmentRequest){
        EnrollmentEntity enrollment = enrollmentService.saveEnrollment(enrollmentRequest);
        return new ResponseEntity<>(enrollment, HttpStatus.CREATED);
    }

    @PutMapping("/enrollment-update-hate")
    public ResponseEntity<EnrollmentEntity> updateHate(@RequestBody EnrollmentRequest enrollmentRequest){
        EnrollmentEntity enrollment = enrollmentService.updateHateCourse(enrollmentRequest);
        return new ResponseEntity<>(enrollment, HttpStatus.OK);
    }
}
