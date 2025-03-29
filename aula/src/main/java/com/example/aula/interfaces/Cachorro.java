package com.example.aula.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public class Cachorro extends AnimalClasseAbstrata{
    @Autowired
    public Cachorro(String nome, String raça, double peso) {
        super(nome, raça, peso);
    }
    @Override
    public String emitirSom() {
        return "Au Au Au";
    }

    @Override
    public String comer() {
        return "Comendo ração";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raça='" + raça + '\'' +
                ", peso=" + peso + "kg " +
                comer() +
                '}';
    }
}
