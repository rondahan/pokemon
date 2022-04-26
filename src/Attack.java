import java.util.Random;

public abstract class Attack {
    private int cost;
    private int minDamage;
    private int maxDamage;

    public Attack(int cost, int minDamage, int maxDamage) {
        this.cost = cost;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getCost() {
        return cost;
    }

    public int getDamage () {
        Random random = new Random();
        int damage = random.nextInt(this.maxDamage - this.minDamage) + this.minDamage;
        return damage;
    }
}
