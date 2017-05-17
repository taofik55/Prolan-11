public class Kamar extends Kosan {
	
	String Jam = "24 Jam";
	
    @Override
    public void cetakNama() {
        System.out.println("============================ " + super.getNama() + " ====================================="); //Penggunaan Super Dan Override
    }
	
	public Kamar (String nama) { //Penggunaan Super Pada Konstruktor
		super(nama);
		System.out.println("KONSTRUKTOR YANG DIOVERRIDE");
	}
	
	public void penggunaanSuper() {
      System.out.println("**Menurut Ibu Kos Harus Sudah Ada di Kamar " + super.Jam); //Penggunaan Super Pada Atribut
	  System.out.println("**Namun Kenyataannya Bisa Bebas Keluar Masuk " + Jam); //Penggunaan Super Pada Atribut
    }
	
	public void data1 () { //Penggunaan Super Pada Method
		no_kamar = "01";
		nama_mahasiswa = "Taofik Rakhman Sudrajat";
		lantai = "Bawah";
		tahun = 2;
		harga = tahun * 4500000;
		super.data();
	}
	
	public void data2 () { //Penggunaan Super Pada Method
		no_kamar = "02";
		nama_mahasiswa = "Arum Agam Nugraha";
		lantai = "Atas";
		tahun = 1;
		harga = tahun * 4500000;
		super.data();
	}
	
	public void data3 () { //Penggunaan Super Pada Method
		no_kamar = "03";
		nama_mahasiswa = "Muhammad Risal Adam";
		lantai = "Bawah";
		tahun = 5;
		harga = tahun * 4500000;
		super.data();
	}
}