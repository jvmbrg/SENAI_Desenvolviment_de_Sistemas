package com.example.aula.atividade;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("XXXX XXXXX", "XXXXXXXXXXXX@XXXX.XXX",2300,
                "XXXXXXXXX");

        Funcionario motoboy = new Motoboy("XXXX XXXXX", "XXXXXXXXXXXX@XXXX.XXX", 2300,
                "XXXXXX-X");

        System.out.println(motoboy);
        System.out.println(gerente);

    }
}
