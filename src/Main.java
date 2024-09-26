public class Main {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();


        while (true) {
            Attack a1 = new Attack();
            Attack a2 = new Attack();

            p1.playerHealth = p1.playerHealth - a1.randomNumber;

            p2.playerHealth = p2.playerHealth - a2.randomNumber;

            if (p1.playerHealth >= 0 || p2.playerHealth >= 0) {
                System.out.println(p1.playerHealth + " " + p2.playerHealth);
                break;
            }
            else {
                System.out.println(p1.playerHealth + " " + p2.playerHealth);
                return;
            }
        }

    }
}