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
    
    public static <N> void printNama(N nama) {
      System.out.println("ATURAN : " +nama);
    }
    
    public void methodKonkrit(){
      System.out.println("METHOD GENERIC");
    }
}
