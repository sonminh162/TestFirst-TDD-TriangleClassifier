package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    public void test1_222(){
        String expected = "tam giac deu";
        String res = TriangleClassifier.test(2,2,2);
        assertEquals(expected,res);
    }
    @Test
    public void test1_223(){
        String expected = "tam giac can";
        String res = TriangleClassifier.test(2,2,3);
        assertEquals(expected,res);
    }
    @Test
    public void test1_345(){
        String expected = "tam giac thuong";
        String res = TriangleClassifier.test(3,4,5);
        assertEquals(expected,res);
    }
    @Test
    public void test1_823(){
        String expected = "khong phai tam giac";
        String res = TriangleClassifier.test(8,2,3);
        assertEquals(expected,res);
    }
    @Test
    public void test1_am121(){
        String expected = "khong phai tam giac";
        String res = TriangleClassifier.test(-1,2,1);
        assertEquals(expected,res);
    }
    @Test
    public void test1_011(){
        String expected = "khong phai tam giac";
        String res = TriangleClassifier.test(0,1,1);
        assertEquals(expected,res);
    }


}