import java.util.ArrayList;
import java.util.Random;

public class Item {


    /* Создаем предмет(предметы) */
    public int weight;
    public int value;

    public Item(int w, int v) {
        weight = w;
        value = v;
    }

    public static ArrayList<Item> generateRandomItems(int size, int maxWeight, int maxValue) {
        Random rand = new Random();
        ArrayList<Item> list = new ArrayList<Item>();
        for (int i = 0; i < size; i++) {
            list.add(new Item(rand.nextInt(maxWeight) + 1, rand.nextInt(maxValue) + 1));
        }
        return list;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}
