package com.ck.security.demo.repository;

import java.util.Optional;

import com.ck.security.demo.entity.ERole;
import com.ck.security.demo.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
