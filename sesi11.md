# SESI 11

Buatlah Sebuah Program untuk menyimpan dan membaca data ke dalam Json Files

1) Masukkan Data
2) Lihat Data

Data yang di input adalah

```
Nama Mahasiswa :
NIM :
Jurusan :
Tempat, Tanggal Lahir :
```

```java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonDataUtil {
    private static final String FILE_PATH = "data.json";

    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private static final List<Mahasiswa> DATA = new ArrayList<>();

    public static void main(String[] args) {
        loadDataFromFile();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Masukkan Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data:");
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scanner.nextLine();

                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();

                    System.out.print("Jurusan: ");
                    String jurusan = scanner.nextLine();

                    System.out.print("Tempat Lahir: ");
                    String tempatLahir = scanner.nextLine();

                    System.out.print("Tanggal Lahir (dd/MM/yyyy): ");
                    String tanggalLahir = scanner.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, tempatLahir, tanggalLahir);
                    DATA.add(mahasiswa);
                    saveDataToFile();
                    break;

                case 2:
                    System.out.println("Data:");
                    for (Mahasiswa m : DATA) {
                        System.out.println(m);
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    private static void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            GSON.toJson(DATA, writer);
            System.out.println("Data berhasil disimpan");
        } catch (IOException e) {
            System.err.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    private static void loadDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            Mahasiswa[] mahasiswas = GSON.fromJson(reader, Mahasiswa[].class);
            for (Mahasiswa m : mahasiswas) {
                DATA.add(m);
            }
            System.out.println("Data berhasil dimuat");
        } catch (IOException e) {
            System.err.println("Gagal memuat data: " + e.getMessage());
        }
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String tempatLahir;
    private String tanggalLahir;

    public Mahasiswa(String nama, String nim, String jurusan, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", tempatLahir='" + tempatLahir + '\'' +
                ", tanggalLahir='" + tanggalLahir + '\'' +
                '}';
    }
}
```

## Output

```
Menu:
1. Masukkan Data
2. Lihat Data
3. Keluar
1
Masukkan Data:
Nama Mahasiswa: John Doe
NIM: 1234567890
Jurusan: Teknik Informatika
Tempat Lahir: Jakarta
Tanggal Lahir (dd/MM/yyyy): 01/01/2000
Data berhasil disimpan
```