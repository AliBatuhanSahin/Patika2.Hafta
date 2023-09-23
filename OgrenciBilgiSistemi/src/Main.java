import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Batuhan Hoca","05000", "Müzik");
        Teacher t2 = new Teacher("Feryal Hoca","05000", "Türkçe");
        Teacher t3 = new Teacher("Beyza Hoca","05000", "İngilizce");

        Course muzik = new Course("Müzik", "101", "Müzik");
        //muzik.addTeacher(t1);

        Course turkce = new Course("Türkçe", "100", "Türkçe");
        //turkce.addTeacher(t2);

        Course ing = new Course("İngilizce", "102", "İngilizce");
        //ing.addTeacher(t3);

        Student s1 = new Student("Beyza", "356", "8", turkce, muzik, ing);
        s1.addBulkExamNote(100,75,50);
        s1.isPass();

    }
}