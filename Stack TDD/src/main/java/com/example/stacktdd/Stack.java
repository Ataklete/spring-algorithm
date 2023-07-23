package com.example.stacktdd;

import java.util.EmptyStackException;

public class Stack {

//    private Object data;
//
//    public boolean isEmpty() {
//        return data == null;
//    }
//
//    public void push(Object data) {
//       this.data = data;
//    }
//
//    public Object peek()  {
//        return data;
//    }
//
//    public Object pop() {
//       if(isEmpty()) {
//           throw new EmptyStackException();
//       }
//       Object temp = data;
//       data = null;
//       return temp;
//
//    }
    //--------Refactoring-----------------------
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Object data) {
        Node newNode = new Node();
        newNode.next = head;
        newNode.data = data;
        head = newNode;
    }
    public Object peek(){
        if(isEmpty()){
            return null;
        }
        return head.data;
    }
    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object temp = head.data;
        head = head.next;
        return temp;

    }

    public boolean contains(Object data) {
        Node newNode = head;
        while (newNode.next!=null)
         if(head.data.equals(data)) {
             return true;
         }
         return false;
    }

}

class Node{
    Object data;
    Node next;
}
