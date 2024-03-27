package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Enum.RoleEnum;
import br.com.alura.challenge.Enum.StatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    boolean existsByCode(String code);
    List<CourseEntity> findByStatus(StatusEnum statusEnum);
}
