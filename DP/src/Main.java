import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci1(10947));
        System.out.println(fibonacci2(10));
        fibonacci3("qwertyuiop");
        System.out.println(task4());
        task5();




    }
    public static boolean fibonacci1(int n) {
        int i = 1;

        int j = i;
        while(j <= n) {
            if(j == n || i == n) return true;
            j += i;
            i += j;
        }
        return false;
    }
    public static int fibonacci2(int n) {
        int i = 1;
        int index = 2;
        int j = i;
        while(index <= n) {
            j += i;
            index++;
            i += j;
            index++;
            if(index == n) return (j + i) % 10;
            if(index == n + 1) return i % 10;
        }
        return -1;

    }
    public static void fibonacci3(String sentence) {
        int i = 1;
        int size = sentence.length();

        int j = i;
        System.out.print(sentence.charAt(i));
        System.out.print(sentence.charAt(i));
        while(j < size) {
            j += i;
            if(j >= size) break;
            System.out.print(sentence.charAt(j));

            i += j;
            if(i >= size) break;
            System.out.print(sentence.charAt(i));
        }
    }
    public static int task4(){
        Scanner scanner = new Scanner(System.in);

        int size = 3;
        int[][] arr = new int[size][size];
        for(int k = 0; k < size; k++) {
            for(int l = 0; l < size; l++) {
                arr[k][l] = scanner.nextInt();
            }
        }
        int sum = arr[0][0];
        int i = 0, j = 0;
        while(i < size - 1 || j < size - 1) {
            if(i == size - 1) {
                j++;
            } else if(j == size - 1) {
                i++;
            } else {
                if(arr[i+1][j] > arr[i][j+1]) {
                    j++;
                } else {
                    i++;
                }
            }
            sum += arr[i][j];
        }
        for(int k = 0; k < size; k++) {
            for(int l = 0; l < size; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
        return sum;
    }
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }
        list.sort(null);
        int sum = 0;
        int min = 0;
        for(int i = 0; i< n - 1; i++) {
            sum += (list.get(i + 1) - list.get(i));
            min++;
        }
        System.out.println("sum: " + sum);
        System.out.println("min: " + min);

    }
}