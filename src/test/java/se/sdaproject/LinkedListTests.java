package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.font.LineMetrics;


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

    //###############################################

    @Test
    void testGetIndexOfElementFirst(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(6);
        list.add(4);

        int index = list.getIndexOfElement(3);
        assertEquals(0, index);
    }

    @Test
    void testGetIndexOfElementMiddle(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(1);
        int index = list.getIndexOfElement(5);
        assertEquals(1,index);

    }
    @Test
    void testGetIndexOfElementLast(){
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1222);
        int index = list.getIndexOfElement(1222);
        assertEquals(3,index);

    }
    //###############################################

    @Test
    void testGetElementOfIndexFirst(){
        LinkedList list = new LinkedList();
        list.add(111232);
        list.add(121);
        list.add(12222);
        list.add(12123);
        int element = list.getElementOfIndex(0);
        assertEquals(111232,element);
    }

    @Test
    void testGetIndexElementMiddle(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        int element = list.getElementOfIndex(1);
        assertEquals(5,element);
    }
    @Test
    void testGetElementOfIndexLast(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(71);
        int element =  list.getElementOfIndex(3);
        assertEquals(71,element);
    }

    //################################################


    @Test
    void testGetSize() {
        LinkedList list = new LinkedList();

        int size = list.getSize();
        assertEquals(0,size);
    }

    @Test
    void testGetSizeIntList(){
        LinkedList list = new LinkedList();
        list.add(1232);
        list.add(2454);
        list.add(3656);
        list.add(96573);
        list.add(86665);
        list.add(67456);
        list.add(4554);
        int size = list.getSize();
        assertEquals(6, size);


    }

    //################################################

    @Test
    void testRemoveElementFirst(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(7);



        list.removeItem(3);
        int size = list.getSize();
        assertEquals(2,size);
    }


    @Test
    void testRemoveElementMiddle(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(7);



        list.removeItem(5);
        int size = list.getSize();
        assertEquals(2,size);
    }


    @Test
    void testRemoveElementLast(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(7);



        list.removeItem(7);
        int size = list.getSize();
        assertEquals(2,size);
    }

    @Test
    void testRemoveAllElements(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(7);




        list.removeItem(3);
        list.removeItem(7);
        list.removeItem(5);
        int size = list.getSize();
        assertEquals(0,size);

    }



}
