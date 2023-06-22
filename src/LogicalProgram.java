import array.FindCommonItem;
import array.LogicalProgramInArray;
import array.MergeSortedArrayDec;
import array.MyArray;
import array.MyArrayDec;
import array.ReverseString;
import company.Litmus;
import company.PicsArt;
import company.TCS;
import google.PairOfNumberEqualsToSum;
import graph.Graph;
import graph.GraphJan2013;
import hashmap.FindFirstRecurringCharJan2023;
import hashmap.LogicalProgramInHashMap;
import hashmap.MyHashMapJava;
import leetcode.LeetCodeMedium;
import linkedlist.DoubleLinkedList;
import linkedlist.DoubleLinkedListJan2023;
import linkedlist.MySingleLinkList;
import linkedlist.SingleLinkedListJan2023;
import queue.MyQueueViaArray;
import queue.MyQueueViaLinkedList;
import queue.MyQueueViaLinkedListJan2023;
import recursive.Factorial;
import recursive.FactorialJan2023;
import recursive.Fibonacci;
import recursive.FibonacciJan2023;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.SelectionSort;
import stack.MyStackViaArray;
import stack.MyStackViaArray2023;
import stack.MyStackViaLinkedList;
import tree.MyTree;
import tree.MyTree2023ViaLoop;
import tree.MyTree2023ViaRecursion;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class LogicalProgram {

    private static String palindromeText = "";

    public static void main(String[] args) {
        sort();
    }

    private static void sort(){
        quickSort();
    }

    private static void quickSort(){
        QuickSort quickSort=new QuickSort();
        quickSort.quickSort();
    }

    private static void mergeSort(){
        MergeSort mergeSort=new MergeSort();
        int[] numArray = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] sortedArray=mergeSort.mergeSort(numArray);
        out.println("Final Sorted Array: " + Arrays.toString(sortedArray));
    }

    private static void insertionSort(){
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.insertSortSection();
    }

    private static void bubbleSort(){
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubbleSort();
    }

    private static void selectionSort(){
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.selectionSort();
    }

    private static void fiboJan2023(){
        FibonacciJan2023 fibo=new FibonacciJan2023();
        int value=fibo.fibonacciViaRecursion(7,0,1,0);
        out.println("Fibonacci :"+value);
    }

    private static void factJan2023(){
        FactorialJan2023 fact=new FactorialJan2023();
//        fact.factorialViaLoop(5);
        int num =6;
        int factValue=fact.factorialViaRecursive(num,num);
        out.println("Fact value: "+factValue);
    }

    private static void tree2023(){
        tree2023ViaRecursion();
    }

    private static void tree2023ViaLoop(){
        MyTree2023ViaLoop tree = new MyTree2023ViaLoop();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        tree.traverseTree(tree.root);

        tree.remove(tree.root, 150);
    }

    private static void tree2023ViaRecursion(){
        MyTree2023ViaRecursion myTree2023ViaRecursion =new MyTree2023ViaRecursion();
        myTree2023ViaRecursion.insert(9);
        myTree2023ViaRecursion.insert(4);
        myTree2023ViaRecursion.insert(6);
        myTree2023ViaRecursion.insert(20);
        myTree2023ViaRecursion.insert(170);
        myTree2023ViaRecursion.insert(15);
        myTree2023ViaRecursion.insert(1);
        myTree2023ViaRecursion.traverseTree(myTree2023ViaRecursion.root);

        myTree2023ViaRecursion.removeFromTree( 15);
    }

    private static void stack2013(){
        /*MyStackViaLinkedListJan2023 stack=new MyStackViaLinkedListJan2023();
        stack.push(10);
        stack.push(12);
        stack.push(7);
        stack.push(5);*/

        MyStackViaArray2023 stack=new MyStackViaArray2023();
        stack.push(10);
        stack.push(12);
        stack.push(7);
        stack.push(5);
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();


        stack.pop();
        stack.print();
    }

    private static void queueJan2023(){
        MyQueueViaLinkedListJan2023 queue=new MyQueueViaLinkedListJan2023();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(12);
        queue.print();

        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
    }

    private static void doubleLinkedListJan2023(){
        DoubleLinkedListJan2023 doubleLinkedListJan2023=new DoubleLinkedListJan2023(10);
        doubleLinkedListJan2023.append(7);
        doubleLinkedListJan2023.printDoubleLinkedList();
        doubleLinkedListJan2023.prepend(27);
        doubleLinkedListJan2023.prepend(22);
        doubleLinkedListJan2023.printDoubleLinkedList();
    }

    private static void singleLinkedList(){
        SingleLinkedListJan2023 singleLinkedListJan2023=new SingleLinkedListJan2023(10);
        singleLinkedListJan2023.append(12);
        singleLinkedListJan2023.append(7);
        singleLinkedListJan2023.append(5);
        singleLinkedListJan2023.reverse(singleLinkedListJan2023.head);
    }

    private static void findFirstRecurringCharacter(){
        int[] num_array={2,5,1,2,3,5,1,2,4};
        FindFirstRecurringCharJan2023 obj=new FindFirstRecurringCharJan2023(num_array);
        obj.findFirstRepeatedCharacterViaLoop();
    }

    private static void reverseString(){
        ReverseString reverseString=new ReverseString();
        reverseString.reverseString("Hi how are you");
    }

    private static void mergedArray(){
        MergeSortedArrayDec mergeSortedArrayDec =new MergeSortedArrayDec();
        int[] arrayOne = {0,3,4,31,38};
        int[] arrayTwo = {4,6,30,46};
        mergeSortedArrayDec.mergeSortedArray(arrayOne,arrayTwo);
    }

    private static void myArrayDec(){
        MyArrayDec myArrayDec=new MyArrayDec();
        myArrayDec.push("a");
        myArrayDec.push("b");
        myArrayDec.push("d");
        myArrayDec.push("e");
        myArrayDec.printNameArray();
        myArrayDec.insert(2,"c");
        myArrayDec.printNameArray();
        myArrayDec.delete(2);
        myArrayDec.delete(2);
        myArrayDec.printNameArray();
    }

    private static void findCommonItems(){
         String[] arrayOne={"a","b","c","x"};
         String[] arrayTwo={"z","y","x"};
        FindCommonItem findCommonItem=new FindCommonItem();
        boolean commonItem=findCommonItem.findCommonItemEfficiant(arrayOne,arrayTwo);
        out.println("Common Item: "+commonItem);
    }

    private static void collectionOfSum(){
        int[] num = {1, 2, 3, 5};
        PairOfNumberEqualsToSum pairOfNumberEqualsToSum =new PairOfNumberEqualsToSum();
        pairOfNumberEqualsToSum.findPairOfSumEqualsToNumberInEfficiantWay(num,8);
    }

    private static boolean isValidParenthesis(String s) {
        boolean isValid = false;

        ArrayList<String> closingBracketList = new ArrayList<>();
        closingBracketList.add(")");
        closingBracketList.add("]");
        closingBracketList.add("}");

        if (s.length() % 2 != 0 || closingBracketList.contains(String.valueOf(s.charAt(0)))) {
            return isValid;
        }

        ArrayList<String> openBracketList = new ArrayList<>();
        openBracketList.add("(");
        openBracketList.add("[");
        openBracketList.add("{");

        HashMap<String, String> hashMapParenthesis = new HashMap<>();
        hashMapParenthesis.put(")", "(");
        hashMapParenthesis.put("]", "[");
        hashMapParenthesis.put("}", "{");

        LinkedList<String> stackList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (openBracketList.contains(currentChar)) {
                stackList.add(currentChar);
            }

            if(isClosingBracketFound(closingBracketList, currentChar)){
                if(stackList.isEmpty()){
                    return false;
                }else if(!removeOpenBrackets(stackList,currentChar, hashMapParenthesis)){
                    return false;
                }
            }
        }

        out.println(stackList.size());

        if (stackList.isEmpty()) {
            isValid = true;
        }
        return isValid;
    }

    private static boolean isClosingBracketFound(ArrayList<String> closingBracketList, String currentChar){
        return closingBracketList.contains(currentChar);
    }

    private static boolean removeOpenBrackets(LinkedList<String> stackList, String currentChar, HashMap<String, String> hashMapParenthesis){
        boolean isValid = true;
        int size = stackList.size();
        String stackChar = stackList.get(size - 1);
        if (hashMapParenthesis.get(currentChar).equalsIgnoreCase(stackChar)) {
            stackList.remove(stackChar);
        } else {
            isValid = false;
        }
        return isValid;
    }

    private boolean validateClosingBracket(ArrayList<String> stackList, ArrayList<String> closingBracketList, String currentChar) {
        return !stackList.isEmpty() || !closingBracketList.contains(currentChar);
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

    private static void logAllPairArray() {
        int num[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            out.println("First loop: " + num[i]);
            for (int j = 0; j < num.length; j++) {
                out.println("Nested loop: " + num[j]);
            }
            out.println();
        }
    }

    private static void reverseIntegerArray() {
        int[] num = {2, 4, 6, 8, 10, 12};
        reverseArray(num);
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

    private static void graphJan2023() {
        GraphJan2013 graph = new GraphJan2013();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);

        graph.showConnection();
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
