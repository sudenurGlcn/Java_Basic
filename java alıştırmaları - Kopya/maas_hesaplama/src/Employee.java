public class Employee {
    String name;
    int  salary;
    int workHours;
    int hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    int tax()
    {
        if(this.salary<1000)
        {
            return 0;
        }
        else
        {
            return ((this.salary*3)/100);
        }
    }
    int bonus()
    {
        if(this.workHours>40)
        {
            return (this.workHours-40)*30;
        }
        else
        {
            return 0;
        }
    }
    int raiseSalary()
    {
        if(2021-this.hireYear<10)
        {
            return ((this.salary*5)/100);
        }
        else if(2021-this.hireYear>9 && 2021-this.hireYear<20)
        {
            return ((this.salary*10)/100);
        }
        else
        {
            return ((this.salary*15)/100);
        }

    }
    void toStrings()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
        System.out.println("Work Hours: "+this.workHours);
        System.out.println("Hire Year: "+this.hireYear);
        System.out.println("Tax: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Raise Salary: "+raiseSalary());
        System.out.println("Total Salary: "+(bonus()+raiseSalary()+this.salary));
        System.out.println("Total Salary with Tax: "+(bonus()+raiseSalary()+this.salary-tax()));
        System.out.println("\n");
    }

}
