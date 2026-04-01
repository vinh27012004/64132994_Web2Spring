package ntu.springsecurity.demo_spring_security.service;

import ntu.springsecurity.demo_spring_security.dto.UserRegistrationDto;
import ntu.springsecurity.demo_spring_security.model.AppUser;
import ntu.springsecurity.demo_spring_security.model.Role;
import ntu.springsecurity.demo_spring_security.repository.AppUserRepository;
import ntu.springsecurity.demo_spring_security.repository.RoleRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
public class AuthService {

    private final AppUserRepository appUserRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(AppUserRepository appUserRepository,
                       RoleRepository roleRepository,
                       PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public void register(UserRegistrationDto dto) {
        if (appUserRepository.findByUsername(dto.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username da ton tai");
        }

        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            throw new IllegalArgumentException("Mat khau xac nhan khong khop");
        }

        Role userRole = roleRepository.findByName("ROLE_USER")
            .orElseGet(() -> {
                Role role = new Role();
                role.setName("ROLE_USER");
                return roleRepository.save(role);
            });

        AppUser newUser = new AppUser();
        newUser.setUsername(dto.getUsername());
        newUser.setPassword(passwordEncoder.encode(dto.getPassword()));
        newUser.setEnabled(true);
        newUser.setRoles(Collections.singleton(userRole));

        appUserRepository.save(newUser);
    }
}
