package javaders.day43lambda;

/*
Icinde
        i)private variable'lar
        ii)Parametreli ve parametresiz constructor'lar
        iii)getter'lar
        iv)setter'lar
        v)toString() method'u
        barindiran class'lara "POJO" Class denir.
        POJO: Plain Old Java Object    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
public class Course {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudents, String season, double averageScore) { //Constructor metodu

        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Course() {   // Default Constructor

    }

    public String getCourseName() { /// getter metodlar okuma yapar o yüzden parametre almazlar.
        return courseName;
    }
    public int getNumOfStudents() {
        return numOfStudents;
    }
    public String getSeason() {
        return season;
    }
    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {   // setter metodlar ise private üyelere değer atadığı
                                                       // için parametre alır.
         this.courseName = courseName;
    }
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {    /*Generate e Tıkla --> ToString method a tıkla bu sayede course sınıfının tüm objectlerinin
                                   bu hazır formatta(metodu açınca aşağısı otomatik geliyor) isteniyen tüm bilgilerini return ederiz */
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}