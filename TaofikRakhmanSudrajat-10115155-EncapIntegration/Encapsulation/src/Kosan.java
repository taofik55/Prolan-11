public class Kosan {
    protected String nama;
	String nama_mahasiswa, no_kamar, lantai;
	byte tahun;
	int harga;
	public String alamat;
	public byte UmurIbuKost; 
	public short no_ruangan;
	public char jk;
	
	String Jam = "Jam 11 Malam";
	
	protected String getNama() {
        return nama;
    }
 
    protected void setNama(String nama) {
        this.nama = nama;
    }
 
    protected void cetakNama() {
        System.out.println(nama);
    }
 
    Kosan (String nama) {
		this.nama = nama;
	}
	
	public void getName () {
		System.out.println("\nNama Kosan : " +nama);
	}
	
	public void data (){
		System.out.println("Nomor Kamar   : "+no_kamar);
		System.out.println("Nama Pengekos : "+nama_mahasiswa);
		System.out.println("Lantai Kamar  : "+lantai);
		System.out.println("Lama Sewa     : "+tahun);
		System.out.println("Harga Sewa    : "+harga);
		System.out.println("==========================");
	}
	
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

	protected void methodoverloading(String nama1){ //Method Overloading
		System.out.println(nama1);
	}
		
	protected void methodoverloading(String nama2, String nama3){ //Method Overloading
		System.out.println(nama2 + nama3);
	}
		
	protected void penggunaanthis(String nama1) { //penggunaan this
		this.nama = nama1;
	}
}
