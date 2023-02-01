package com.lesson.abstractanimals;

public class Main {
	public static void main(String[] args) {
		Delfino delfino = new Delfino();
		Cane cane = new Cane();
		Aquila aquila = new Aquila();
		
		System.out.println("delfino");
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		
		faiNuotare(delfino);		
		
		System.out.println("cane");
		cane.dormi();
		cane.mangia();
		cane.verso();
		
		System.out.println("aquila");
		aquila.dormi();
		aquila.mangia();
		aquila.verso();
		
		faiVolare(aquila);
	}
	public static void faiNuotare(Nuotare animaleNuota) {
		animaleNuota.nuota();
	}
	public static void faiVolare(Volare animaleVola) {
		animaleVola.vola();
	}
}
