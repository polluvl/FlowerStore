package flower.store;
import java.util.stream.DoubleStream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// @AllArgsConstructor
@NoArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice(){
        return flower.getPrice() * quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int n){
        this.quantity = n;
    }

    public Flower getFlower(){
        return this.flower;
    }

    public void setFlower(Flower f){
        this.flower = f;
    }
}
