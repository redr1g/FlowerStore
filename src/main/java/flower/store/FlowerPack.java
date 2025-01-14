package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity() {
        this.quantity = quantity < 1 ? 1: quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
