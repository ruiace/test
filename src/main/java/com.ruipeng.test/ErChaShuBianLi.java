package com.ruipeng.test;

import java.util.ArrayList;
import java.util.List;

public class ErChaShuBianLi {

    static List<Integer> qianxuNumList = new ArrayList();
    static List<Integer> zhongxuNumList = new ArrayList();
    static List<Integer> houxuNumList = new ArrayList();

    public static void main(String[] args) {
        TreeNode node = getNode();
//        qianxu(node);
//        for(int i =0;i< qianxuNumList.size();i++){
//            System.out.println(qianxuNumList.get(i));
//        }
//        zhongxu(node);
//        for(int i =0;i< zhongxuNumList.size();i++){
//            System.out.println(zhongxuNumList.get(i));
//        }

        houxu(getNode());
        for (int i = 0; i < houxuNumList.size(); i++) {
            System.out.println(houxuNumList.get(i));
        }

    }

    public static void qianxu(TreeNode node) {
        qianxuNumList.add(node.getValue());
        if (node.getLeft() != null) {
            qianxu(node.getLeft());
        }
        if (node.getRight() != null) {
            qianxu(node.getRight());
        }
    }

    public static void zhongxu(TreeNode node) {
        if (node.getLeft() != null) {
            zhongxu(node.getLeft());
        }
        zhongxuNumList.add(node.getValue());
        if (node.getRight() != null) {
            zhongxu(node.getRight());
        }
    }


    public static void houxu(TreeNode node) {
        if (node.getLeft() != null) {
            houxu(node.getLeft());
        }
        if (node.getRight() != null) {
            houxu(node.getRight());
        }
        houxuNumList.add(node.getValue());
    }
//
//
//    // 用递归的方法进行先序遍历
//    public static void qinaxuDigui(TreeNode treeNode) {
//        qianxuNumList.add(treeNode.getValue());
//        if (treeNode.left != null) {
//            qinaxuDigui(treeNode.left);
//        }
//        if (treeNode.right != null) {
//            qinaxuDigui(treeNode.right);
//        }
//    }
//
//    // 用递归的方法进行中序遍历
//    public static void zhongxuDigui(TreeNode treeNode) {
//        if (treeNode.left != null) {
//            zhongxuDigui(treeNode.left);
//        }
//        zhongxuNumList.add(treeNode.val);
//        if (treeNode.right != null) {
//            zhongxuDigui(treeNode.right);
//        }
//    }
//
//    // 用递归的方法进行后序遍历
//    public static  void houxuDigui(TreeNode treeNode,List<Integer> houxuNumList) {
//        if (treeNode.left != null) {
//            houxuDigui(treeNode.left);
//        }
//        if (treeNode.right != null) {
//            houxuDigui(treeNode.right);
//        }
//        houxuNumList.add(treeNode.getValue());
//    }

    public static TreeNode getNode() {
        TreeNode node8 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        node4.setRight(node7);
        node2.setLeft(node4);
        node6.setLeft(node8);
        node3.setLeft(node5);
        node3.setRight(node6);
        node1.setLeft(node2);
        node1.setRight(node3);
        return node1;
    }
}
