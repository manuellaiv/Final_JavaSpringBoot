package com.example.FinalSpringboot.repository;

import com.example.FinalSpringboot.entity.Role;
import com.example.FinalSpringboot.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
