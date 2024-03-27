package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Entity.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Long> {
    boolean existsByUser(String course);

    List<EnrollmentEntity> findByCode(String code);
}
