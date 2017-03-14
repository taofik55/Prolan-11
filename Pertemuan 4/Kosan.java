public class Kosan {
	public String nama;
	public String alamat;
	public byte UmurIbuKost; 
	public Integer harga;
	public short no_ruangan;
	public char jk;
	
		public void penginapan () {
			System.out.println ("Penginapan");
		}
	
		public void tempat_berlindung () {
			System.out.println ("Tempat Berlindung");
		}
		
		public int harga_kosan (int tahun, int harga) { //method function pengembalian nilai
			return tahun * harga;
		}
	
		public void nama_pengekost (String nama_pengekost){ //method prosedur tanpa mengembalikan nilai dengan parameter
			System.out.println(nama_pengekost);
		}
		
		String Nama_Konstruktor;
			Kosan() { //konstruktor
				Nama_Konstruktor = "KOSAN HIJAU KUBANGSARI";
			}

		private void methodoverloading(String nama1){ //Method Overloading
			System.out.println(nama1);
		}
		
		private void methodoverloading(String nama2, String nama3){ //Method Overloading
			System.out.println(nama2 + nama3);
		}
		
		private void penggunaanthis(String nama1) { //penggunaan this
			this.nama = nama1;
		}
		
	public static void main (String[] args) {
	    System.out.println("================== KOSAN KUBANGSARI VII NO 22 ==================");
		Kosan kubangsari = new Kosan();
			kubangsari.nama = "Kosan Hijau";
			kubangsari.alamat = "Kubangsari VII no 22";
			kubangsari.harga = 4500000;
			kubangsari.UmurIbuKost = 68;
			kubangsari.no_ruangan = 22145;
			kubangsari.jk = 'L';
		
			kubangsari.penginapan();
			kubangsari.tempat_berlindung();
		
			kubangsari.methodoverloading("Kubangsari"); //Method Overloading
			kubangsari.methodoverloading("Kubangsari"," Hijau"); //Method Overloading
		
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
	}
}