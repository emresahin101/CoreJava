package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // Ex : Bir String hic karakter icerip icermedigini kontrol eden kodu yaziniz

        String str="";//hiclik


        //1.yol
        boolean result1 = str.length()==0;// Javaya 2 islem yaptirdim 1. lenght () kullandim 2.  ==0 kullandim
        System.out.println("String bos mu = " + result1);//true

        // 2. yol
        // ********************** isEmpty () **************************\\
        /*
        isEmpty methodu String datanin icerisinde hicbir sey yoksa True dondurur
        Javada space de bir karakter oldugu icin space varsa False dondurur
         */
        boolean result2 = str.isEmpty();// Javaya 1 islem yaptirdik isEmpty () kullandik
        System.out.println("String Bosmu = "+result2);


        // Ex : Bir String datanin space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz
        String t = "  ";
        //1 .Yol
        boolean result3 = t.replace(" ","").length()==0;//javaya 3 islem yaptirdik
        System.out.println("result3 t = " + result3);//true

        // 2.Yol
        boolean result4 = t.replace(" ","").isEmpty();//javaya 2 islem yaptirdik
        System.out.println("result4 = " + result4);

        // 3.Yol
        // ********************* isBlank() **************************\\
        /*
        isBlank() ==>space+hiclik ise True dondurur
            String bir datanin bosmu dolumu olduguna bakar
            isEmpty'den farki space varsa yine true dondurur
         */

        boolean result5= t.isBlank();//javaya 1 islem yaptirdik
        System.out.println("result5 = " + result5);



        // ********************** indexOf() ********************\\
        /*
        indexOf() verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
                  int deger dondurur. Coklu data icin kullanildiginda ilk gordugu
                  datanin ilk karakterinin indexini verir. Olmayan bir karakterin
                  indexi sorulursa bize -1 dondurur
         */
        // EX : Bir String'de a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz

        String s="Java is easy to learn";//1 +5 + 8 = 14
        int aIdx=s.indexOf('a');
        System.out.println("aIdx = " + aIdx);//aIdx = 1

        int iIdx=s.indexOf('i');
        System.out.println("iIdx = " + iIdx);//iIdx = 5

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);//eIdx = 8
        System.out.println("indexler Toplami : " + (aIdx + iIdx + eIdx));
        //indexler Toplami : 14

        //  String s="Java is easy to learn";
        int pIdx = s.indexOf('p');//olmayan karakter sorgulanirsa -1 dondurur
        System.out.println("pIdx = " + pIdx);//pIdx = -1

        String s2="Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx);//13

        // Ex : Bir String'de "Java " kelimesinin ilk olarak kacinci index'de oldugunu gosteren
        //kodu yaziniz
        String cumle="Ah Java vah Java sen ne guzel seysin Java";

        int indexJava=cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);//indexJava = 3

        int indexQYX=cumle.indexOf("QYX");//-1
        System.out.println("indexQYX = " + indexQYX);//indexQYX = -1

        // ******************* lastIndexOf() *********************\\
        /*
        lastIndexOf ()  Verilen String bir datada istenilen
        degerin son gorunumunun indexini verir. Olmayan bir
        karakter sorgulanirsa -1 dondurur
         */

        // EX : Bir String'de a,i,e karakterlerinin son gorunumunun
        //      indexleri toplamini ekrana yazdiriniz    //40
        String c="Java is easy to learn";

        int aLast= c.lastIndexOf('a');//18
        System.out.println("aLast = " + aLast);

        int iLast=c.lastIndexOf('i');
        System.out.println("iLast = " + iLast);//5

        int eLast=c.lastIndexOf('e');
        System.out.println("eLast = " + eLast);//17

        System.out.println("Toplam index : "+(aLast+iLast+eLast));//Toplam index : 40






    }//main
}//class