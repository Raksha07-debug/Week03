package singly_linkedlist.studentrecord;

public class Main {

    public static void main(String[] args) {
        LinkList list = new LinkList();

        // Add student records
        list.addAtBeginning(1, "John Doe", 20, "A");
        list.addAtEnd(2, "Jane Doe", 22, "B");
        list.addAtPosition(3, "Bob Smith", 21, "C", 1);

        // Display all student records
        System.out.println("All Student Records:");
        list.displayAll();

        // Search for a student record by Roll Number
        System.out.println("Search by Roll Number:");
        list.searchByRollNumber(2);

        // Update a student's grade based on their Roll Number
        list.updateGrade(1, "A+");

        // Display all student records after update
        System.out.println("All Student Records after update:");
        list.displayAll();

        // Delete a student record by Roll Number
        list.deleteByRollNumber(2);

        // Display all student records after deletion
        System.out.println("All Student Records after deletion:");
        list.displayAll();
    }

}
