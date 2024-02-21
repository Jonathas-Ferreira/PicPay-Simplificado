package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class UserRepository implements JpaRepository<User, Long>{
    Optional<User> findUserByDocument(String document);

    Optional<User> findUserByDocument(Long id);
}
