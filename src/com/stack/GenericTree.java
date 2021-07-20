package com.stack;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Stack;

public class GenericTree {

    public class Node
    {
        int data;
        ArrayList<Node> children=new ArrayList<>();


    }
    public void createTree() {
        Node root = null;
        int arr[] = {4, 5, -1, 6, -1, 2, 6, -1, 9, -1, 0, 3};
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                st.pop();
            else {
                Node t = new Node();
                t.data = arr[i];


            if (st.size() > 0) {
                st.peek().children.add(t);
            } else
                root = t;

            st.push(t);
        }
    }
        System.out.println(st);
    }

    public static void main(String[]args){

        GenericTree t=new GenericTree();
        t.createTree();
    }
}
