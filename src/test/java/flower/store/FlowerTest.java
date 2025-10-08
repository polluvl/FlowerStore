package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    // private Flower flower;
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

    Flower flower = new Flower(FlowerColor.RED, FlowerType.ROSE, RoseSepalLength, RosePrice);
    

    @Test
    public void testPrice() {
        int price = 90;
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.BLUE;

        flower.setColor(color);
        Assertions.assertEquals("#0000FF", flower.getColor().toString());
    }
}
