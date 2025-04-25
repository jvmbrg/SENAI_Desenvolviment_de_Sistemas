package com.example.atividade.controller;

import com.example.atividade.model.Cliente;
import com.example.atividade.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarClientes(){
        return new ResponseEntity<>(clienteService.listarCliente(),HttpStatus.OK);
    }

    @PostMapping("/criar")
    public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.criarCliente(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@RequestBody Cliente cliente, @PathVariable Long id){
        return new ResponseEntity<>(clienteService.atualizarCliente(cliente, id), HttpStatus.OK);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarCliente(@PathVariable Long id){
        clienteService.deletarCliente(id);
    }
}
