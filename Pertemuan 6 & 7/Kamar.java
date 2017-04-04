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
	
	public static void main(String[] args) {
		System.out.println("================== KOSAN KUBANGSARI VII NO 22 ==================");
		Kosan kubangsari = new Kosan();
		Kamar Mahasiswa = new Kamar("Kost Kubangsari VII No 22"); //konstrukor
			kubangsari.nama = "Kosan Hijau";
			kubangsari.alamat = "Kubangsari VII no 22";
			kubangsari.harga = 4500000;
			kubangsari.UmurIbuKost = 68;
			kubangsari.no_ruangan = 22145;
			kubangsari.jk = 'L';
		
			kubangsari.penginapan();
			kubangsari.tempat_berlindung();
		
			System.out.print("Overleading 1 parameter : ");kubangsari.methodoverloading("Kubangsari"); //Method Overloading
			System.out.print("Overleading 2 parameter : ");kubangsari.methodoverloading("Kubangsari"," Hijau"); //Method Overloading
			System.out.println("----------------------------------------------------");
		System.out.print("Nama Kosan           : ");System.out.println (kubangsari.nama);
		System.out.print("Alamat Kosan         : ");System.out.println (kubangsari.alamat);
		System.out.print("Harga Kosan Pertahun : ");System.out.println (kubangsari.harga);
		System.out.print("Umur Ibu Kosan       : ");System.out.println (kubangsari.UmurIbuKost);
		System.out.print("Jumlah Ruangan       : ");System.out.println (kubangsari.no_ruangan);
		System.out.print("Kosan Untuk          : ");System.out.println (kubangsari.jk);
		System.out.println("================================================================");
		
		System.out.println(kubangsari.harga_kosan(2, 4500000)); //pemanggilan fungsi menggunakan parameter
		
		kubangsari.nama_pengekost("Taofik Rakhman Sudrajat"); //procedure dengan parameter
		
		Kosan ksn = new Kosan(); //pemanggilan Konstruktor
		System.out.println(ksn.Nama_Konstruktor);
		System.out.println("                                ***ATRURAN KOS KOSAN***                                     ");
		Mahasiswa.penggunaanSuper();
		
		Mahasiswa.getName();
        Mahasiswa.setNama("Kost Kubangsari VII No 22");
        Mahasiswa.cetakNama();
		
		Mahasiswa.data1();
		Mahasiswa.data2();
		Mahasiswa.data3();
		
		System.out.println("============================================================================================");
    }
}