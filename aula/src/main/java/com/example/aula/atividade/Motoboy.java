package com.example.aula.atividade;

public class Motoboy extends Funcionario{
    String cnh;

    public Motoboy(String nome, String email, double salario, String cnh) {
        super(nome, email, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "cnh='" + cnh + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
