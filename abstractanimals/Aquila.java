package com.lesson.abstractanimals;

public class Aquila extends Animale implements Volare{
	@Override 
	 public void verso() {
	 System.out.println("Ya ya ");
	 }
	@Override
	public void mangia() {
		System.out.println(" slap");
	}
	@Override
	public void vola() {
		System.out.println("shaf");	
	}
	

}
