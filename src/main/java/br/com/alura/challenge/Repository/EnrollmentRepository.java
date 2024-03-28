package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Entity.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Long> {
    boolean existsByUser(String course);
    @Query(value = "SELECT * FROM alura.tb_enrollment WHERE (COURSE = ?1 AND USER_ID = ?2)", nativeQuery = true)
    List<EnrollmentEntity> findByCode(String code, String user);
}
