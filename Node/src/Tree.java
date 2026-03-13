public class Tree<T extends Number>{
    Node<T> root;
    static int height = 0;


    public Tree() {
        root = null;
    }
    public Tree(T root) {
        this.root = new Node<T>(root);
    }

    public void add(T newNode) {
        if(root == null) {
            root = new Node<>(newNode);
            return;
        }

        Node<T> node = root;
        height++;

        while(true) {
            if(node.compareTo(newNode) == 1) {
                if(node.left == null) {
                    node.left = new Node<>(newNode);
                    return;
                } else {
                    node = node.left;
                }
            } else {
                if(node.right == null) {
                    node.right = new Node<>(newNode);
                    return;
                } else {
                    node = node.right;
                }
            }
        }
    }
    public void clear() {
        root = null;
    }

    public void remove(T removingNode) {
        Node<T> node = root;
        Node<T> oldNode = null;

        if(node.compareTo(removingNode) == 0) {
            root = null;
        } else {
            while(node.compareTo(removingNode) != 0) {
                oldNode = node;
                if(node.compareTo(removingNode) == 1) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }

            if(node.left == null && node.right == null) {
                if(oldNode.left == node) {
                    oldNode.left = null;
                } else {
                    oldNode.right = null;
                }
            } else if(node.left == null) {
                if(oldNode.left == node) {
                    oldNode.left = node.right;
                } else {
                    oldNode.right = node.right;
                }
            } else if(node.right == null) {
                if(oldNode.left == node) {
                    oldNode.left = node.left;
                } else {
                    oldNode.right = node.left;
                }
            }
        }
    }
    public boolean contains(T value) {
        Node<T> node = root;

        while(node != null) {
            if(node.compareTo(value) == 0) {
                return true;
            } else if(node.compareTo(value) == 1) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return false;
    }

    public String toString() {
        return toStringRec(root);
    }

    private String toStringRec(Node<T> node) {
        if(node == null) return "";

        String result = "";

        String leftStr = toStringRec(node.left);
        if(!leftStr.equals("")) {
            result += leftStr + ", ";
        }

        result += node.data;

        String rightStr = toStringRec(node.right);
        if(!rightStr.equals("")) {
            result += ", " + rightStr;
        }

        return result;
    }
    public void pre() {
        preRec(root);
        System.out.println();
    }

    private void preRec(Node<T> node) {
        if(node == null) return;

        System.out.print(node.data + " ");
        preRec(node.left);
        preRec(node.right);
    }

    public void in() {
        inRec(root);
        System.out.println();
    }

    private void inRec(Node<T> node) {
        if(node == null) return;

        inRec(node.left);
        System.out.print(node.data + " ");
        inRec(node.right);
    }

    public void post() {
        postRec(root);
        System.out.println();
    }

    private void postRec(Node<T> node) {
        if(node == null) return;

        postRec(node.left);
        postRec(node.right);
        System.out.print(node.data + " ");
    }
}