package com.cdrock.datastructure.tree;

/**
 * @author Chandan Sharma
 */

public class Node<T> {

    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
        System.out.print(data + " -->");
    }

}