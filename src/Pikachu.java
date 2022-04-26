import java.util.Scanner;

public class Pikachu extends Pokemon {

    public Pikachu () {
        super(110, 100);
    }

    public void attack(Pokemon enemy) {
        Scanner scanner = new Scanner(System.in);
        Attack attack = null;
        int userChoice;
        do {
            System.out.println("Choose an attack: " +
                    "1 - for Zap Kick " +
                    "2 - for Thunder Shock " +
                    "3 - for Electro Ball");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case Constants.ZAP_KICK:
                    attack = new ZapKick();
                    break;
                case Constants.THUNDER_SHOCK:
                    attack = new ThunderShock();
                    break;
                case Constants.ELECTRO_BALL:
                    attack = new ElectroBall();
                    break;
            }
        } while (!this.isValidAttack(userChoice));
        if (this.hasEnoughAttackPoints(attack)) {
            this.reduceAttackPoints(attack.getCost());
            int damage = attack.getDamage();
            enemy.reduceLife(damage);
            System.out.println("Current pokemon " + this);
            System.out.println("Enemy Pokemon " + enemy);
        } else {
            System.out.println("You do not " +
                    "have enough attack points");
        }
    }

    public boolean isValidAttack (int attack) {
        boolean valid = false;
        if (attack == Constants.ZAP_KICK || attack == Constants.ELECTRO_BALL
        || attack == Constants.THUNDER_SHOCK) {
            valid = true;
        }

        return valid;

    }
}
