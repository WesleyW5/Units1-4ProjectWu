public class player {

    private int hp;
    private int startAttack;

    public player(int health, int attack){
        hp = health;
        startAttack = attack;
    }

    public int attack(int critChance){
        int maxAttack = hp/5;
        int temp = (int) Math.round((Math.random() * maxAttack));
        int critNum = (int) Math.round((Math.random() * 10));
        if(critChance == critNum){
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

}
