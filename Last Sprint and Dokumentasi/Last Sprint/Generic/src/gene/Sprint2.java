package gene;
public class Sprint2 <T> {
    private T asd;
    
    public T getTipe (){
        return asd;
    }
    
    public void setTipe (T asd){
        this.asd = asd;
    }
    
    public static <T> void printNilai(T nilai) {
      System.out.println("HARGA : " +nilai);
    }
    
    public static <N> void printAturan(N aturan) {
      System.out.println("ATURAN : " +aturan);
    }
    
    public void methodKonkrit(){
      System.out.println("Harap Dibayar Sebelum Tanggal 18");
    }
}
