public class KamarAbs extends KosanAbs {
  protected int hargaKamar(int bulan){
    return bulan * 500000;
  }
  
  protected int hargaListrik(int watt){
	  return watt * 5000;
  }
}