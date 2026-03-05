public class Queue {
    private double[] arr;
    private int last = 0;

    public Queue() {
        this.arr = new double[100];
    }
    public int getSize() {
        return last;
    }

    public void putNumb(double numb) {
        arr[last++] = numb;
    }
    public double takeNumb() {
        double numb = arr[0];
        for(int i = 0; i < last - 1; i++) {
            arr[i] = arr[i + 1];
        }
        last--;
        return numb;
    }
}
