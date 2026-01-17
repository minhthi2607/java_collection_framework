package bai6;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Thêm node vào BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);   // Bước 1
            postOrderRec(root.right);  // Bước 2
            System.out.print(root.data + " "); // Bước 3
        }
    }

    public void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " "); // Bước 1
        preorder(root.left);               // Bước 2
        preorder(root.right);              // Bước 3
    }


}