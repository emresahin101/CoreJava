package javaders.day18constructorsstatickeyword;


/*
1)Bir method "ayni isim"ve "farkli parametre"lerle olusturulursa buna "MethodOverloading"denir.
2)"MethodOverloading" Java da "iyi organizasyon" icindir.
3)MethodOverloading yaparken parametre 3 sekilde degistirilebilir;
   i)Parametrelerin sayilari degistirilebilir.
   ii)Parametrelerin data typlerini degistirebilirsiniz
   iii)Parametrelerin data typleri farkli ise yerleri degistirilebilir
*/

public class MethodOverloading {
    public static void main(String[] args) {

    }
    public static  int add(int a, int b){
        return a+b;
    }

    public static  int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add ( double a, int b) {
        return a + b;
    }

    public static double add ( int a, double b) {
        return a + b;
    }

}