package practices.denemeofday13practice;
import practices.day13practice.C03_Varargs;
public class Den3_C03_Varg {
    public static void main(String[] args) {
        String soyisim1 = "Tan";
        String soyisim2 = "Ozturk";
        System.out.println(C03_Varargs.enUzunKelime(soyisim1, soyisim2));
        /* enUzunKelime methodun access modifiers'ını public yapıp(practices.day13practice.C03_Varargs) da tanımladık ve
         farklı bir packadeki(practices.deneme) farklı bir classda(Den3_C03_Varg) calıstırıyoruz */
    }


}
