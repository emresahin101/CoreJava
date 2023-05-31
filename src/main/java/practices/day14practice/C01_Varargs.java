package practices.day14practice;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        parametre olarak bir int ve istediginiz kadar String olan bir method olusturun,
        en uzun String'in harf sayisi ile int parametre degeri carpıp sonucu yazdırın
         */
        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";
        carpim(sayi,str1,str2,str3);
    } //main
    // int, varargs yapmaya gerek yok cunku zaten int 1 tane
    // ama String 1'den fazla oldugu icin String'i Varargs yapıyoruz
    // Bir methodda varargs dısında parametre kullanacaksak
    // once varargs dısındaki parametreler yazılmalı, en son varargs yazılmalıdır
    // Bir methodda birden fazla Varargs olamaz
    private static void carpim(int sayi,String...str) {
        String enUzunKelime="";
        for (String each:str) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime.length()*sayi);
    }
}




