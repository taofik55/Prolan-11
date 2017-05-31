public class KamarAbs extends KosanAbs {
  @Override
  protected int hargaKamar(int bulan){
    return bulan * 500000;
  }
  
  @Override
  protected int hargaListrik(int watt){
	  return watt * 5000;
  }
}