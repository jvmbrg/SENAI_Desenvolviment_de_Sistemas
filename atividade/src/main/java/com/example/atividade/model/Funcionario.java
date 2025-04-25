package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(nullable = false)
    private String nome;

    @JoinColumn(unique = true, nullable = false)
    private String cpf;

    @JoinColumn(unique = true)
    private String rg;

    @JoinColumn(unique = true, nullable = false)
    private String matricula;

    @JoinColumn(nullable = false)
    private String dataDeNascimento;

    @JoinColumn(nullable = false)
    private double salario = 2000;

    @JoinColumn(unique = true, nullable = false)
    private String telefone;

    @JoinColumn(unique = true)
    private String email;

    public Funcionario(Long id, String nome, String cpf, String rg, String dataDeNascimento, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public Funcionario(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
