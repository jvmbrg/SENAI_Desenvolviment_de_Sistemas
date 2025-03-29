package com.example.aula.atividade;

public class Gerente extends Funcionario{
    String matriculo;

    public Gerente(String nome, String email, double salario, String matriculo) {
        super(nome, email, salario);
        this.matriculo = matriculo;
    }

    public String getMatriculo() {
        return matriculo;
    }

    public void setMatriculo(String matriculo) {
        this.matriculo = matriculo;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "matriculo='" + matriculo + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
