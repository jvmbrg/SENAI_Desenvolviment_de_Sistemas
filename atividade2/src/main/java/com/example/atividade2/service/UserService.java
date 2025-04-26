package com.example.atividade2.service;

import com.example.atividade2.model.User;
import com.example.atividade2.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(@Valid User user){
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já existente");
        }
        return userRepository.save(user);
    }

    public List<User> listUsers(){
        try {
            return userRepository.findAll();
        }catch (RuntimeException e){
            throw new RuntimeException("A lista está vazia");
        }
    }

    public User updateUser(@Valid User newUser){
        User oldUser = userRepository.findById(newUser.getId()).orElseThrow(() ->
        new IllegalArgumentException("Usuário não encontrado"));

        alterUser(newUser, oldUser);
        return userRepository.save(oldUser);
    }

    public void deleteUser(Long id){
        User userDelete = userRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Usuário não encontrado"));

        userRepository.deleteById(userDelete.getId());
    }



    private void alterUser(User newUser, User oldUser){
        oldUser.setEmail(newUser.getEmail());
        oldUser.setPassword(newUser.getName());
        oldUser.setName(newUser.getName());
    }

}
