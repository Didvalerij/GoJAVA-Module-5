package com.goit.gojavaonline.module5;



/**
 * Created by user on 17.03.2016.
 */
public class ArrayMinMax {


        public static void main(String[] args){
            int[] intArray = {-23,11,65,45,56,-23,-2};
            int maxArray = intArray[0];
            int minArray = intArray[0];
            int max = 0;
            int min = 0;

            for (int elements : intArray){
                System.out.println("Elements of the array " + elements);
            }



            for (int i = 0; i<intArray.length - 1; i++){

                if (maxArray < intArray[i]){
                    maxArray = intArray[i];
                }

                if (minArray > intArray[i]){
                    minArray = intArray[i];
                }

            }
            System.out.println();
            System.out.println("Min value of the array " + minArray);
            System.out.println("Max value of the array " + maxArray);
        }


}