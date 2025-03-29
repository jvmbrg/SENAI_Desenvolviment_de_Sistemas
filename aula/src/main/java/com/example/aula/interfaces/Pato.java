package com.example.aula.interfaces;

public class Pato extends AnimalClasseAbstrata{
    public Pato(String nome, String raça, double peso) {
        super(nome, raça, peso);
    }

    @Override
    public String emitirSom() {
        return "Quá Quá Quá";
    }

    @Override
    public String comer() {
        return "Comendo cereais";
    }

    @Override
    public String toString() {
        return "Pato{" +
                "nome='" + nome + '\'' +
                ", raça='" + raça + '\'' +
                ", peso=" + peso +
                '}';
    }
}
