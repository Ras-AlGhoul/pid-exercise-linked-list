package se.sdaproject;

// a "box" in our previous picture
class Node {
    // field 1: the data
    // in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;

    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}


public class LinkedList {

    private Node first = null;

    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node

            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }
            // what do we know about "current"?
            // current.next == null
            // AWESOME!
            // it means, "current" is the last node!

            // step 3: create a new node with the given int "num"
            Node node = new Node(num);

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = node;
        }

    }

    public int getIndexOfElement(int num) {
        //counter represents index of element
        int counter = 0;
        //check if first is an empty linked list
        if (first.elem == num) {
            return counter;
        }
        Node current = first;

        while (current.next != null) {
            //move current to the next node
            current = current.next;
            //increment counter as its granted that the element isn't at first.elem
            counter += 1;
            //check if the current.elem == the passed num
            if (current.elem == num) {
                //return counter that represent index
                return counter;
            }
        }
        //current.next == null and the passed num wasn't found
        return -1;

    }

    public int getElementOfIndex(int index) {
        Node current = first;

        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current.elem;
    }

    public int getSize() {
        Node current = first;
        int counter = 0;

        if (current == null) {
            return counter;
        }
        while (current != null) {
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void removeItem(int elem) {
        if (first == null) return;
        if (first.elem == elem) {
            first = first.next;
            return;
        }
        Node current = first;
        while (current.next != null) {
            if (current.next.elem == elem) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }


    // useful for testing!
    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        if (first == null) {
            // what to do here?
            // string to be returned: "LinkedList()"
            // nothing left to do!
        } else {
            // here, we know that first != null
            // go through the chain of nodes, starting with
            // "first"

            Node current = first;
            // treat first element specially:
            builder.append("" + current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append("," + current.elem);
            }
            // current.next == null
            // we have already appended the last num!
        }

        // append ")"
        builder.append(")");
        return builder.toString();
    }
}