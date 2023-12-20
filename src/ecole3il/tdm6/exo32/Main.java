package ecole3il.tdm6.exo32;

import java.util.Random;

public class Main {
	public static<T> T auHasard(T premier, T second) {
		Random rnd = new Random();
		T res = premier;
		if(rnd.nextBoolean())
			res = second;
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Main.<String>auHasard("Face", "Pile"));
	}
	
}
