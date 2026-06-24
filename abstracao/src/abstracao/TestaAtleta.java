package abstracao;

public class TestaAtleta {

	public static void main(String[] args) {

		Triatleta a1 = new Triatleta("Thiago");
		
		a1.aquecer();
		a1.correr();
		a1.nadar();
		a1.pedalar();
		a1.cansou();

	}

}
