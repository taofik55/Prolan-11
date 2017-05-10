import java.util.*;
import java.io.*;

public class CalculatorMain {
	public static void main(String[] args) {
		double operan1, operan2;
		Spesifikasi cal = new Spesifikasi();
		
		Scanner input = new Scanner (System.in);
		System.out.println("===================== PERHITUNGAN NILAI ===================");
		System.out.println("===========================================================");
		System.out.print("Masukkan Nilai Operasi Pertama : ");operan1 = input.nextDouble();
		System.out.print("Masukkan Nilai Operasi Kedua   : ");operan2 = input.nextDouble();
		System.out.println("===========================================================");
		System.out.println("Hasil Pertambahan Adalah : "+cal.hasilTambah(operan1, operan2));
		System.out.println("Hasil Pengurangan Adalah : "+cal.hasilKurang(operan1, operan2));
		System.out.println("Hasil Pertambahan Adalah : "+cal.hasilKali(operan1, operan2));
		System.out.println("Hasil Pertambahan Adalah : "+cal.hasilBagi(operan1, operan2));
	}
}