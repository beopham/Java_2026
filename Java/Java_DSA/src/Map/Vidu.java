package Map;

import java.util.HashMap;
import java.util.Map;

public class Vidu {
    public static void main(String[] args) {
        Map<Integer, Integer> danhsachdiem = new HashMap<>();
        danhsachdiem.put(0, 1);
        danhsachdiem.put(1, 3);
        danhsachdiem.put(10, 3);
        danhsachdiem.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
        int sum = 0;
        for (int value : danhsachdiem.values()) {
            System.out.println(value);
            sum += value;
        }
        System.out.println("Sum value =" + sum);

        System.out.println(danhsachdiem.get(1));
        System.out.println(danhsachdiem.keySet());
        for(int key : danhsachdiem.keySet())
        {
            int values=danhsachdiem.get(key);
            System.out.println("Key " + key + " Values " +values);
        }
    }

}
