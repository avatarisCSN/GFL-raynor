package builder;

public class Pizza {
    private int tomatoes;
    private int cheese;
    private int meat;
    private int sausage;
    private int corn;

    public static class Builder {
        private int tomatoes;
        private int cheese;
        private int meat;
        private int sausage;
        private int corn;

        public Builder tomatoes(int tomatoes) {
            this.tomatoes = tomatoes;
            return this;
        }

        public Builder cheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder meat(int meat) {
            this.meat = meat;
            return this;
        }

        public Builder sausage(int sausage) {
            this.sausage = sausage;
            return this;
        }

        public Builder corn(int corn) {
            this.corn = corn;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.meat = meat;
            pizza.cheese = cheese;
            pizza.tomatoes = tomatoes;
            pizza.sausage = sausage;
            pizza.corn = corn;

            return pizza;
        }
    }

    private Pizza(){}

    @Override
    public String toString() {
        return "Pizza{" +
                "tomatoes=" + tomatoes +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", sausage=" + sausage +
                ", corn=" + corn +
                '}';
    }
}
