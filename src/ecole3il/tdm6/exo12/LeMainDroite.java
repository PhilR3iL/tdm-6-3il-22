package ecole3il.tdm6.exo12;

public class LeMainDroite {

	public static void main(String[] args) {
		TripletHeterogene<Exception, String, Double> gontran = new TripletHeterogene<Exception, String, Double>(
				new ArrayIndexOutOfBoundsException(), "Youpi!", 2.0);
		gontran.affiche();
	}

}
