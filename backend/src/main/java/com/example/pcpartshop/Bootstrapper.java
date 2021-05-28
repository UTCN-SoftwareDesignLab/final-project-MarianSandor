package com.example.pcpartshop;

import com.example.pcpartshop.dto.request.SignupRequest;
import com.example.pcpartshop.model.ERole;
import com.example.pcpartshop.model.Role;
import com.example.pcpartshop.repository.RoleRepository;
import com.example.pcpartshop.repository.UserRepository;
import com.example.pcpartshop.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class Bootstrapper implements ApplicationListener<ApplicationReadyEvent> {

    private final RoleRepository roleRepository;

    private final UserRepository userRepository;

    private final AuthService authService;

    @Value("${app.bootstrap}")
    private Boolean bootstrap;

    @SneakyThrows
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if (bootstrap) {
            Runtime.getRuntime().exec("python bootstrapper.py");

            userRepository.deleteAll();
            roleRepository.deleteAll();

            for (ERole value : ERole.values()) {
                roleRepository.save(
                        Role.builder()
                                .name(value)
                                .build()
                );
            }
            authService.register(SignupRequest.builder()
                    .email("marian@email.com")
                    .username("marian")
                    .password("123")
                    .roles(Set.of("ADMIN"))
                    .build());
            authService.register(SignupRequest.builder()
                    .email("marianS@email.com")
                    .username("marianE")
                    .password("321")
                    .roles(Set.of("EMPLOYEE"))
                    .build());
            authService.register(SignupRequest.builder()
                    .email("marianD@email.com")
                    .username("marianC")
                    .password("321")
                    .roles(Set.of("CUSTOMER"))
                    .build());
        }
    }
}