package javaders.day44lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {

    public static void main(String[] args) {
        //Example 1 : Size verilen bir array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz.
        //            [0, 2, 5, 3, 1, -2]

        int [] arr = { 0, 2, 5, 3, 1, -2};

        //Array'i list'e cevirelim cunku List'i kullanmak daha kolay
        List<Integer> myList = new ArrayList<>();
        Arrays.stream(arr).forEach(t->myList.add(t));
        System.out.println(myList);//[0, 2, 5, 3, 1, -2]

        //List'teki max elemani bulalim
        int max = myList.stream().reduce(Math::max).get();   // (accumulator olan) reduce(Math:: yazarsak math kılasında yapılabilecek
                                                          //işlemler gözükür.
        System.out.println(max);//5

        //List'teki max elemanin indexini bulalim
        int idxOfMax = myList.indexOf(max);
        System.out.println(idxOfMax);//2

        //Maximum elemana kadarki tum elemanlari bir List'in icine koy
        List<Integer> firstList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t));
        System.out.println(firstList);//[0, 2, 5]

        //firstList'in copy'sini olustur
        List<Integer> firstListCopy = new ArrayList<>();
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println(firstListCopy);//[0, 2, 5]

        //Copy olan List'i sort et
        Collections.sort(firstListCopy);
        System.out.println(firstListCopy);

        //firstList ile firstListCopy'nin ayni olup olmadigini kontrol et
        boolean rule1 = firstList.equals(firstListCopy);
        System.out.println(rule1);//true

        //Maximum elemandan sonraki tum elemanlari bir list'in icine koy
        List<Integer> secondList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondList.add(t));
        System.out.println(secondList);//[5,3, 1, -2]

        //secondList'in copy'sini olustur
        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t->secondListCopy.add(t));
        System.out.println(secondListCopy);//[5,3,1,-2]

        //Copy olan List'i sort et
        Collections.sort(secondListCopy);    //reverse den önce sort kullanılır.
        Collections.reverse(secondListCopy);
        System.out.println(secondListCopy);//[5,3,1,-2]

        //secondList ile secondListCopy'nin ayni olup olmadigini kontrol et
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println(rule1);//true

        System.out.println("Is the array mountain array?  " + (rule1&&rule2));






    }


}
