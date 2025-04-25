package com.example.atividade.controller;

import com.example.atividade.model.Usuario;
import com.example.atividade.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return new ResponseEntity<>(usuarioService.listarUsuario(), HttpStatus.OK);
    }


    @PostMapping("/criar")
    public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.criarUsuario(usuario), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
        return new ResponseEntity<>(usuarioService.atualizarUsuario(usuario, id), HttpStatus.OK);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
    }
}
