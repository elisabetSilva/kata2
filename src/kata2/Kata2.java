package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = new int[] {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        //Se asigana para cada clave, un valor que representa el número de veces que se repite
        for (int value : data) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value)+1 : 1);
        }
        
       //Recorre el conjunto de claves y muestra para cada clave su valor
       for (Integer key : histogram.keySet()) {
           System.out.println(key + " ==> " + histogram.get(key));
       }
    }  
} 