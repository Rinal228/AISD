import java.util.PriorityQueue;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(countValue(" 2 3 2 + 5 *"));
        System.out.println();


        Queue queue1 = new Queue();
        Queue queue2 = new Queue();
        Queue queue3 = new Queue();
        for(int i = 34; i < 39; i++) {

            queue1.putNumb((int) (Math.random() * 10 + 1));
            queue2.putNumb((int) (Math.random() * 10 + 1));
        }

        int size = queue1.getSize();
        for(int i = 0; i < size; i++) {
            queue3.putNumb(queue1.takeNumb());
            queue3.putNumb(queue2.takeNumb());
        }

        for (int i = 0; i < size * 2; i++) {
            for (int j = 0; j < size * 2; j++) {
                double a = queue3.takeNumb();
                double b = queue3.takeNumb();
                if (a <= b) {
                    queue3.putNumb(a);
                    queue3.putNumb(b);
                } else {
                    queue3.putNumb(b);
                    queue3.putNumb(a);
                }
            }
            for (int k = 0; k < size * 2; k++) {
                queue3.putNumb(queue3.takeNumb());
            }
        }
        for(int i = 0; i < size * 2; i++) {
            System.out.println(queue3.takeNumb());
        }
    }

    public static double countValue(String expression) {
        for(int i = 0; i < expression.length(); i++) {
            char element = expression.charAt(i);
            if(isDigit(element)) {
                Stack.putNumb(Double.valueOf(String.valueOf(element)));
            }
            if(element == '+') {
                Stack.putNumb(Stack.takeNumb() + Stack.takeNumb());
            }
            if (element == '-') {
                Stack.putNumb(Stack.takeNumb() - Stack.takeNumb());
            }
            if(element == '*') {
                Stack.putNumb(Stack.takeNumb() * Stack.takeNumb());
            }

        }
        if(Stack.getTop() == 0) {
            return Stack.takeNumb();
        } else {
            return Stack.takeNumb() * Stack.takeNumb();
        }
    }

}