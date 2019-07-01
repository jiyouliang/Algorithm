import com.jyl.algo.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        SingleLinkedList<String> singleLinkedList1 = new SingleLinkedList<>();
        System.out.println(singleLinkedList1);
        singleLinkedList1.add("A");
        System.out.println(singleLinkedList1);
        singleLinkedList1.add("B");
        singleLinkedList1.add("C");
        System.out.println(singleLinkedList1);
    }
}
