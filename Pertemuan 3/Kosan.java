public class Kosan {
	public String nama;
	public String alamat;
	public Integer harga;
	
	public void penginapan () {
		System.out.println ("Penginapan");
	}
	
	public void tempat_berlindung () {
		System.out.println ("Tempat Berlindung");
	}

	public static void main (String[] args) {
		Kosan kubangsari = new Kosan();

		kubangsari.nama = "Kosan Hijau";
		kubangsari.alamat = "Kubangsari VII no 22";
		kubangsari.harga = 4500000;
		kubangsari.penginapan();
		kubangsari.tempat_berlindung();
		
		System.out.println (kubangsari.nama);
		System.out.println (kubangsari.alamat);
		System.out.println (kubangsari.harga);
	}
}