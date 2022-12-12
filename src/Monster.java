public class Monster {
    private int hp;
    final int hp2;
    private String name;

    public int getHealth(){
        return hp;
    }

    public String getName(){
        return name;
    }

    public Monster(int health, String name){
        hp = health;
        this.name = name;
        hp2 = health;
    }

    public String damage(int damage){
       hp = hp - damage;
       return "Player has attacked for " + damage + " damage. " + name + " now has " + hp + "/" + hp2 + " health.";
    }

    public int attack(){
        int maxAttack = hp/5;
        int temp = (int) (Math.random() * maxAttack) ;
        return temp;
        }

}




