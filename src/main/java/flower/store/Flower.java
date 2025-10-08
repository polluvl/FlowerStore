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

    public Flower(Flower other){
        this.color = other.color;
        this.flowerType = other.flowerType;
        this.sepalLength = other.sepalLength;
        this.price = other.price;
    }

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color){
        this.color = color;
    }

    public FlowerType getFlowerType(){
        return this.flowerType;
    }

    public void setFlowerType(FlowerType flowerType){
        this.flowerType = flowerType;
    }

    public int getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(int l){
        this.sepalLength = (int) l;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int p){
        this.price = p;
    }
}
