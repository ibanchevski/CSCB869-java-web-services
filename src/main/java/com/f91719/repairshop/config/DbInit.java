package com.f91719.repairshop.config;


import com.f91719.repairshop.data.entity.Role;
import com.f91719.repairshop.data.entity.User;
import com.f91719.repairshop.data.repository.RoleRepository;
import com.f91719.repairshop.data.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@AllArgsConstructor
public class DbInit implements CommandLineRunner {
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public DbInit() {
    }

    @Override
    public void run(String... args) throws Exception {
//        this.userRepository.deleteAll();
//        User user = new User();
//        user.setUsername("user");
//        user.setPassword(encoder.encode("pass1"));
//        user.setAccountNonExpired(true);
//        user.setAccountNonLocked(true);
//        user.setEnabled(true);
//        user.setCredentialsNonExpired(true);
//
//        User user2 = new User();
//        user2.setUsername("client");
//        user2.setPassword(encoder.encode("pass1"));
//        user2.setAccountNonExpired(true);
//        user2.setAccountNonLocked(true);
//        user2.setEnabled(true);
//        user2.setCredentialsNonExpired(true);
//
////        Set<Role> grantedAuthorities = new HashSet<>();
////        Role r = new Role();
////        r.setAuthority("CLIENT");
////        grantedAuthorities.add(r);
////
////        roleRepository.save(r);
////
////        user2.setAuthorities(grantedAuthorities);
//
//        List<User> users = Arrays.asList(user, user2);
//
//        // Save to db
//        this.userRepository.saveAll(users);
    }
}

