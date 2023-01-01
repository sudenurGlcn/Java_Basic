public class Teacher {
    String name;
    int number;
    String Branch;

    Teacher (String name, int number, String Branch)
    {
        this.name = name;
        this.number = number;
        this.Branch = Branch;

    }
    void print()
    {
       System.out.println("Name: " + name);
       System.out.println("Number: " + number);
       System.out.println("Branch: " + Branch);
    }
}
