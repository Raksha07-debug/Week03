package singly_linkedlist.studentrecord;

public class Node {
    int rollNumber;
    String name;
    int age;
    String grade;
    Node next;


    Node(int rollNumber,String name,int age,String grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }

}
