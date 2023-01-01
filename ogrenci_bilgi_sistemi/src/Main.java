public class Main {
    public static void main(String[] args)
    {
        Teacher t1= new Teacher("Mahmut", 12345671, "CSE");
        Teacher t2=new Teacher("Ali", 12345672, "TRH");
        Teacher t3=new Teacher("Veli", 12345673, "MAT");

        Course CSE= new Course("CSE", "CSE101", "CSE" );
        Course TRH= new Course("TRH", "TRH101", "TRH");
        Course MAT= new Course("MAT", "MAT101", "MAT");

        Student s1= new Student("Ahmet", "1234567", "4",  CSE, TRH, MAT);
        Student s2= new Student("Mehmet", "1234568", "3",  CSE, TRH, MAT);
        Student s3= new Student("Ayse", "1234569", "2", CSE, TRH, MAT);
        CSE.addTeacher(t1);
        TRH.addTeacher(t2);
        MAT.addTeacher(t3);
        s1.print();
        s1.addBulkExam(50, 60, 70, 80, 90, 100);
        s2.print();
        s2.addBulkExam(70, 50, 60, 90, 90, 100);
        s3.print();
        s3.addBulkExam(40, 55, 10, 80, 90, 100);
    }

}