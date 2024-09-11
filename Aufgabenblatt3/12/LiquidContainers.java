public class LiquidContainers {

    private int amount;

    public LiquidContainers() {
        this.amount = 0;
    }

    public int getAmount() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            if (this.amount > 100) {
                this.amount = 100;
            }
        }
    }

    public void move(LiquidContainers other, int amount) {
        if (amount > 0) {
            if (amount > this.amount) {
                amount = this.amount;
            }
            this.amount -= amount;
            other.add(amount);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount > this.amount) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }
        }
    }
}
