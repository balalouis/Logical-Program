import array.LogicalProgramInArray;
import array.MyArray;
import company.Litmus;
import company.PicsArt;
import company.TCS;
import graph.Graph;
import hashmap.LogicalProgramInHashMap;
import hashmap.MyHashMapJava;
import leetcode.LeetCodeMedium;
import linkedlist.DoubleLinkedList;
import linkedlist.MySingleLinkList;
import queue.MyQueueViaArray;
import queue.MyQueueViaLinkedList;
import recursive.Factorial;
import recursive.Fibonacci;
import stack.MyStackViaArray;
import stack.MyStackViaLinkedList;
import tree.MyTree;

import static java.lang.System.out;

import java.util.Arrays;

public class LogicalProgram {

    private static String palindromeText = "";

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10, 12};
        reverseArray(num);
    }

    private static void traverseString() {
        String fullString = "cbbd";

        for (int i = 0; i < fullString.length(); i++) {
            for (int j = fullString.length(); j > i; j--) {
                String sub = fullString.substring(i, j);
                if (sub.length() > 1) {
                    out.println(sub);
                    isPalindrome(sub);
                }
            }
            out.println("-------");
        }
        out.println("Palindrome :" + palindromeText);
    }

    private static void reverseArray(int[] num) {
        out.println("Before: " + Arrays.toString(num));
        for (int startPos = 0, endPos = num.length - 1; startPos < num.length / 2; startPos++, endPos--) {
            int temp = num[endPos];
            num[endPos] = num[startPos];
            num[startPos] = temp;
        }
        out.println("After: " + Arrays.toString(num));
    }

    private static void isPalindrome(String text) {
        char[] textArray = text.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0, j = text.length() - 1; i < text.length(); i++, j--) {
            if (textArray[i] != textArray[j]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome && text.length() > palindromeText.length()) {
            palindromeText = text;
        }
    }

    private static void fibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int fib = fibonacci.findFibonacciViaRecursive(0, 1, 8);
        out.println("Fibo: " + fib);
    }

    private static void factorial() {
        Factorial factorial = new Factorial();
        int fact = factorial.findFactorialViaLoop(6, 6);
        out.println("Fact : " + fact);
    }

    private static void myArray() {
        MyArray myArray = new MyArray();
        myArray.printData();

        myArray.pushItem("A");
        myArray.pushItem("B");
        myArray.pushItem("C");
        myArray.pushItem("D");
        myArray.pushItem("E");
        myArray.pushItem("F");
        myArray.delete(4);
    }

    private static void logicalPrograms() {
        LogicalProgramInArray logicalProgram = new LogicalProgramInArray();
        logicalProgram.findSumOfConsecutiveDigitIsEqualToGivenNUmber();
    }

    private static void myHashMap() {
        MyHashMap myHashMap = new MyHashMap(2);
        myHashMap.setValue("Arun", "Salem");
        myHashMap.setValue("Deva", "Chennai");
        myHashMap.setValue("Vivek", "Andhra");

        out.println("Value is : " + myHashMap.getValue("Vivek"));

        myHashMap.printKeyList(myHashMap.getKeyList());
    }

    private static void myHashMapJava() {
        MyHashMapJava myHashMapJava = new MyHashMapJava(2);

        myHashMapJava.setValue("Arun", "Salem");
        myHashMapJava.setValue("Deva", "Chennai");
        myHashMapJava.setValue("Vivek", "Andhra");

        myHashMapJava.getValue("Vivek");
    }

    private static void logicalProgramInHashMap() {
        LogicalProgramInHashMap logicalProgramInHashMap = new LogicalProgramInHashMap();
        logicalProgramInHashMap.findFirstRepeatedItemsViaArray();
    }

    private static void logicalProgramFromHackerathon() {
        TCS TCS = new TCS();
        long lowCost = TCS.findMinCost();
        out.println("Lower cost: " + lowCost);
    }

    private static void mySingleLinkList() {
        MySingleLinkList mySingleLinkList = new MySingleLinkList(10);
        mySingleLinkList.append(7);
        mySingleLinkList.append(15);
        mySingleLinkList.append(23);
        mySingleLinkList.append(42);

        mySingleLinkList.deleteNodeByPosition(0);
    }

    private static void myDoubleLinkedList() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(2);
        doubleLinkedList.append(4);
        doubleLinkedList.append(6);
        doubleLinkedList.append(8);

        doubleLinkedList.reverse();
    }

    private static void myStackViaLinkedList() {
        MyStackViaLinkedList myStackViaLinkedList = new MyStackViaLinkedList(1);
        myStackViaLinkedList.push(2);
        myStackViaLinkedList.push(3);
        myStackViaLinkedList.push(4);

        myStackViaLinkedList.pop();
        myStackViaLinkedList.pop();
        myStackViaLinkedList.push(6);
        myStackViaLinkedList.push(8);
        myStackViaLinkedList.peek();
    }

    private static void myStackViaArray() {
        MyStackViaArray myStackViaArray = new MyStackViaArray(4);
        myStackViaArray.push(100);
        myStackViaArray.push(200);
        myStackViaArray.push(300);
        myStackViaArray.pop();
        myStackViaArray.push(500);
        myStackViaArray.push(600);
    }

    private static void myQueueViaLinkedList() {
        MyQueueViaLinkedList myQueueViaLinkedList = new MyQueueViaLinkedList(2);
        myQueueViaLinkedList.push(4);
        myQueueViaLinkedList.push(6);
        myQueueViaLinkedList.push(8);

        myQueueViaLinkedList.pop();
        myQueueViaLinkedList.pop();
        myQueueViaLinkedList.push(12);
        myQueueViaLinkedList.pop();
        myQueueViaLinkedList.peak();
    }

    private static void myQueueViaArray() {
        MyQueueViaArray myQueueViaArray = new MyQueueViaArray(4);
        myQueueViaArray.enQueue(2);
        myQueueViaArray.enQueue(4);

        myQueueViaArray.deQueue();
        myQueueViaArray.enQueue(6);
        myQueueViaArray.enQueue(8);
        myQueueViaArray.enQueue(10);
        myQueueViaArray.enQueue(12);
    }

    private static void tcs() {
        TCS tcs = new TCS();
        out.println("Min cost :" + tcs.findMinCost());
    }

    private static void picsArt() {
        PicsArt picsArt = new PicsArt();
//        picsArt.programTwo("abbaaaac");
        picsArt.programOne();
    }

    private static void tree() {
        MyTree myTree = new MyTree(22);
        myTree.insert(15);
        myTree.insert(30);
        myTree.insert(24);
        myTree.insert(36);
        myTree.insert(34);
        myTree.insert(26);

        myTree.printNodes(myTree.root);
        out.println();
        myTree.remove(30, myTree.root, null, false);
        out.println();
        myTree.printNodes(myTree.root);
    }

    private static void dbs() {
        DBS dbs = new DBS();
        dbs.getUniqueCharacterCount();
    }

    private static void litmus() {
        Litmus litmus = new Litmus();
        litmus.findArmstrongNumber();
    }

    private static void graph() {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);

        graph.showConnectionOfVertex();
    }

    private static void leetCode() {
        LeetCodeMedium leetCodeMedium = new LeetCodeMedium();
        int longString = leetCodeMedium.lengthOfLongestSubstring("aab");
        out.println("Longest string: " + longString);
    }

    private static void findMaxAndMin() {
        int[] numArray = {3, 2, 1, 56, 10000, 167};
        int max = numArray[0];
        int min = numArray[0];
        for (int i = 1; i < numArray.length - 1; i++) {
            if (min > numArray[i]) {
                min = numArray[i];
            }
            if (max < numArray[i]) {
                max = numArray[i];
            }
        }
        out.println("Min: " + min);
        out.println("Max: " + max);
    }
}
