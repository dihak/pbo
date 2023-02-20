# SESI 6 - TUGAS ENCAPSULATION

Buatlah simple program untuk menghitung Bangun Ruang, dengan
menerapkan konsep abstract, interface, overloading dan overrding serta
package.

```java
public interface BangunRuang {
    double hitungVolume();
    double hitungLuasPermukaan();
}

public abstract class BangunRuang3D implements BangunRuang {
    protected String nama;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    
    public BangunRuang3D(String nama, double panjang, double lebar, double tinggi) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
    public String getNama() {
        return nama;
    }
}

public class Kubus extends BangunRuang3D {
    public Kubus(double sisi) {
        super("Kubus", sisi, sisi, sisi);
    }
}

public class Balok extends BangunRuang3D {
    public Balok(double panjang, double lebar, double tinggi) {
        super("Balok", panjang, lebar, tinggi);
    }
}

public class Bola implements BangunRuang {
    private String nama = "Bola";
    private double jariJari;
    
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
    
    public String getNama() {
        return nama;
    }
}

public class Main {
    public static void main(String[] args) {
        BangunRuang[] bangunRuang = new BangunRuang[3];
        bangunRuang[0] = new Kubus(5);
        bangunRuang[1] = new Balok(2, 3, 4);
        bangunRuang[2] = new Bola(5);
        
        for (BangunRuang bangunRuang1 : bangunRuang) {
            System.out.println("Nama: " + bangunRuang1.getNama());
            System.out.println("Volume: " + bangunRuang1.hitungVolume());
            System.out.println("Luas Permukaan: " + bangunRuang1.hitungLuasPermukaan());
            System.out.println();
        }
    }
}
```

## Output

```text
Nama: Kubus
Volume: 125.0
Luas Permukaan: 150.0

Nama: Balok
Volume: 24.0
Luas Permukaan: 52.0

Nama: Bola
Volume: 523.5987755982989
Luas Permukaan: 314.1592653589793
```