package thigk1.phamnguyentrivinh.dethigiuaki_de2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.User;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsernameAndPassword(username, password);
        return userOptional.orElse(null);
    }
}
