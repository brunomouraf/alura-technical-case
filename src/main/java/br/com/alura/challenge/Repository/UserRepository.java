package br.com.alura.challenge.Repository;

import br.com.alura.challenge.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
}
