package com.example.aula.interfaces;

public class Main {
    public static void main(String[] args) {


        AnimalClasseAbstrata gato = new Gato("Ligeiro", "Vira lata", 6.5);
        AnimalClasseAbstrata cachorro = new Cachorro("Nega", "Vira lata", 10);
        AnimalClasseAbstrata galo = new Galo("João","Galo preto", 3);
        AnimalClasseAbstrata pato = new Pato("Patolino", "Pato branca", 4.5);

        System.out.println(cachorro);


    }
}
