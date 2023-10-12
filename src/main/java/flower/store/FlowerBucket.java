package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    private double price;

    public double getPrice() {
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    FlowerBucket(FlowerPack...packs) {
        for (FlowerPack pack: packs) {
            flowerPacks.add(pack);
        }
    }
    
}
