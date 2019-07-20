package com.jyl.algo;

import java.util.ArrayList;

/**
 * 单链表
 */
public class SingleLinkedList<T> {

    //哨兵节点
    private final Node<T> head = new Node<>();

    /**
     * 添加元素：按顺序添加
     *
     * @param data
     */
    public void add(T data) {
        Node<T> p = head;
        while (p.next != null) {
            p = p.next;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = p.next;
        p.next = newNode;
    }


    /**
     * 节点
     *
     * @param <T>
     */
    private static class Node<T> {
        Node<T> next;//下一节点
        T data;//数据

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public Node(Node<T> next, T data) {
            this.next = next;
            this.data = data;
        }
    }


    /**
     * 反转链表:
     * 1.从第二个节点往后开始，将后续节点next指向前序节点
     * 2.最后将第一个节点插入末尾，即可完成反转链表
     */
    public void reverse() {
        if (head.next == null) {
            return;
        }
        //当前节点,从哨兵节点后面开始算
        Node<T> curr = head.next;
        Node<T> prev = null;//前序节点
        Node<T> next = null;//后续节点
        while (curr != null) {
            next = curr.next;
            curr.next = prev; //指向前序节点
            prev = curr;    //前序节点移动到当前节点
            curr = next; //当前节点后移

        }
        //最后将第一个节点插入末尾
        head.next = prev;
    }

    @Override
    public String toString() {
        Node<T> p = head.next;
        if (null == p) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (p != null) {
            sb.append(p.data).append(",");
            p = p.next;
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
