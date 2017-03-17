public class OperatorLogika {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        
        byte xx = 1;
        byte yy = 2;
        
        System.out.println("Hasil X dan Y" + (x && y));
        System.out.println("Hasil X atau Y" + (x || y));
        System.out.println("Hasil not X" + (!x));
        
        System.out.println((xx > yy) && (yy == xx));
    }
}