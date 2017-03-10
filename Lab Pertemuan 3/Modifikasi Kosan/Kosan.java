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
		
		System.out.print("Nama Kosan           : ");System.out.println (kubangsari.nama);
		System.out.print("Alamat Kosan         : ");System.out.println (kubangsari.alamat);
		System.out.print("Harga Kosan Pertahun : ");System.out.println (kubangsari.harga);
		System.out.print("Umur Ibu Kosan       : ");System.out.println (kubangsari.UmurIbuKost);
		System.out.print("Jumlah Ruangan       : ");System.out.println (kubangsari.no_ruangan);
		System.out.print("Kosan Untuk          : ");System.out.println (kubangsari.jk);
		System.out.println("================================================================");
	}
}