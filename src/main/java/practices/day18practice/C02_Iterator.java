package practices.day18practice;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class C02_Iterator {
    /*
     Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
     set'deki cift elemanları iterator ile siliniz
   */
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(st);
        Iterator <Integer>itr = st.iterator();  // Burda set in içine ıterator koyduk.
        // set'lerde index yapısı yoktur. Bu sebeple iterator kullanılır.
        // List haric hicbir collections uyesinde index yapısı yoktur.

        while (itr.hasNext()){ // yanında eleman var mı kontrol ediyorum
            // varsa true, yoksa false dondurecek
            // true oldugu muddetce while dongusu devam edecek

            Object sayi =itr.next();// itr-i bir adım ileriye atıyorum üzerinden geçtiği elemanı bize döndürüyor.
                                     //Burda Object e atama yapmamızın sebebi Integer a atama yapılmıyor iterator o yüzden

            if((Integer) sayi%2==0){ //Burdada sayı üzerinde işlem yapabilmemiz için Object den Integer a cast etmemiz gerekiyor
                itr.remove();
            }
        }
        System.out.println(st); // ıtr ile yaptığımız işlemler st setini değiştirdi direkt.Bu yüzden direkt yazdırabiliyoruz.
    }
}
