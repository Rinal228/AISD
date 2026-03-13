public class Node<T extends  Number> {
    T data;
    Node<T> right;
    Node<T> left;

    public Node(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
    public int compareTo(T data) {
        if(this.data.doubleValue() > data.doubleValue()) {
            return 1;
        } else if(this.data.doubleValue() < data.doubleValue()){
            return -1;
        } else {
            return 0;
        }


    }
}
