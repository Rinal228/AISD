import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------1--------");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String comparingWord = scanner.nextLine();
        boolean flag = false;
        int index = word.indexOf(comparingWord.charAt(0));
        if(index == -1) {
            System.out.println(flag);
        } else {
            for(int i = index; i < word.length(); i++) {
                String changingWord = "";
                for(int j = i; j < word.length(); j++) {
                    if(j == i && changingWord.length() == word.length()) {
                        break;
                    }
                    char element = word.charAt(j);
                    changingWord += element;
                    if(j == word.length() - 1) {
                        j = -1;
                    }


                }
                if(comparingWord.equals(changingWord)) {
                    flag = true;
                }
            }
            System.out.println(flag);
        }
        System.out.println();
        System.out.println("--------2--------");
        int[] array = {1, 2, 3, 4, 5, 7};
        // за O(n)
        int indexArray = array[0];
        for(int i = 0; i < array.length; i++) {
            if(indexArray != array[i]) {
                System.out.println(indexArray);
                break;
            } else {
                indexArray++;
            }
        }
        System.out.println();
        // за T(1)
        int sum = 0;

        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            sum += element;
        }
        n++;
        int correctSum = (n * (n + 1)) / 2;
        System.out.println(correctSum - sum);






    }
}