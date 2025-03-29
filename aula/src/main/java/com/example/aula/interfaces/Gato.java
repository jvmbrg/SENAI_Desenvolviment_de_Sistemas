package com.example.aula.interfaces;

public class Gato extends AnimalClasseAbstrata{
    public Gato(String nome, String raça, double peso) {
        super(nome, raça, peso);
    }
    @Override
    public String emitirSom() {
        return "Miau Miau Miau";
    }

    @Override
    public String comer() {
        return "Comendo ração";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", raça='" + raça + '\'' +
                ", peso=" + peso + "kg " +comer() +
                '}';
    }
}
