package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
