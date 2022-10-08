# Soal 3

```java
public class Komputer { // 1
	// 2
	String jenis_komputer;
	private String merk;

	// 3
	public void setDataKomputer(String jenis, String merk) {
		jenis_komputer = jenis;
		this.merk = merk
	}

	// 4
	public String getJenis() {
		return jenis_komputer;
	}

	// 5
	public String getMerk() {
		return merk;
	}

	public static void main(String[] args) {
		Komputer komputer = new Komputer(); // 6
		komputer.setDataKomputer("LAPTOP", "MACBOOK"); // 7
		System.out.println(komputer.getJenis()); // 8
		System.out.println(komputer.getMerk()); // 9
	}
}
```

1. Nama class nya adalah "Komputer"

2. Komputer memiliki 2 properti yaitu "jenis_komputer" dan "merk"

3. Komputer memiliki method setter setDataKomputer yang digunakan untuk mengisi nilai dari properti "jenis_komputer" dan "merk"

4. Komputer memiliki method getter getJenis untuk mengambil nilai dari properti "jenis_komputer"

5. Komputer memiliki method getter getMerk untuk mengambil nilai dari properti "merk"

6. Meng-inisialisasi object dari class Komputer dengan nama "mykom"

7. memanggil method setDataKomputer pada object "mykom" dengan 2 parameter "LAPTOP" dan "MACBOOK", parameter pertama untuk properti "jenis_komputer" dan parameter kedua untuk properti "merk"

8. Melakukan print pada method getJenis pada object "mykom"

9. Melakukan print pada method getMerk pada object "mykom"
