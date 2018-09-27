package com.company;

public class TriangleClassifier {
    public static String test(int a, int b,int c){
        if((a+b)>c&&(a+c)>b&&(b+c)>a) {
            if (a == b && b == c) return "tam giac deu";
            if (a == b || b == c) return "tam giac can";
            return "tam giac thuong";
        }else return "khong phai tam giac";
    }
}
