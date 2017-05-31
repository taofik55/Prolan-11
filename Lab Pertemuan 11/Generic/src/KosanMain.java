import java.util.Scanner;
public class KosanMain {	
    public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println("=====================================");
        System.out.println("              MENU UTAMA             ");
        System.out.println("1. Informasi Kosan");
        System.out.println("2. Aturan Kos Kosan dan Penghuni Kos");
        System.out.println("3. Harga Kosan dan Listrik");
        System.out.println("4. Informasi Kamar Taofik");
        System.out.println("5. Data Diri Taofik");
        System.out.println("6. Denda Listrik");
        System.out.println("7. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4/5/6/7] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");

        switch (pilih) {
            case 1:{
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
		
			System.out.print("Overleading 1 parameter : ");kubangsari.methodoverloading("Kubangsari"); //Method Overloading
			System.out.print("Overleading 2 parameter : ");kubangsari.methodoverloading("Kubangsari"," Hijau"); //Method Overloading
			System.out.println("----------------------------------------------------------------");
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
                break;
            }
            case 2:{
                System.out.println("                                ***ATURAN KOS KOSAN***                                     ");
                Kamar Mahasiswa = new Kamar("Kost Kubangsari VII No 22"); //konstrukor
		Mahasiswa.penggunaanSuper();
		
		Mahasiswa.getName();
                Mahasiswa.setNama("Kost Kubangsari VII No 22");
                Mahasiswa.cetakNama();
		
		Mahasiswa.data1();
		Mahasiswa.data2();
		Mahasiswa.data3();
                break;
            }
             case 3:{
                System.out.println("============================================================================================");
		System.out.println("===================================== ABSTRACT PROGRAM =====================================");
		
		KamarAbs baru = new KamarAbs();
		System.out.println("Harga Kosan   : "+baru.hargaKamar(12));
		System.out.println("Harga Listrik : "+baru.hargaListrik(50));
                break;
             }
            case 4:{
                System.out.println("============================================================================================");
		System.out.println("================================== ENCAPSULATION PROGRAM ===================================");
                
                Encap enc = new Encap();
                enc.getAlamat();
                enc.getHarga();
                enc.getJk();
                enc.getLantai();
                enc.getNama();
                enc.getNo_kamar();
                enc.getNama_mahasiswa();
                enc.getNo_ruangan();
                enc.getTahun();
                enc.getUmurIbuKost();
                
                enc.setAlamat("KUBANGSARI VII NO 22");
                enc.setHarga(4500000);
                enc.setJk('L');
                enc.setLantai("3");
                enc.setNama("KOSAN HIJAU");
                enc.setNama_mahasiswa("TAOFIK");
                enc.setNo_kamar("24");
                enc.setNo_ruangan((short)32);
                enc.setTahun((byte)3);
                enc.setUmurIbuKost((byte)78);
                
                System.out.print("ALAMAT KOSAN                 : ");enc.cetakAlamat();
                System.out.print("HARGA KOSAN                  : ");enc.cetakHarga();
                System.out.print("JENIS KELAMIN PENGHUNI KOSAN : ");enc.cetakJK();
                System.out.print("LANTAI KOSAN                 : ");enc.cetakLantai();
                System.out.print("NAMA KOSAN                   : ");enc.cetakNama();
                System.out.print("NAMA PENGHUNI KOSAN          : ");enc.cetakNamaMahasiswa();
                System.out.print("NO KAMAR                     : ");enc.cetakNoKamar();
                System.out.print("NO RUANGAN                   : ");enc.cetakNoRuangan();
                System.out.print("SEWA TAHUN                   : ");enc.cetakTahun();
                System.out.print("UMUR IBU KOSAN               : ");enc.cetakUmurIbuKost();
                break;
            }
            case 5 : {
                System.out.println("============================================================================================");
		System.out.println("==================================== INTERFACE PROGRAM =====================================");
                
                Taofik tfk = new Taofik("Taofik Rakhman Sudrajat", "10115155", "085795573339");
                System.out.println();
                System.out.println("DATA TAOFIK");
                System.out.println("---------------------------");
                System.out.println("Nama    : "+tfk.getName());
                System.out.println("NIM     : "+tfk.getNim());
                System.out.println("Telepon : "+tfk.getPhone());
                System.out.println("Kampus  : "+tfk.getKAMPUS());
                System.out.println("Alamat  : "+tfk.getALAMAT());
                System.out.println("---------------------------");
                System.out.println();
                break;
            }
            case 6 : {
                System.out.println("============================================================================================");
		System.out.println("===================================== GENERIC PROGRAM ======================================");
                System.out.println("************************************** DENDA LISTRIK ***************************************");
                Kubangsari <String> kubangString = new Kubangsari <> ();
                kubangString.setTipe("Jika Ada Anak Kosan Yang Belum Bayar Listrik Sampai Tanggal 18, Maka Ada Denda");
                System.out.println(kubangString.getTipe());
                
                Kubangsari <Integer> kubangInt = new Kubangsari <> ();
                System.out.println("Daftar Anak Kos Yang Kena Denda : ");
                System.out.print("Akbar Sebesar : ");
                kubangInt.setTipe(100000);
                System.out.println(kubangInt.getTipe());
                
                Kubangsari <Integer> kubangShort = new Kubangsari <> ();
                System.out.print("Jumlah Watt Yang Dipakai : ");
                kubangShort.setTipe(150);
                System.out.println(kubangShort.getTipe());
                break;
            }
            case 7:{
                System.exit(0);
            }
            default :{
                System.out.println("Warning !! Pilihan tidak tersedia !! ");
            }
                break;
        }
        System.out.println("================================================================");
        System.out.print("Apakah Anda Ingin Mengulang (y/t)? ");
            ulg = input.next();
        }
    }
}