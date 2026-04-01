package ntu.springsecurity.demo_spring_security.repository;

import ntu.springsecurity.demo_spring_security.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);
}
