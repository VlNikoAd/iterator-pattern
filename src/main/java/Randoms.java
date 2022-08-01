import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final Random random;
    private final int min, max;


    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public Random getRandom() {
        return random;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getRandom().nextInt(getMin(), getMax() +1);
            }
        };
    }
}
