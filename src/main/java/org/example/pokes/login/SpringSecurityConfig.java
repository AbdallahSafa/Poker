package org.example.pokes.login;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfig {

//    @Bean
//    public InMemoryUserDetailsManager createUserDetailsManager() {
//        String username = "safa";
//        String password = "safa";
//
//        UserDetails user = createUser("safa", "safa");
//        return new InMemoryUserDetailsManager(user);
//    }
//
//    private UserDetails createUser(String username, String password) {
//        Function<String,String> passwordEncoder = input -> passwordEncoder().encode(input);
//        UserDetails user = User.builder().passwordEncoder(passwordEncoder)
//                .username(username)
//                .password(password)
//                .roles("USER","ADMIN")
//                .build();
//        return user;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .anyRequest()
                .authenticated());
        http.httpBasic(Customizer.withDefaults());
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.csrf(csrf -> csrf.disable());
        //http.headers().frameOptions().disable();
        return http.build();

    }





}
