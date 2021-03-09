package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(4);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testIndexOf(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(1);
        int index = list.indexOf(5);
        assertEquals(1,index);
    }

    @Test
    void testGetElement(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        int element = list.getElement(2);
        assertEquals(8,element);
    }


    @Test
    void testGetSize() {
        LinkedList list = new LinkedList();

        int size = list.getSize();
        assertEquals(0,size);
    }

    @Test
    void testRemoveElement(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(7);



        list.removeItem(5);
        int size = list.getSize();
        assertEquals(2,size);
    }
}