import java.util.Random;

public class Attack {
    Random random = new Random();
    int playerMin = 10;
    int playerMax = 20;
    int playerAttack = random.nextInt(playerMax - playerMin + 1) + playerMin;


    int monsterMin = 1;
    int monsterMax = 5;
    int monsterAttack = random.nextInt(monsterMax - monsterMin + 1) + monsterMin;
}

