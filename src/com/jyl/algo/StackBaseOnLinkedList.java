package com.jyl.algo;

public class StackBaseOnLinkedList<T> {
    private Node<T> head = new Node<T>();//头结点,哨兵节点

    private static class Node<T> {
        Node<T> next;
        T data;

        public Node(Node<T> next, T data) {
            this.next = next;
            this.data = data;
        }

        public Node(T data) {
            this.data = data;
        }

        public Node() {
        }
    }

    /**
     * 入栈
     * @param data
     */
    public boolean push(T data){
        Node<T> node = new Node<T>(data);
        node.next = head.next;
        head.next = node;
        return true;
    }

    /**
     * 出栈
     * @return
     */
    public T pop(){
        Node<T> p = head;
        if(p.next == null){
            return null;
        }else{
            p = p.next;
            //更新栈
            head.next = p.next;
            return p.data;//返回数据
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node p = head;
        if(p.next == null){
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        p = p.next;//从哨兵节点下一个开始
        while (p.next != null){
            stringBuilder.append(p.data).append(",");
            p = p.next;
        }
        stringBuilder.append(p.data);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /**
     * 测试栈
     * @param args
     */
    public static void main(String[] args) {
        StackBaseOnLinkedList<String> stack = new StackBaseOnLinkedList<>();
        System.out.println(stack);
        System.out.println("入栈");
        stack.push("A");
        System.out.println(stack);
        System.out.println("入栈");
        stack.push("B");
        System.out.println(stack);
        System.out.println("出栈");
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("出栈");
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("出栈");
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
