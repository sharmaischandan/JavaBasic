package com.cdrock.datastructure.tree;

import java.util.Stack;

/**
 * @author Chandan Sharma
 */
public class Tree {
    public static void main(String[] args) {
        // We create the nodes of our tree
        Node<String> A = new Node<String>("A");
        Node<String> B = new Node<String>("B");
        Node<String> C = new Node<String>("C");
        Node<String> D = new Node<String>("D");
        Node<String> E = new Node<String>("E");
        Node<String> F = new Node<String>("F");
        Node<String> G = new Node<String>("G");
        Node<String> H = new Node<String>("H");
        Node<String> I = new Node<String>("I");
        Node<String> J = new Node<String>("J");
        Node<String> K = new Node<String>("K");

        // Root and building of the tree
        Node<String> root = A;
        A.left = B; A.right = C;
        B.left = D; B.right = E;
        D.left = H; D.right = I;
        E.left = J;
        C.left = F; C.right = G;
        G.left = K;
        System.out.println("\n<--------------> preOrderTraverse");
        preOrderTraverse( root);
        System.out.println("\n<--------------> iterativePreOrderTraverse");
        iterativePreOrderTraverse(root);
    }

    //Tree Pre Order Traversal With Recursion
    // Root, Left, Right
    public static <T> void preOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        System.out.print(node.data + "--> ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    //Tree Pre Order Traversal With iteration
    public static <T> void iterativePreOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        // We create an empty stack and we push root to it
        Stack<Node<T>> nodeStack = new Stack<>();
        nodeStack.push(node);

        // We pop all items one by one.
        // For each item, we make the following steps : print data, push its right child, push its left child
        // We push right child in first for that left is processed first
        while(!nodeStack.empty()) {
            Node<T> currentNode = nodeStack.pop();
            System.out.print(currentNode.data  + " -->");

            if (currentNode.right != null)
                nodeStack.push(currentNode.right);

            if (currentNode.left != null)
                nodeStack.push(currentNode.left);
        }

    }
}
