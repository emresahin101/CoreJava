package practices.day12practice;

public class C03 {
    int fiyat = 300000;
    int yil = 2023;
   static String marka = "Opel";



    public static void main(String[] args) {

        C03 obj1 = new C03();
        C03 obj2 = new C03();

        System.out.println(obj1.fiyat);

        System.out.println(obj1.yil-3);

        System.out.println(obj1.marka.replace("Opel","Mercedes"));







    }




}
