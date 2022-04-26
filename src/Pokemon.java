public abstract class Pokemon {
    private int life;
    private int attackPoints;

    public Pokemon (int life, int attackPoints) {
        this.life = life;
        this.attackPoints = attackPoints;
    }

    public abstract void attack (Pokemon enemy);

    public boolean hasEnoughAttackPoints (Attack attack) {
        boolean enough = false;
        if (this.attackPoints >= attack.getCost()) {
            enough = true;
        }
        return enough;
    }

    public void reduceAttackPoints (int amount) {
        this.attackPoints -= amount;
    }

    public void reduceLife (int amount) {
        this.life -= amount;
    }

    public String toString () {
        return "Life: " + this.life + ", Attack Points: " + this.attackPoints;
    }

}
