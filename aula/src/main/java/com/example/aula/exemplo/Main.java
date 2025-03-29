package com.example.aula.exemplo;

public class Main {

	public static void main(String[] args) {


		Pessoa fisica = new Fisica("João Vítor", "(XX)XXXXX-XXXX", "XXX.XXX.XXX-XX",
				"XX.XXX.XXX-XX","XX/XX/XXXX");

		Pessoa juridica = new Juridica(null, "(XX)XXXX-XXXX","",
				"XXXXXXXXXXX");

		System.out.println(fisica);
		System.out.println();
		System.out.println(juridica);
	}

}
