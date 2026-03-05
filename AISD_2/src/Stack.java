public class Stack {
    private static double[] arr = new double[100];
    private static int top = -1;

    public static void putNumb(double numb) {
        arr[++top] = numb;
    }
    public static double takeNumb() {
        return arr[top--];
    }
    public static int getTop() {
        return top;
    }
}
