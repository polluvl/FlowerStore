package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Random;

public class FlowerBucketTest {
    // private static final Random RANDOM_GENERATOR = new Random();
    private static final int RosePrice = 70;
    private static final int RoseSepalLength = 12;
    private static final int RoseQuantity = 15;
    private static final int TulipPrice = 60;
    private static final int TulipSepalLength = 10;
    private static final int TulipQuantity = 13;
    private static final int ChamomilePrice = 42;
    private static final int ChamomileSepalLength = 7;
    private static final int ChamomileQuantity = 9;
    private static final int MinPrice = 20;
    private static final int MaxPrice = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        Flower rose = new Flower(FlowerColor.RED, FlowerType.ROSE, 
        RoseSepalLength, RosePrice);
        Flower tulip = new Flower(FlowerColor.RED, FlowerType.TULIP, 
        TulipSepalLength, TulipPrice);
        Flower chamomile = new Flower(FlowerColor.BLUE, 
        FlowerType.CHAMOMILE, ChamomileSepalLength, ChamomilePrice);

        FlowerPack roses = new FlowerPack(rose, RoseQuantity);
        FlowerPack tulips = new FlowerPack(tulip, TulipQuantity);
        FlowerPack chamomiles = new FlowerPack(chamomile, ChamomileQuantity);

        flowerBucket.add(roses);
        Assertions.assertEquals(RoseQuantity * RosePrice, flowerBucket.getPrice());

        flowerBucket.add(tulips);
        Assertions.assertEquals(RoseQuantity * RosePrice + 
        TulipQuantity * TulipPrice, flowerBucket.getPrice());

        flowerBucket.add(chamomiles);
        Assertions.assertEquals(ChamomilePrice * ChamomileQuantity + 
        RoseQuantity * RosePrice + TulipQuantity * TulipPrice, flowerBucket.getPrice());

        Store store = new Store();
        store.addFlower(tulip);
        store.addFlower(rose);
        List<Flower> result = store.searchByColor(FlowerColor.BLUE);
        

        Assertions.assertEquals(0, result.size());

        store.addFlower(chamomile);
        List<Flower> result2 = store.searchByColor(FlowerColor.BLUE);
        

        Assertions.assertEquals(1, result2.size());
    }
}
