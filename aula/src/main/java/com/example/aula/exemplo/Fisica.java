package com.example.aula.exemplo;

public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String dataDeNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, String dataDeNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Fisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
