public class Monster {
    private int hp;
    private String name;

    public Monster(int health, String name){
        hp = health;
        this.name = name;
    }

    public int damage(int damage){
       hp = hp - damage;
       return hp;
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

    private int origHealth(){
        int oldHealth = hp;
        return oldHealth;
    }


   public void displayInfo(){
        System.out.println(name + " has " + hp + "/" + origHealth() + " hitpoints left.");
   }


}
