package mypackage;

public class Studentsrecords  {


    /* declaration of instance variables.       ==> instance variables metodların dışında oluşturulur.tüm metodlardan
                                               ulaşılabilsin diye.Ancak Statik metodlarda kullanılabilmesi için o
                                               sınıftan object oluşturulması gerekir .
                                               Static variables da aynı şekilde tüm metodların dışında oluşturulur.
                                               Bir metodun içinde oluşturulduğunda hata verir.

     */

        public String name; //public instance
        String division;    //default instance
       private int age;    //private instance
        /* Constructor that initialize an instance variable. */
        int x =5;
        public Studentsrecords(String sname)
        {
    name = sname;      /*İnstance variablelera statik olmayan metodlar içerisinde direkt atama yapılıyor yada
 direkt kullanılabiliyor object e ihtiyaç duymazlar(örneğin x değişkeni) ama statik olan bir metodda(örneğin main metodda)
            //               bu işlemi yapmak için o sınıftan object oluşturup o object ile instance variable
                                       üzerinde işlem yapabiliriz */
                   x =6;
        }

        /* Method to intialize an instance variable. */
        public void setDiv(String sdiv)
        {

            division = sdiv;
            x = 7;
        }

        /* Method to intialize an instance variable. */
        public void setAge(int sage)
        {
            age = sage;

        }

        /* Method to display the values of instance variables. */
        public void printstud()
        {
            System.out.println("Student Name: " + name );
            System.out.println("Student Division: " + division);
            System.out.println("Student Age: " + age);
        }

        /* Driver Code */
        public static void main(String args[])
        {
            Studentsrecords s = new Studentsrecords("Monica");   // s objecti main metodunda oluşturulduğu için
                                          // bu objecti (s' i) bu metodun içinde kullanabiliriz.O yüzden run işlemleri
                                         // hep runner sınıfındaki main metodunda yapılıyor.

            s.setAge(14);
            s.setDiv("B");
            s.printstud();

;
        }





    }
