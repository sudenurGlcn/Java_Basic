public class Course {
    Teacher teacher;
    String Name;
    String classCode;
    String prefix;
    int  note;
    int  noteSpeaking;
    double average;

    Course(String Name, String classCode, String prefix)
    {
        this.Name = Name;
        this.classCode = classCode;
        this.prefix = prefix;
        this.note = note;
        this.noteSpeaking = noteSpeaking;
        this.average = 0.0;


    }
    void addTeacher(Teacher teacher)
    {
        if(teacher.Branch.equals ( this.prefix))
        {
            this.teacher = teacher;

        }
        else
        {
            System.out.println("Teacher is not in the same branch");
        }


    }




}

