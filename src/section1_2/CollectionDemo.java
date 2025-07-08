package section1_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionDemo {
    public static void main(String[] args) {
        int numElements = 100_000;

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(0, i); // Thêm vào đầu
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add(0, element): " + (end - start) / 1_000_000 + " ms");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add(0, element): " + (end - start) / 1_000_000 + " ms");


        System.out.println("Truy cập phần tử ngẫu nhiên trong ArrayList và LinkedList");
        int size = 1_000_000;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList1.add(i);
            linkedList1.add(i);
        }

        // Truy cập phần tử ở giữa
        long start1 = System.nanoTime();
        arrayList1.get(size / 2);
        long end1 = System.nanoTime();
        System.out.println("ArrayList get: " + (end1 - start1) + " ns");

        start = System.nanoTime();
        linkedList1.get(size / 2);
        end = System.nanoTime();
        System.out.println("LinkedList get: " + (end - start) + " ns");
    }
}
