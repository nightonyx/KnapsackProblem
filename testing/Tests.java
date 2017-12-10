import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void getBest() {
        Problem Prob = new Problem(5, 30, 10, 20);
        Prob.print();
        Population Pop = new Population(Prob, 20, 50);
        Pop.getBest().print();
        Pop.iterate(100000);
        Pop.getBest().print();
    }
}
