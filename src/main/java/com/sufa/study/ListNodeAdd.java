package com.sufa.study;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/26 9:29
 **/

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class ListNodeAdd {

    public static void main(String[] args) {

        LinkedList L1 = new LinkedList<Integer>();
        for (int i = 0; i < 3; i++) {
            int a = i + 3;
            L1.add(a);
            System.out.println("L1" + a);
        }

        LinkedList L2 = new LinkedList<Integer>();
        for (int i = 0; i < 3; i++) {
            int a = i + 5;
            L2.add(a);
            System.out.println("L2" + a);
        }

        LinkedList resLinkedList = addTwoNumbers(L1, L2);
        for (Object o : resLinkedList) {
            System.out.println("================================");
            System.out.println(o);
        }
    }

    public static LinkedList addTwoNumbers(LinkedList<Integer> L1, LinkedList l2) {
        StringBuffer sb = new StringBuffer();
        for (int i = L1.size() -1; i >= 0; i--) {
            sb.append(L1.get(i));
        }
        Integer sum1 = Integer.valueOf(sb.toString());

        StringBuffer sb2 = new StringBuffer();
        for (int i = l2.size()-1; i >= 0 ; i--) {
            sb2.append(l2.get(i));
        }

        Integer sum2 = Integer.valueOf(sb2.toString());
        Integer allSum = sum2 + sum1;

        StringBuffer sb3 = new StringBuffer();
        String tempSum = allSum.toString();
        int lastSum = tempSum.length();
        LinkedList resLinkedList = new LinkedList();
        for (int i = lastSum-1 ; i >= 0 ; i--) {
            resLinkedList.add(tempSum.charAt(i));
        }
        return resLinkedList;
    }
}