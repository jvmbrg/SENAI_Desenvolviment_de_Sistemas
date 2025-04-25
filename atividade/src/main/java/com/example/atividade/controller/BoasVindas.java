package com.example.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/boas-vindas")
@RestController
public class BoasVindas {

    @GetMapping
    public String boasVindas(){
       return "seja bem vindo!";
    }
}
