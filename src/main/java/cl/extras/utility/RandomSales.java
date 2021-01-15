package cl.extras.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomSales {
    public List<Integer> getSalesNumbers(int size){

        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < size ; i++)
        {
            values.add(ThreadLocalRandom.current().nextInt(100, 2000 + 1));
        }
        return values;
    }
}
