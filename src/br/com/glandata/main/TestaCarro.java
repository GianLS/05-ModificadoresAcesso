package br.com.glandata.main;

import br.com.glandata.model.Carro;

public class TestaCarro {

	public static void main(String[] args) {
		Carro carroA = new Carro();
		carroA.ligar();
		System.out.println(carroA.buzinar());
		carroA.desligar();
		System.out.println("Soma de 2 Números: " + carroA.somaNumeros(1, 2));
		System.out.println("Soma de 3 Números: " + carroA.somaNumeros(3, 5, 6));
	}

}
