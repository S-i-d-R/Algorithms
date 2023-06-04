package Seminar_4;

public class Main {
    public static void main(String[] args) {
        RedBlackTree redBlackTree = new RedBlackTree();

        redBlackTree.addNode(10);
        redBlackTree.addNode(80);
        redBlackTree.addNode(70);
        redBlackTree.addNode(20);
        redBlackTree.addNode(90);
        redBlackTree.addNode(40);
        redBlackTree .addNode(30);

        redBlackTree.printTree();
    }
}
