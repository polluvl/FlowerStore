package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    // list of flower packets
    private List<FlowerPack> flowerPacks;

    // без параметрів щоб уникнути проблем
    // <> означає що будуємо ліст на якомусь типі. тип на дженеріку. по дефолту - обджект
    public FlowerBucket(){
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public double getPrice(){
        return flowerPacks.stream().mapToDouble(pack -> pack.getPrice()).sum();
    }
}
