package Ex2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i< 10; i++ ){
            intList.add(rand.nextInt(50));
        }
        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
