import java.util.Scanner;
public class Play {

    private Monster currentMonster;
    private player player;

    player player1 = new player();

    private Monster mon5 = new Monster(500, "Ronaldo");
    private Scanner scan;

    private void setNewMonster(Monster mon) {
        currentMonster = mon;

    }


    public Play() {
        this.player = player1;
        scan = new Scanner(System.in);
        System.out.println("You will have to beat the Hog Rider and survive to win.");
        System.out.println("You'll probably fail.");
        play();
    }

    public void play() {
        start();
    }


    private void start() {
        setNewMonster(mon5);

        boolean running = true;
            while (running) {
               int check1 = player.getHealth();
               int check2 = currentMonster.getHealth();
                if (check1 <= 0) {
                    running = false;
                    System.out.println("Game over. You are a disappointment.");
                    scan.nextLine();
                } else if(check2 <= 0){
                    running = false;
                    System.out.println("You win! You have done well.");
                    scan.nextLine();
                } else {
                    System.out.println("Press 1 to dodge, Press 2 to attack: ");
                    int choice = scan.nextInt();
                    if (choice == 1) {
                        boolean temp = player.dodge();
                        if (temp == false) {
                            System.out.println("Dodge has failed!");
                            System.out.println(player.damage(currentMonster.attack(), currentMonster));
                        } else {
                            System.out.println("Dodge is successful!");
                            System.out.println(currentMonster.damage(player.attack(0)));
                        }
                    } else {
                        System.out.println("Pick a number from 1-10");
                        int critNum = scan.nextInt();
                        System.out.println(currentMonster.damage(player.attack(critNum)));
                        System.out.println(player.damage(currentMonster.attack(), currentMonster));
                    }
                }
            }




        }

}





