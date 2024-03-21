package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
