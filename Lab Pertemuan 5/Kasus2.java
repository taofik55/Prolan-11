import java.util.Scanner;


public class Kasus2 {
  public static Scanner input = new Scanner(System.in);
  
  int N, i=1, data, kemunculan;
  char Pil;
  
  
  public static void main(String[] args) {
    Kasus2 kasus = new Kasus2();
	System.out.println("====================== KASUS NILAI MAX MIN ============================");
    System.out.println("-- Menghitung Data Nilai Maximum dan Minimum, Mencari Jumlahnya Juga --");
    System.out.println("=======================================================================\n");
	
	System.out.print("Masukkan Banyak Nilai : ");
    int N = input.nextInt();
	int min = 10000000;
	int max = -10000000;
	
	System.out.print("Masukkan Pilihan A/B (A = Min / B = Max) : ");
    char Pil = input.next().charAt(0);
		
  if((Pil == 'A') || (Pil == 'a')) { 
		kasus.pilihanA(N, min, Pil);
      }
      else if ((Pil == 'B') || (Pil == 'b')) {
		kasus.pilihanB(N, max, Pil);
      }
	
  }
  
  public void pilihanA (int N, int min, char Pil) {
	int kemunculan = 0;
	for(int i=1; i<=N; i++) {  //pengulangan
	  System.out.print("Masukkan Nilai ke "+i);System.out.print(" : ");
	  int data = input.nextInt();
      if (i == 1) {
	    min = data;
	  }
      if (min > data) {
	    min = data;
		kemunculan = 1;
	  }
	  else if (min == data) {
		kemunculan++;
	  }
	}
	
	System.out.println("================================================");
	System.out.println("Jumlah Data          : "+N);
	System.out.println("Pilihan              : "+Pil);
	System.out.println("Nilai Minimum        : "+min);
	System.out.println("Jumlah Nilai Minimum : "+kemunculan);
  }

  public void pilihanB (int N, int max, char Pil) {
  int kemunculan = 0;
    for(int i=1; i<=N; i++) {  //pengulangan
	  System.out.print("Masukkan Nilai ke "+i);System.out.print(" : ");
	  int data = input.nextInt();
      if (i == 1) {
	    max = data;
	  }
      if (max < data) {
	    max = data;
		kemunculan = 1;
	  }
	  else if (max == data) {
		kemunculan++;
	  }
    }
	System.out.println("================================================");
	System.out.println("Jumlah Data          : "+N);
	System.out.println("Pilihan              : "+Pil);
	System.out.println("Nilai Maximum        : "+max);
	System.out.println("Jumlah Nilai Maximum : "+kemunculan);
  }
}