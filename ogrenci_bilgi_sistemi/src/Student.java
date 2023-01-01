public class Student {
    Course c1;
    Course c2;
    Course c3;
    String Name;
    String stuNumber;
    String classes;
    double average;
    boolean isPass;
    Student(String Name, String stuNumber, String classes,Course c1, Course c2, Course c3)
    {
        this.Name = Name;
        this.stuNumber = stuNumber;
        this.classes = classes;
        this.average = 0.0;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
    }
    void print()
    {
        System.out.println("Isim: " + Name);
        System.out.println("Ogrenci numarası: " + stuNumber);
        System.out.println("Sınıfı: " + classes);
        System.out.println("\n");
    }
    void addBulkExam(int note1, int sNote1, int note2, int sNote2, int note3, int sNote3)

    {
        if((note1>=0 && note1<=100) && (sNote1>=0 && sNote1<=100))
        {
            this.c1.note = note1;
            this.c1.noteSpeaking = sNote1;
            this.c1.average=(note1*0.60)+(sNote1*0.40);
            printNote(this.c1.Name,this.c1.note,this.c1.noteSpeaking,this.c1.average);
            isPass(this.c1.average);
        }

        if((note2>=0 && note2<=100)&& (sNote2>=0 && sNote2<=100))
        {
            this.c2.note = note2;
            this.c2.noteSpeaking = sNote2;
            this.c2.average=(note2*0.50)+(sNote2*0.50);
            printNote(this.c2.Name,this.c2.note,this.c2.noteSpeaking,this.c2.average);
            isPass(this.c2.average);
        }

        if((note3>=0 && note3<=100)&& (sNote3>=0 && sNote3<=100))
        {
            this.c3.note = note3;
            this.c3.noteSpeaking = sNote3;
            this.c3.average=(note3*0.40)+(sNote3*0.60);
            printNote(this.c3.Name,this.c3.note,this.c3.noteSpeaking,this.c3.average);
            isPass(this.c3.average);
        }
        this.average= (this.c1.average + this.c2.average + this.c3.average)/3;
        System.out.println("Genel ortalama: " + this.average);
        if(this.average>=50)
        {
            System.out.println("ogrenci sıınıfı gecti");
        }
        else
        {
           System.out.println("ogrenci sıınıfı gecemedi");
        }
        System.out.println("-----------------------\n");


    }
    void isPass(double average)
    {
        if(average>=50)
        {
            this.isPass = true;
            System.out.println("ogrenci dersi gecti ");
        }
        else
        {
            this.isPass = false;
            System.out.println("ogrenci dersi gecemedi ");
        }
        System.out.println("\n");


    }
    void printNote(String Name,int Note,int sNote,double average)
    {
        System.out.println("Ders: " + Name);
        System.out.println("Notu:  " + Note);
        System.out.println("Sözlü Notu:  " + sNote);
        System.out.println( "ortalaması: " + average);


    }



}
