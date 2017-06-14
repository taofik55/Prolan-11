package gene;
public class Sprint1 <T> {
    private T asd;
    
    public T getTipe (){
        return asd;
    }
    
    public void setTipe (T asd){
        this.asd = asd;
    }
    
    public static <T> void printNama(T nama) {
      System.out.println("HARGA : " +nama);
    }
    
    public static <N> void printRuang(N ruang) {
      System.out.println("ATURAN : " +ruang);
    }
    
    public static <A,B> void printMakan(A makan, B bang) {
      System.out.println("Makan : " +makan+"Bang : "+bang);
    }
}