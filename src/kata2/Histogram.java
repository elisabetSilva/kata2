package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;


    public Histogram(T[] array) {
        this.data = array;
    }
    
    public T[] getArray() {
        return data;
    }
    
    public Map<T,Integer> getHistogram(){
        Map <T,Integer> histogram = new HashMap<>();
            for (T i : data) {
                    histogram.put(i, histogram.containsKey(i) ? histogram.get(i)+1 : 1); 
            }
        return histogram;
    }
}