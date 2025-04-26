package com.example.atividade2.controller;

import com.example.atividade2.model.User;
import com.example.atividade2.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> addUser(@Valid @RequestBody User user){
        userService.addUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem","Usuário cadastrado com sucesso."));
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> listUser(){
        return new ResponseEntity<>(userService.listUsers(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateUser(@Valid @RequestBody User user, @PathVariable Long id){
        userService.updateUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem","Usuário atualizado com sucesso."));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem","Usuário excluído com sucesso."));
    }
}
