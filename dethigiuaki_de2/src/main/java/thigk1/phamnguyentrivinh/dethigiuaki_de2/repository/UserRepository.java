package thigk1.phamnguyentrivinh.dethigiuaki_de2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.User;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPassword(String username, String password);
}
