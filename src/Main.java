public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Monster m1 = new Monster();


        while (true) {
            Attack a1 = new Attack();

            p1.playerHealth = p1.playerHealth - a1.monsterAttack;
            m1.monsterHealth = m1.monsterHealth - a1.playerAttack;


            if (p1.playerHealth <= 0) {
                System.out.println("Monster wins");
                return;
            }
            if (m1.monsterHealth <= 0) {
                System.out.println("Player wins");
                return;
            } else {
                System.out.println("Player deals" + " " + a1.playerAttack + " " + "damage");
                System.out.println("Monster has" + " " + m1.monsterHealth + " " + "health");
                System.out.println();
                System.out.println("Monster deals" + " " + a1.monsterAttack + " " + "damage");
                System.out.println("Player has" + " " + p1.playerHealth + " " + "health");
            }

        }

    }
}