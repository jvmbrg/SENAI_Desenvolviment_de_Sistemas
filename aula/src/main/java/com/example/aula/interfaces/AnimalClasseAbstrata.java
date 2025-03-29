package com.example.aula.interfaces;

public abstract class AnimalClasseAbstrata implements AnimalInterface{
    protected String nome;
    protected String raça;
    protected double peso;
    protected String ação;
    public AnimalClasseAbstrata(String nome, String raça, double peso) {
        this.nome = nome;
        this.raça = raça;
        this.peso = peso;
        this.ação = comer();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
