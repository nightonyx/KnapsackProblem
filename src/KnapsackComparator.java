import java.util.Comparator;

public class KnapsackComparator implements Comparator<Knapsack> {
    /* Сравниваем по критерию "приспособленности" */
    @Override
    public int compare(Knapsack k1, Knapsack k2) {
        return k2.fitness() - k1.fitness();
    }

}
