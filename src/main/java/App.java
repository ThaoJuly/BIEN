public class App {

    static String global = "Thao test";

    public static void main(String[] args) {
//       String str;
//       str = "Data type";
        String str = "Data type 1";
        System.out.println(str);
        System.out.println(global);
        sum();
        final double PI =3.14;
        System.out.println(PI);
        System.out.println("Name\tDOB");
        short s = 10;
        int i = 28;
        long l =100L;

        float f = 3.1f;
        double d =3.5;

        char c= 'a';
        char c2 = '5';
        char c3 = 65; // 'A'

        boolean b1 = true;
        boolean b2 = false;

        Integer ref_i = 100;

        int a = 100;
        int b = 200;
        System.out.println("a = " + a + ", b = " +b);
    }
    static  void swap(int a, int b){
       int tmp = a;
        a = b;
        b = tmp;
   }
   public static void sum(){
        System.out.println(global);
    }
}
