public class KosanMain {	
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
		System.out.println("===================================== ABSTRACT PROGRAM =====================================");
		
		KamarAbs baru = new KamarAbs();
		System.out.println("Harga Kosan   : "+baru.hargaKamar(12));
		System.out.println("Harga Listrik : "+baru.hargaListrik(50));
    }
}