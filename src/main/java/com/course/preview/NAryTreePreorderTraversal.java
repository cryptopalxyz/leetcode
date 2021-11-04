package com.course.preview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NAryTreePreorderTraversal {

    public static List<Integer> preorder(Node root) {
     List<Integer> list = new ArrayList<>();
     dns(list, root);
     return list;
    }

    private static void dns(List<Integer> list, Node root) {
        if (root == null) return;
        list.add(root.val);
        if (root.children != null) {
            for (int i=0;i<root.children.size();i++)
                dns(list, root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        root.children = Arrays.asList(n3,n2, n4);
        n3.children = Arrays.asList(n5, n6);
        List<Integer> result = preorder(root);
        System.out.println(result);
    }
}


/*

先把当前node加入list，在循环child；此乃先序遍历
；

看父节点的位置，放在前面叫前序遍历，放在中间叫中序遍历，放在后面叫后序遍历

 */


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};