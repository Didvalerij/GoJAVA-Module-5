package com.goit.gojavaonline.module5;

/**
 * Created by user on 17.03.2016.
 */
public class SortArray {

    public static void main(String[] args){
        double[] a = {322,4334,32.4,44,32234,43,-16};

        System.out.println("Elements of the array ");
        for (double elements : a){
            System.out.println(elements);
        }

        for (int i = 0; i < a.length; i++) {
            double min = a[i];
            int imin = i;
            for (int j = i+1; j < a.length; j++) {
                       if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }
                if (i != imin) {
                double temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
        }

        System.out.println("Elements of the array after sorting");
        for (double elementsAfter : a){
            System.out.println(elementsAfter);
        }
    }


}
