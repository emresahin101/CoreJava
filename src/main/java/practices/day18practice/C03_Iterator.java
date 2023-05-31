package practices.day18practice;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
public class C03_Iterator {
    public static void main(String[] args) {
    /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız
     */
        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1,8,3,6,7));
        System.out.println(dq);

        Iterator itr = dq.iterator();  //Deque'lerde index yapısı yoktur bu sebeple iterator kullanılır.

        while (itr.hasNext()){
            Object sayi =itr.next();
            if((Integer)sayi>5){
                System.out.print(sayi + " ");
            }
        }
    }
}

