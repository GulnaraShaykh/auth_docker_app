package com.example.authservice.repository;

import com.example.authservice.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String userName, String password) {
        // Проверка фиксированных данных пользователя
        if ("exampleUser".equals(userName) && "examplePassword".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE);
        }
        return Collections.emptyList();
    }

}
