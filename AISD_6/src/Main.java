import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(first());
        //System.out.println(second());
        //System.out.println(third());
        //fourth();
        //fifth();
        sixith();






    }
    public static int first() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 6;
        int firstIndex = 0;
        int lastIndex = size - 1;
        int target = scanner.nextInt();
        for(int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }
        for(int i = 0; i < size; i++) {
            if(arrayList.get((firstIndex + lastIndex) / 2) < target) {
                firstIndex = (firstIndex + lastIndex) / 2;
            }
            if(arrayList.get((firstIndex + lastIndex) / 2) > target) {
                lastIndex = (firstIndex + lastIndex) / 2;
            }
            if (arrayList.get((firstIndex + lastIndex) / 2) == target) {
                return (firstIndex + lastIndex) / 2;
            }
        }
        return -1;
    }
    public static boolean second() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (((first & 1) ^ (second & 1)) != 0) {
            return false;
        }
        if ((second & 7) != 0 && (second & 7) != 1 && (second & 7) != 4) {
            return false;
        }
        if(second == first * first) {
            return true;
        } else {
            return false;
        }
    }
    public static String third() {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String newSentence = "";
        String[] arr = sentence.split(" ");
        for(int i = arr.length - 1; i >= 0; i--) {
            newSentence += arr[i];
            newSentence += " ";
        }
        return newSentence;
    }
    public static void fourth() {
        Node node = new Node(3);
        node.left = new Node(2);
        node.left.left = new Node(1);
        node.left.right = new Node(2);
        node.right = new Node(5);
        System.out.println(node.value + ": " + (MyTree.calculate(node) - node.value));
        System.out.println(node.left.value + ": " + (MyTree.calculate(node.left) - node.left.value));
        System.out.println(node.left.left.value + ": " + (MyTree.calculate(node.left.left) - node.left.left.value));
        System.out.println(node.left.right.value + ": " + (MyTree.calculate(node.left.right) - node.left.right.value));
        System.out.println(node.right.value + ": " + MyTree.calculate(node.right.left));

    }
    public static void fifth() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int target = scanner.nextInt();
        for(int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }
        arrayList.sort(null);
        int result = 0;
        for(int i = 4; i >= 0; i--) {
            if(result < target && result + arrayList.get(i) <= target) {
                result += arrayList.get(i);
                System.out.println(i);
            }
        }
        System.out.println(result);
    }
    public static void sixith(){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();;
        Set<Integer> third = new HashSet<>();;
        int element;
        for(int i = 0; i < 3; i++) {
            element = scanner.nextInt();
            first.add(element);
        }
        for(int i = 0; i < 3; i++) {
            element = scanner.nextInt();
            second.add(element);
        }
        for(int i = 0; i < 3; i++) {
            element = scanner.nextInt();
            third.add(element);
        }
        for (Integer value : first) {
            if(second.contains(value) && third.contains(value)) {
                System.out.println(value);
                break;
            }
        }

    }
}