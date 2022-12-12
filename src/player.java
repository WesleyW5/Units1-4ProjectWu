public class player {

    private int hp;

    private int hp2;


    public int getHealth(){
        return hp;
    }

    public player(){
        hp = 300;
        hp2 = hp;
    }

    public int attack(int critChance){
        int maxAttack = hp/8;
        int temp = (int) Math.round((Math.random() * maxAttack));
        int critNum = (int) Math.round((Math.random() * 10));
        if(critChance == 0){
            return temp;
        }else if(critChance == critNum){
            return (int) Math.pow(temp, 3);
        } else if(critChance == critNum + 1 || critChance == critNum - 1){
            return (int) Math.pow(temp, 2);
        }
        return temp;
    }

    public boolean dodge(){
        double dodgeChance = Math.random();
        if(dodgeChance >= 0.5){
            return true;
        } else {
            return false;
        }

    }


    public String damage(int damage, Monster mon){
        hp = hp - Math.abs(damage);
        return mon.getName() + " has attacked for " + damage + " damage." + " Player now has " + hp + "/" + hp2 + " health.";
    }

}
