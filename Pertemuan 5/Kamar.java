public class Kamar extends Kosan {
	
	String Jam = "24 Jam";
	
    @Override
    public void cetakNama() {
        System.out.print("============================ " + super.getNama());System.out.println(" ====================================="); //Penggunaan Super Pada Konstruktor
    }
	
	public void penggunaanSuper() {
      System.out.println("\n**Menurut Ibu Kos Harus Sudah Ada di Kamar " + super.Jam); //Penggunaan Super Pada Atribut
	  System.out.println("**Namun Kenyataannya Bisa Bebas Keluar Masuk " + Jam); //Penggunaan Super Pada Atribut
    }
	
	public void data1 () { //Penggunaan Super Pada Method
		no_kamar = "01";
		nama_mahasiswa = "Taofik Rakhman Sudrajat";
		lantai = "Bawah";
		tahun = 3;
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
	
	public static void main(String[] args) {
        Kamar Mahasiswa = new Kamar();
        Mahasiswa.setNama("Kost Kubangsari VII No 22");
        Mahasiswa.cetakNama();
		
		Mahasiswa.data1();
		Mahasiswa.data2();
		Mahasiswa.data3();
		
		System.out.println("============================================================================================");
		System.out.println("                                   ATRURAN KOS KOSAN                                        ");
		
		Mahasiswa.penggunaanSuper();
    }
}