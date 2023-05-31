package javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {
        String s = "Learn Java earn money";
        // ***************** endsWith ***********************\\
      /*  endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir
                      True yada false seklinde boolean bir deger dondurur.
                      Icerisine tek karakterde coklu karakterde koyabilirsiniz
        */
        //Ex : s String'inin "money" ile bitip bitmedigini kontrol ediniz

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//true

        String s2 = "Learn money Java earn";
        boolean iceriyorMu = s2.contains("money");
        System.out.println("iceriyorMu = " + iceriyorMu);

        /*
        contains() methodu cumlenin hrhangi bir yerinde istenilen datayi bulursa true dondurur.
        Ancak task'in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin
        endsWith() kullanmaliyiz.
         */

        // ******************** replace () **********************\\

        // Ex : s String'indeki "money" kelimesini "dollar" kelimesiyle yer degistirelim
   String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dollar

        //Ex : s  String'indeki "earn" kelimesini "win" kelimesine ceviriniz.

        String s3= s.replace("earn","win");
        System.out.println("s3 = " + s3);//s3 = Lwin Java win money

        //Ex : s  String'indeki "a" harfini "*" ile degistiriniz.
        String s4= s.replace('a','*');//makbul olan budur
        String s5= s.replace("a","*");
        // String s6= s.replace("a",'*');

        System.out.println("s4 = " + s4);//s4 = Le*rn J*v* e*rn money
        //Ex : s  String'indeki "L" harfini "***" ile degistiriniz.

        String s6=s.replace("L","***");
        System.out.println("s6 = " + s6);

        //Ex : s  String'indeki "e" harflerini siliniz.
        String s7 =s.replace("e","");
        System.out.println("s7 = " + s7);//s7 = Larn Java arn mony
        //String s8 =s.replace('e',' ');
        //System.out.println("s8 = " + s8);//s8 =
        // L arn Java  arn mon y space ile silme yapilmaz.space'in
        // Java icin bir anlami vardir.Ve bir karakterdir.
        // Taskte istenilen saglanmamis olur

        //Ex : s  String'indeki tum "earn" kelimelerini siliniz.
        String s8= s.replace("earn","");
        System.out.println("s8 = " + s8);//s8 = L Java  money

        String t = "Dolma Kalem";
        // Ex : t String'indeki "Kalem" kelimesi yerine "Biber" yerlestiriniz
        String t1=t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);//t1 = Dolma Biber
}// main
}//class