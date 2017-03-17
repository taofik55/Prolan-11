public class OperatorMiscellaneous {

    public static void main(String[] args) {
        //operator kondisional
        int x = 10;
        System.out.println((x == 11) ? 11 : 10);

        //operator instanceof
        String nama = "Java";
        boolean hasil = nama instanceof String;
        System.out.println(hasil);

        OperatorMiscellaneous opt = new OperatorMiscellaneous();
        boolean hasil2 = opt instanceof OperatorMiscellaneous;
        System.out.println(hasil2);

    }
}