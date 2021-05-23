package com.cdrock.datastructure.tree;


// Java program for different tree traversals

/* Class containing left and right child of current
node and key value*/
class NodeB {
    int key;
    NodeB left, right;

    public NodeB(int item) {
        key = item;
        left = right = null;
    }

    public NodeB() {
    }


    protected void insert(int value, NodeB nodeB) {
    }
}

class BinaryTreeTraverse extends NodeB {
    // Root of Binary Tree
    NodeB root;

    BinaryTreeTraverse() {
        root = null;
    }

    //insert node
    public void insert(int value, NodeB nodeB) {
        if (nodeB == null)
            return;

        if (value <= key) {
            if (left == null) {
                nodeB.left = new NodeB(value);
            } else
                left.insert(value, nodeB);
        } else {
            if (right == null) {
                nodeB.right = new NodeB(value);
            } else
                right.insert(value, nodeB);
        }
    }

    /* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
    void printPostorder(NodeB nodeB) {
        if (nodeB == null)
            return;

        // first recur on left subtree
        printPostorder(nodeB.left);

        // then recur on right subtree
        printPostorder(nodeB.right);

        // now deal with the node
        System.out.print(nodeB.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(NodeB nodeB) {
        if (nodeB == null)
            return;

        /* first recur on left child */
        printInorder(nodeB.left);

        /* then print the data of node */
        System.out.print(nodeB.key + " ");

        /* now recur on right child */
        printInorder(nodeB.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(NodeB nodeB) {
        // Traverse <root> <left subtree> <right subtree>
        if (nodeB == null)
            return;

        /* first print data of node */
        System.out.print(nodeB.key + " ");

        /* then recur on left sutree */
        System.out.print(" Call left");
        printPreorder(nodeB.left);

        /* now recur on right subtree */
        System.out.print(" Call right");
        printPreorder(nodeB.right);
    }


    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    void insert(int value) {
        insert(value, root);
    }

    // Driver method
    public static void main(String[] args) {
        BinaryTreeTraverse tree = new BinaryTreeTraverse();
        tree.root = new NodeB(10);
        tree.root.left = new NodeB(5);
        tree.root.right = new NodeB(13);
        tree.root.left.left = new NodeB(4);
        tree.root.left.right = new NodeB(6);

        //     10
        //    /  \
        //   5    13
        //   /  \
        //  4    6

        //NodeB nb = new NodeB();
        tree.insert(16);

        System.out.println("Breath first traversal(Level order) view binary tree is \n1 2 3 4 5");
        // Depth first traversal
        System.out.println("Preorder traversal of binary tree is ");  // root -> left -> right
        tree.printPreorder(); // 1 24 53

        System.out.println("\nInorder traversal of binary tree is "); // left -> root -> right
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is "); // left -> right -> root
        tree.printPostorder();
    }
}

