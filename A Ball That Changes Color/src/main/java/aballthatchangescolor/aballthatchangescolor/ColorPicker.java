package aballthatchangescolor.aballthatchangescolor;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Tuomas on 18.4.2017.
 */

class ColorPicker {

    private LinkedList<Integer> numbers;
    private int current;

    ColorPicker(int c) {
        numbers = new LinkedList<Integer>();
        current = c;
        int num = 1;

        //let's add numbers from 1 to 10 excluding the number that represents current color, so
        //different color will be chosen
        while (num <= 10) {
            if (num != current)
                numbers.add(num);
            num++;
        }
    }

    //randomly chooses number from the list.
    int getColor() {

        int length = numbers.size();
        Random r = new Random();
        int index = r.nextInt(length - 1);
        int number = numbers.get(index);
        return number;

    }
}

