package com.example.aula.interfaces;

public class Galo extends AnimalClasseAbstrata{
    public Galo(String nome, String raça, double peso) {
        super(nome, raça, peso);
    }

    @Override
    public String emitirSom() {
        return "Có Có Có";
    }

    @Override
    public String comer() {
        return "Comendo milho";
    }

    @Override
    public String toString() {
        return "Galo{" +
                "nome='" + nome + '\'' +
                ", raça='" + raça + '\'' +
                ", peso=" + peso + " "+comer() +
                '}';
    }
}
