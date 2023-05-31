package javaders.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException { // File kullanımlarında java bizden hep exceptions uygulamamızı ister.

        //Example 1 : Verilen text file icindeki text'i console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik

        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3 : Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
        boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").
                        split(" ")).     // split metodu streamin her satırdaki kelimeliri böler ve onu dizi yapar
                                              // Burda ise satırlardaki her bir kelime alt alta geçirilerek stream yapısına dönüştürülü
                        flatMap(Arrays::stream).     //Burda diziyi tekrar streame dönüştürüyor
                distinct().
                collect(Collectors.toList());   //  Diziyi List yapıyor.
        System.out.println(words);
    }
}
