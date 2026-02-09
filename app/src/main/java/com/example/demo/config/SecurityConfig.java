package com.example.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                // ⭐ static 리소스 허용
                .requestMatchers(
                    "/css/**",
                    "/js/**",
                    "/images/**",
                    "/webjars/**"
                ).permitAll()

                // 로그인 페이지 허용
                //.requestMatchers("/login").permitAll()
		.requestMatchers("/login", "/register").permitAll()

                // 그 외는 인증 필요?
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/", true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/login?logout")
            );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
