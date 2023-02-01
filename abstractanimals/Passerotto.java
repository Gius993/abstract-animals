package com.lesson.abstractanimals;

public class Passerotto extends Animale{
	@Override 
	 public void verso() {
	 System.out.println("piu piu");
	 }
	@Override
	public void mangia() {
		System.out.println("slapp pla");
	}
}
