package javaders.day02printmethodcreation;
import java.util.Scanner;

public class PrintlnPrint {

    public static void main(String[] args) {

        /*
        \n ==> her bir characteri bir alt satirda yazdirir
        \t ==> 1 tab bosluk birakir
        \" ==> consolda " yazdirmayi saglar


         */
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satirda olacak sekilde yazdiriniz

        //1 Yol
        //ctrl +d ==> windows
        // cmd +d ==> mac
        System.out.println("**********1 .YOL ********************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        System.out.println("********** 2 .YOL ********************");
        // 2 Yol
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satira gelecek sekilde tek bir sout ile yazdiriniz

        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        // JAVA ILE GUZEL DUNYA cumlesinin her bir kelimesini alt satirda
        // yazdiran kodu tek bir sout ile yaziniz

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");
        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
        //  kodu yaziniz
        // JAVA I     ==> 1 SPACE BOSLUK
        // JAVA   I   ==> 1 TAB BOSLUK

        System.out.println("JAVAM\tILEMM\tGUZEL\tDUNYA");// \t de harf sayisi onemlidi yoksa esit aralik birakmaz
        // bu nedenle her kelimeyi 5 harfe tamamladik

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro \" ile java cok ' kolay '");
        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        // 3 SATIR ALTTAN paragraf basi yaparak tek
        // bir sout ile yazdiran kodu olusturunuz

        System.out.println("\" MAHARET\" hic " +
                "'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");
        //  Print ile Println arasindaki farklar
        // ln ==> line next bir sonraki satira gec

        System.out.println("**************** 1 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //AliCan yazdirir
        System.out.println("**************** 2 *****************");
        System.out.println("Ali");
        System.out.print("Can");
        //Ali
        //Can  yazdirir

        System.out.println("**************** 3 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //Can**************** 3 *****************
        //AliCan

        // Ex)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
                  A
                 A A
                A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");

        char ch = input.next().charAt(0);//Ali HAKKI
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);







    }//main
}//class