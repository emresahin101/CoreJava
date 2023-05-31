package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

        /*

        Numeric Data Type'larinin birbirine donusturulmesine Type Casting denir
        Numeric Data Type'lari byyte<short<int<long<float<double

        Kucuk Data Type'larinin Buyuk Data typelarina donusturulmesine
        "Auto Widening"(Otomatik Genisletme) denir ==> Kucuk Kutunun Buyuk Kutu
        icerisine yerlestirilmesi.

        Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
        Data kaybi olabilecegi icin code'u yazanlara birakir.Buna "Explicit Narrowing"
         (Aciktan Daraltma ) denir.

         */
        byte age=13;
        int ageInt =age;//AutoWidening  Otomatik Genisletme

        // long data type'inin short'a cevirelim

        long population = 1234;
        short populationShort= (short) population;//Explicit Narrowing(Aciktan Daraltma)

        // int data type'inin float data type'ina ceviriniz
        int boy =170;
        float boyFloat=boy;

        // short data type'inin byte data type'ina cevirelim
        short numberShort=115;
        byte numberByte= (byte)numberShort;

    }//main
}//class