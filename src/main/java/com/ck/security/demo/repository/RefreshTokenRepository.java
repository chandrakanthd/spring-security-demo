package com.ck.security.demo.repository;

import java.util.Optional;

import com.ck.security.demo.entity.RefreshToken;
import com.ck.security.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    @Override
    Optional<RefreshToken> findById(Long id);

    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);

}
