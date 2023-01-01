public class Fighter {
    String name;
    int  damage;
    int health;
    int weight;
    int dodge;
    int chance;

    Fighter(String name,int damage, int health, int weight,int dodge,int chance)
    {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
        this.chance=chance;
        if(this.dodge<0 && this.dodge>100)
        {
            this.dodge=0;
        }
    }

    int hit(Fighter f)
    {
        System.out.println(this.name + " " + f.name + "'ye " + this.damage + " hasar vurdu");
        if(f.isDodge())
        {
            System.out.println(f.name + " gelen hasari blokladi");
            return f.health;
        }
        else
        {
            return f.health-this.damage;
        }

    }
    boolean isDodge()
    {
        double randomNumber= Math.random()*100;
        return randomNumber <= this.dodge;
    }
}
