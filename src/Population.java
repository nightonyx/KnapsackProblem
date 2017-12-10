import java.util.PriorityQueue;

public class Population {
    /*  Отбираем, выбираем родителей, "скрещиваем"  */
    private Problem problem;
    private int mutationPercent;
    private PriorityQueue<Knapsack> population;

    public Population(Problem p, int size, int mu) {
        problem = p;
        mutationPercent = mu;
        generateRandomPopulation(size);
    }

    private void generateRandomPopulation(int size) {
        population = new PriorityQueue<>(new KnapsackComparator());
        for (int i = 0; i < size; i++) {
            population.add(new Knapsack(problem));
        }
    }

    public void iterate(int iterations) {
        for (int i = 0; i < iterations; i++) {
            iterate();
        }
    }

    public void iterate() {

        // Избавляемся от худщих
        PriorityQueue<Knapsack> newPop = new PriorityQueue<>(new KnapsackComparator());
        while (population.size() > 2) {
            newPop.add(population.poll());
        }
        population = newPop;

        // Взять двух лучших родителей
        Knapsack k1 = population.poll();
        Knapsack k2 = population.poll();

        // Скрещиваем
        Knapsack child1 = Knapsack.breed(k1, k2, mutationPercent);
        Knapsack child2 = Knapsack.breed(k1, k2, mutationPercent);

        // Положить родителей
        population.add(k1);
        population.add(k2);

        // Добавить детей
        population.add(child1);
        population.add(child2);

    }

    public Knapsack getBest() {
        return population.peek();
    }
}