package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long> {
}
