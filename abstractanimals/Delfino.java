package com.lesson.abstractanimals;

public class Delfino extends Animale implements Nuotare{
	@Override 
	 public void verso() {
	 System.out.println("Ya ya ftaghn R'lyeh");
	 }
	@Override
	public void mangia() {
		System.out.println("slap slap");
	}
	@Override
	public void nuota() {
		System.out.println("Splash");
	}
}
