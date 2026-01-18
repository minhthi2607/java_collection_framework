package bai7;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Xoá node 70");
        bst.delete(70);

        System.out.println("Tìm 60: " + bst.search( bst.root,60)); // true
        System.out.println("Tìm 25: " + bst.search(bst.root,25)); // false
        System.out.println("Tìm 80: " + bst.search(bst.root,80)); // true

    }
}

