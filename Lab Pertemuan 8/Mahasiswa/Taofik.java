public class Taofik extends Mahasiswa {
	@Override
	protected void organisasi () {
		super.organisasi();
	}
	
	@Override
	protected void kuliah (String nama) {
		System.out.println("MAHASISWA UNIKOM");
		System.out.println("Nama : "+nama);
		System.out.println("NIM  : 10115155");
		System.out.println("Merupakan Mahasiswa Yang Kewajiban Utamanya Adalah Kuliah");
	}
	
	
	@Override
	protected void lulus () {
		System.out.println("Nama : Taofik Rakhman Sudrajat");
		System.out.println("NIM  : 10115155");
		System.out.println("Selamat Anda Lulus Mata Kuliah Ini Dengan Nilai A");
	}
	
	
	@Override
	protected void tdkLulus() {
		System.out.println("Maaf Anda Tidak Lulus Mata Kuliah Ini");
	}
}