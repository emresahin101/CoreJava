package javaders.day25polymorphismencapsulation;

public class StudentRunnner {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.getStdId());

        System.out.println(s1.getGpa());//3.87

        System.out.println(s1.isSuccessful());

        s1.setGpa(3.99);

        System.out.println(s1.getGpa());// 3.99


    }

}