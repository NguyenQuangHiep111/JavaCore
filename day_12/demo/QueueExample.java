package day_11.demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<Integer> LinkedList = new LinkedList<>();
//        LinkedList.add(3);
//        LinkedList.add(1);
//        LinkedList.add(9);
//        LinkedList.offer(9);
//        LinkedList.offer(6);
//        LinkedList.offer(4);
//
//        System.out.println(LinkedList);
//
//        System.out.println("Phần tử đầu tiên :" + LinkedList.element());
//        System.out.println("Phần tử đầu tiên :" + LinkedList.peek());
//
//        LinkedList.remove();
//        System.out.println(LinkedList);
//        LinkedList.poll();
//        System.out.println(LinkedList);


        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(2);
        System.out.println(priorityQueue);
        System.out.println("Phần tử đầu tiên :" + priorityQueue.element());

        priorityQueue.remove();
        System.out.println(priorityQueue);

        System.out.println("Phần tử đầu tiên :" + priorityQueue.element());

    }
}
