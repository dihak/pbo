import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan jari-jari: ");
		double jariJari = scanner.nextDouble();

		System.out.print("Masukkan tinggi: ");
		double tinggi = scanner.nextDouble();

		Tabung tabung = new Tabung(jariJari, tinggi);
		System.out.println("Jari-jari: " + tabung.jariJari);
		System.out.println("Tinggi: " + tabung.tinggi);
		System.out.println("Volume: " + tabung.getVolume());
	}
}
