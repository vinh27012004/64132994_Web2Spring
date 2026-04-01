package ntu.springsecurity.demo_spring_security.repository;

import ntu.springsecurity.demo_spring_security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
