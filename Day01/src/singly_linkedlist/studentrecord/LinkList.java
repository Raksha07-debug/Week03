package singly_linkedlist.studentrecord;

public class LinkList {
    public Node head;

    // Removed 'static' keyword from methods
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.rollNumber == rollNumber) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found");
    }

    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (position == 0) {
            addAtBeginning(rollNumber, name, age, grade);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                if (temp.next == null) {
                    System.out.println("Position out of range");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void searchByRollNumber(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Roll Number: " + temp.rollNumber);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found");
    }

    public void displayAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            System.out.println();
            temp = temp.next;
        }
    }

    public void updateGrade(int rollNumber, String grade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found");
    }
}
