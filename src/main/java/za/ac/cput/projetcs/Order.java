package za.ac.cput.projetcs;

import java.util.Objects;

public class Order {
    private String id;
    private String chicken;
    private String cheese;
    private String drink;
    private String source;

    private Order() {
    }

    public String getId() {
        return id;
    }

    public String getChicken() {
        return chicken;
    }

    public String getCheese() {
        return cheese;
    }

    public String getDrink() {
        return drink;
    }

    public String getSource() {
        return source;
    }

    public Order(Builder builder) {
        this.cheese = builder.cheese;
        this.chicken = builder.chicken;
        this.drink = builder.drink;
        this.source = builder.source;
        this.id = builder.id;
    }

    public static class Builder {
        private String id;
        private String chicken;
        private String cheese;
        private String drink;
        private String source;

        public Builder chicken(String value) {
            this.chicken = value;
            return this;
        }

        public Builder cheese(String value) {
            this.cheese = value;
            return this;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder drink(String value) {
            this.drink = value;
            return this;
        }

        public Builder source(String value) {
            this.source = value;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}


