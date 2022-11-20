class Tabung {
	double jariJari;

	double tinggi;

	public Tabung(double jariJari, double tinggi) {
		this.jariJari = jariJari;
		this.tinggi = tinggi;
	}

	public double getVolume() {
		return Math.PI * jariJari * jariJari * tinggi;
	}
}

public class Main {
	public static void main(String[] args) {
		Tabung tabung = new Tabung(10, 20);
		System.out.println("Jari-jari: " + tabung.jariJari);
		System.out.println("Tinggi: " + tabung.tinggi);
		System.out.println("Volume: " + tabung.getVolume());
	}
}
