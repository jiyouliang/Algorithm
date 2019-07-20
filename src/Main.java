import com.jyl.algo.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

       /* SingleLinkedList<String> singleLinkedList1 = new SingleLinkedList<>();
        System.out.println(singleLinkedList1);
        singleLinkedList1.add("A");
        System.out.println(singleLinkedList1);
        singleLinkedList1.add("B");
        singleLinkedList1.add("C");
        System.out.println(singleLinkedList1);*/

        System.out.println("链表反转");
        SingleLinkedList<String> list2 = new SingleLinkedList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println("未反转前：" + list2);
        list2.reverse();
        System.out.println("反转后：" + list2);

    }
}
