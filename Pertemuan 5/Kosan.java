public class Kosan {
    private String nama;
	String nama_mahasiswa, no_kamar, lantai;
	byte tahun;
	int harga;
	
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
}
