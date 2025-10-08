package flower.store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {

    private List<Flower> flowers;

    public Store(){
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower fl ){
        this.flowers.add(fl );
    }

    public List<Flower> search(FlowerColor color){
        return flowers.stream().filter(flower -> flower.getColor() == color).collect(Collectors.toList());
    }

    public List<Flower> search(FlowerType type){
        return flowers.stream().filter(flower -> flower.getFlowerType() == type).collect(Collectors.toList());
    }

}
