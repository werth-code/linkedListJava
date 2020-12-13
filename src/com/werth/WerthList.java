package com.werth;

public class WerthList {
    Node head; //this is the first element in our Linked List

    public static WerthList insert(WerthList list, Integer data) {
        Node node = new Node(data); //Create a new node
        node.nextNode = null; //Set the next node to null

        if(list.head == null) list.head = node; //if we have no head(its null)then we set our new node as the head.
        else {
            Node last = list.head; //set our last element to the head.. traverse the list to get to the end...insert as the last element.
            while(last.nextNode != null) {
                last = last.nextNode;
            }
            last.nextNode = node;
        }
        return list;
    }

    public static WerthList deleteNode(WerthList list, Integer key) {
        Node currentNode = list.head;
        Node previousNode = null;

        if(currentNode != null && currentNode.data == key) {
            list.head = currentNode.nextNode;
            System.out.println(key + " has been deleted.");
            return list;
        }

        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        if(currentNode != null) {
            previousNode.nextNode = currentNode.nextNode;
            System.out.println(key + " has been deleted.");
        }

        else System.out.println(key + " not found.");

        return list;
    }

    public static void printWerthList(WerthList list) {
        Node currentNode = list.head;
        while(currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }

    }
}
