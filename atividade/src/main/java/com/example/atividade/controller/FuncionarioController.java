package com.example.atividade.controller;

import com.example.atividade.model.Cliente;
import com.example.atividade.model.Funcionario;
import com.example.atividade.service.ClienteService;
import com.example.atividade.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    FuncionarioService funcionarioService;
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Funcionario>> listarFuncionarios(){
        return new ResponseEntity<>(funcionarioService.listarFuncionario(), HttpStatus.OK);
    }

    @PostMapping("/criar")
    public ResponseEntity<Funcionario> adicionarFuncionario(@RequestBody Funcionario funcionario){
        return new ResponseEntity<>(funcionarioService.criarFuncionario(funcionario), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Funcionario> atualizarFuncionario(@RequestBody Funcionario funcionario, @PathVariable Long id){
        return new ResponseEntity<>(funcionarioService.atualizarFuncionario(funcionario, id), HttpStatus.OK);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarFuncionario(@PathVariable Long id){
        funcionarioService.deletarFuncionario(id);
    }
}
