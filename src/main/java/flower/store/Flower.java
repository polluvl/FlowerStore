package flower.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private int sepalLength;
    private int price;
    private FlowerType flowerType;
}
