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
      System.out.println("NAMA : " +nama);
    }
    
    public static <N> void printRuang(N ruang) {
      System.out.println("RUANG : " +ruang);
    }
    
    public static <A,B> void printJadwal(A jadwal, B libur) {
      System.out.println("JADWAL PIKET : " +jadwal+"  LIBUR : "+libur);
    }
}