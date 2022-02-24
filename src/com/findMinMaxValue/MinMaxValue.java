package com.findMinMaxValue;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        int [] myList = new int[5];
     minMaxValueArrayVar1(myList);
    }

    public static void minMaxValueArrayVar1(int [] arrayVar1){
        Random random = new Random();
        arrayVar1 = new int[5];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arrayVar1.length; i++){
            arrayVar1[i] = random.nextInt(50);
            min = Math.min(min,arrayVar1[i]);
            max = Math.max(max,arrayVar1[i]);

        }
        System.out.print(Arrays.toString(arrayVar1));
        System.out.println("");
        System.out.println(" minimal value of Array = " + min);
        System.out.println(" maximal value of Array = " + max);
    }

    public static void minMaxValueArrayVar2(int [] arrayVar2){
        Random random = new Random();
        for(int i = 0; i<arrayVar2.length; i++){
            arrayVar2[i] = random.nextInt(50);
            System.out.print( " " + arrayVar2[i]);
        }
        int min = arrayVar2[0];
        int max = arrayVar2[0];
        for(int i = 0; i<arrayVar2.length; i++){
            if(arrayVar2[i] < min){
                min = arrayVar2[i];
            }
            if(arrayVar2[i]>max){
                max = arrayVar2[i];
            }
        }
        System.out.println("");
        System.out.println(" minimal value of Array = " + min);
        System.out.println(" maximal value of Array = " + max);

    }

    public static void sumOfElementsOfArray(int [] arraySum){
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i<arraySum.length; i++){
            arraySum[i] = random.nextInt(50);
            System.out.print(" " + arraySum[i]);
            sum += arraySum[i];
        }
        System.out.println("");
        System.out.println("Sum Elements of Array = " + sum);
    }

    public static void duplicateElementsOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int[] myList = new int[size];
        System.out.println("Enter the elements of the array ::");
        for(int i=0; i<size; i++) {
            myList[i] = sc.nextInt();
        }
        System.out.println("The array created is ::"+ Arrays.toString(myList));
        System.out.println("indices of the duplicate elements :: ");

        for(int i=0; i<myList.length; i++) {
            for (int j=i+1; j<myList.length; j++) {
                if(myList[i] == myList[j]) {
                   System.out.println(j);
               }
          }
       }
    }

    public static void minMaxValueMultiplyArray(int [][] array){
        Random random = new Random();
        for(int i = 0; i<array.length; i++){
            System.out.println("");
            for(int j = 0; j<array[i].length; j++){
                array[i][j] = random.nextInt(50);
                System.out.print(" " + array[i][j]);
            }
        }
        int min = array[0][0];
        int max = array[0][0];

        for(int i = 0; i<array.length; i++){
            System.out.println("");
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
                if(array[i][j] > max){
                    max = array[i][j];

                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

}

