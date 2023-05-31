 package practices.denemeofday13practice;
import practices.day13practice.C03_Varargs;  /*Başka bir package da ki sınıfı parent yapmak için o package ve sınıfı
                                               import etmemiz gerekir*/

public class Den2_C03_Varg extends C03_Varargs{

    public static void main(String[] args) {
        String ad1 = "Cihan";
        String ad2 = "Suleyman";
        System.out.println(enUzunKelime(ad1, ad2));
//  enUzunKelime methodununun access modifiers'ını protected yapıp farklı bir packadeki farklı bir classda calıstırıyoruz.

    }}