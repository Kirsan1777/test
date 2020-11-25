package nikita;

import nikita.circle.entity.Circle;
import nikita.circle.service.CircleService;
import nikita.even.entity.EvenNumber;
import nikita.even.service.EvenNumberService;
import nikita.month.service.MonthsService;
import nikita.square.service.SquareNumberService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //todo негативный и положительный результатв тестировании
        //todo
        SquareNumberService square = new SquareNumberService();
        MonthsService month = new MonthsService();
        EvenNumber even = new EvenNumber();
        EvenNumberService testEven = new EvenNumberService();
        Circle circle = new Circle();
        CircleService temp = new CircleService();
        List<Integer> list = new ArrayList<>();
        int count = month.calculateDays("FEBRUARY", 1344);
        System.out.println("Count of day = " + count);
        square.calculateSquareLastNumber(555);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        even.setNumbers(list);
        boolean result = testEven.checkEvenNumber(even.getNumbers());
        System.out.println("Result 4th exercise = " + result);
        circle.setLength(temp.calculateLength(3));
        /*String str1 = "abc";
        String str2 = "абв";
        byte test1[] = str1.getBytes();
        byte test2[] = str2.getBytes();
        System.out.println("English lit = " + test1);
        System.out.println("Russian lit = " + test2);

        for (int i = 0; i < test1.length; i++) {
            System.out.println(test1[i]);
        }*/

    }


}

