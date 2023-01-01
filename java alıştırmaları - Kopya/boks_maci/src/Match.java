public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight)
    {
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    void run()
    {
        if (isCheck())
        {
            while(this.f1.health> 0 && this.f2.health>0)
            {
                System.out.println("\n======== YENİ ROUND =========\n");
                start();
                if(isWin())
                {
                    break;
                }
                System.out.println(this.f2.name + " kalan can: " + this.f2.health);
                System.out.println(this.f1.name + " kalan can: " + this.f1.health);
            }
        }
        else
        {
         System.out.println("sporcular eslestirilemez");
        }

    }


    boolean isCheck()
    {
        if (f1.weight>=minWeight && f1.weight<=maxWeight && f2.weight>=minWeight && f2.weight<=maxWeight)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isWin()
    {
        if(this.f1.health==0)
        {
            System.out.println(this.f2.name + " kazandi");
            return true;
        }
        else if(this.f2.health==0)
        {
            System.out.println(this.f1.name + " kazandi");
            return true;
        }
        else
        {
            return false;
        }

    }
    void start()
    {
        double randomNumber1= Math.random()*100;
        double randomNumber2= Math.random()*100;
        if(randomNumber1>randomNumber2)
        {
            System.out.println(this.f1.name + " baslayacak");
            this.f2.health=this.f1.hit(f2);
            if(isWin())
            {
                return ;
            }
            else
            {
                this.f1.health=this.f2.hit(f1);
            }
        }
        else
        {
            System.out.println(this.f2.name + " baslayacak");
            this.f1.health=this.f2.hit(f1);
            if(isWin())
            {
                return;
            }
            else
            {
                this.f2.health=this.f1.hit(f2);
            }
        }
    }

}
