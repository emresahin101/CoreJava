package practices.day16practice;

public class Corsa extends Opel{
    protected String hiz="Corsa max 200 km hiz yapar";
    protected  String yakit="Corsa benzinli veya elektriklidir";
    protected String model="Corsa";
    protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECİ MOTOR KULLANIR");
    }
    protected void yakitTuketimi(){
        System.out.println("CORSA 5.6 LT YAKİT TUKETİR");
    }
    protected void vitesSayisi(){
        System.out.println("CORSA 5 VİTESLİDİR");
    }
    public static void main(String[] args) {
        /*
        inheritance variable;
         Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
         Yoksa parent'ına gider.
         ilk buldugu yerden alır
         */
        /*
        inheritance method;
        Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
        Yoksa parent'ına gider.
        Buldugu yerden hemen almaz. Override edilmismi diye kontrol eder.
        (Constructor class'ına kadar aynı isimde method var mı diye kontrol eder)
        Override edileni alır.
         */
        Corsa arb1 = new Corsa();
        System.out.println(arb1.hareket); // Arabalar teker ile hareket eder
        System.out.println(arb1.hiz); // Corsa max 200 km hiz yapar önce corsa sınıfına gider bulamazsa parentlara teker teker gider ilk bulduğunu alır gelir
        System.out.println(arb1.yakit); // Corsa benzinli veya elektriklidir
        System.out.println(arb1.marka); // Opel
        System.out.println(arb1.sirketMerkezi); // Almanya
        System.out.println(arb1.model); // Corsa
        arb1.motor(); // CORSA ARABALAR CEVRECİ MOTOR KULLANIR
        Opel arb2 = new Corsa();   // arb2 object i Opel in nesnesidir.object in data türü Opel dir.Ama nesnenin constructure sınıfı Corsa dır.
        System.out.println(arb2.hareket);//Arabalar teker ile hareket eder
        System.out.println(arb2.hiz); // Opel arabalar max 220 km hiz yapar
        System.out.println(arb2.yakit); // Arabalar farkli yakitlar kullanabilir
        System.out.println(arb2.marka); // Opel
        System.out.println(arb2.sirketMerkezi); // Almanya
        // System.out.println(arb2.model); // CTE
        arb2.motor(); // CORSA ARABALAR CEVRECİ MOTOR KULLANIR
        arb2.garanti(); // OPEL ARABALAR 2 YIL GARANTİLİDİR
        arb2.yakitTuketimi(); // CORSA 5.6 LT YAKİT TUKETİR
        // arb2.vitesSayisi(); // CTE
        Araba arb3 = new Corsa();
        System.out.println(arb3.hareket); // Arabalar teker ile hareket eder
        System.out.println(arb3.hiz); // Arabalar motor gucune gore hiz yapar
        System.out.println(arb3.yakit); // Arabalar farkli yakitlar kullanabilir
        System.out.println(arb3.marka); // Arabalar uretildikleri markaya sahiptir
        // System.out.println(arb3.sirketMerkezi); // CTE
        // System.out.println(arb3.model); // CTE
        arb3.yakitTuketimi(); // CORSA 5.6 LT YAKİT TUKETİR
        arb3.motor(); // CORSA ARABALAR CEVRECİ MOTOR KULLANIR önce Araba sınıfına gider sonra,opel sınıfına ,sonra da Corsa sınıfına burda ki motor metodunu yazdırır.
        // arb3.garanti(); // CTE
        // arb3.vitesSayisi(); // CTE
    }

}
