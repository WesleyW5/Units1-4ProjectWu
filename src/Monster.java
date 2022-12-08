public class Monster {
    private int hp;
    private int hp2;
    private String name;


    public Monster(int health, String name){
        hp = health;
        this.name = name;
        hp2 = health;
    }

    public String displayHealth(int damage){
       hp = hp - damage;
       return "Player has attacked for " + damage + " damage. " + name + "now has " + hp + "/" + hp2 + " health.";
    }

    public int attack(){
        int maxAttack = hp/10;
        double crit = Math.random();
        int temp = (int) (Math.random() * maxAttack) ;
        if(crit < 0.1){
            return (int) Math.pow(temp, 2);
        } else {
            return temp;
        }

    }



}
