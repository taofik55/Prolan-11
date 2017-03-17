import java.util.Scanner;
  
public class Kasus {
  public static Scanner input = new Scanner(System.in); //biar bisa input data
 
  public static void main(String[] args) {
    float ip_mahasiswa = 0, jumlah_ip_mahasiswa = 0, rata_rata = 0;
    int jumlah_mahasiswa = 0, mahasiswa_lulus = 0, mahasiswa_tidak_lulus = 0;
    boolean exit = false;

    System.out.println("==================== KASUS IP MAHASISWA ============================");
    System.out.println("-- Menghitung Data IP Mahasiswa Lulus, Tidak Lulus, dan Rata-rata --");
    System.out.println("====================================================================\n");
    do {  //pengulangan
      System.out.print("Masukkan IP Mahasiswa : ");
      ip_mahasiswa = input.nextFloat();
      if(isWithinRange(ip_mahasiswa, 0f, 4f) == 1) { //pemanggilan fungsi dengan langsung memasukkan parameter
         jumlah_mahasiswa++; //mahasiswa yang memiliki IP dari 0 sampai 4 akan dimasukkan ke keluaran Jumlah Mahasiswa
         if(isWithinRange(ip_mahasiswa, 2.75f, 4f) == 1) { //pemanggilan fungsi dengan langsung memasukkan parameter
           mahasiswa_lulus++; //mahasiswa yang memiliki IP dari 2,75 sampai 4 akan dimasukkan ke keluaran Jumlah Mahasiswa yang Lulus
         }
         else {
           mahasiswa_tidak_lulus++; //mahasiswa yang memiliki IP dari 0 sampai <2,75 akan dimasukkan ke keluaran Jumlah Mahasiswa yang Tidak Lulus
         }
         jumlah_ip_mahasiswa += ip_mahasiswa; //jumlah ip mahasiswa adalah akumulasi dari semua ip mahasiswa yang masuk
       }
       else if (ip_mahasiswa == -999) { //jika user memasukkan angka -999 maka inputan berhenti, dan muncul output dari program
         exit = true;
       }
    } while (!exit);
 
    System.out.println("\n========================= OUTPUT PROGRAM ===========================\n");
    if (jumlah_mahasiswa > 0) { //jika ada data lebih dari 0 maka output berupa data IP mahasiswa berjalan
      rata_rata = jumlah_ip_mahasiswa / jumlah_mahasiswa;
      System.out.println("Jumlah Mahasiswa                    : " + jumlah_mahasiswa);
      System.out.println("Jumlah Mahasiswa Lulus (IP >= 2.75) : " + mahasiswa_lulus);
      System.out.println("Jumlah Mahasiswa Tidak Lulus        : " + mahasiswa_tidak_lulus);
      System.out.println("Rata-Rata IP Mahasiswa              : " + rata_rata);
    }
    else { //output dengan data 0
      System.out.println("TIDAK ADA DATA");
    }
      System.out.println("\n====================================================================\n");
  }
  
  public static int isWithinRange(float x, float min, float max) { //fungsi wajib, untuk menentukan range nilai mahasiswa
    byte result = 1;
      if (x < min || x > max) {
        result = 0;
      }
      return result;
  }
}