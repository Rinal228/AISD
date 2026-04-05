public class MyTree {

    public static int calculate(Node node) {
        if (node == null) return 0;
        int leftSum = calculate(node.left);
        int rightSum = calculate(node.right);
        int totalSum = node.value + leftSum + rightSum;


        return totalSum;
    }
}