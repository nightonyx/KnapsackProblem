import java.util.ArrayList;

public class Problem {
    /*  Создаем условия задачи и выводим их в консоль   */
    public ArrayList<Item> items;
    public int maxWeight;

    public Problem(int size, int maxw, int maxItemWeight, int maxItemValue) {
        items = Item.generateRandomItems(size, maxItemWeight, maxItemValue);
        maxWeight = maxw;
    }

    public void print() {
        System.out.println("====== PROBLEM ======");
        System.out.print("{");
        for (Item i : items) {
            System.out.print("[w:" + i.weight + ", v:" + i.value + "] ");
        }
        System.out.println("}");
        System.out.println("maxWeight: " + maxWeight);
        System.out.println("======THE TASK IS SET ======");
    }

}
