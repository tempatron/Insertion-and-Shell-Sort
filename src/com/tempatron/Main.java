package com.tempatron;

public class Main {

    public static void main(String[] args) {

        //```````INSERTION SORT````````
        // has quadratic complexity n^2
        // and  Best complexity: n
        //and is a Stable Sort!
        int[] intArray = {20, 35 ,-15 , 7 , 55 ,1 ,-22};

        for(int firstUnsortedIndex = 1 ; firstUnsortedIndex < intArray.length;
        firstUnsortedIndex++ ){

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for( i = firstUnsortedIndex ;  i > 0 && intArray[i - 1] > newElement ; i-- ){
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
            printArray(intArray);


        //``````SHELL SORT```````
        // ITS an UNSTABLE SORT!
        //it is a variation of insertion sort and
        //it uses a gap value to shift the elements
        //at the final iteration the gap is = 1
        //Gap = 1 means it acts as insertion sort
        //Shell sort can also be used to improve Bubble sort
        /*Average complexity: n*log(n)^2 or n^(3/2)
         Best complexity: n*/
        int[] shellArray = {20, 35 ,-15 , 7 , 55 ,1 ,-22};

        //gap value
        for(int gap = shellArray.length/2 ; gap > 0 ; gap /= 2 ) {


            //basically code for insertion sort when gap = 1 at the end
            for(int i= gap; i < shellArray.length ; i++ ) {  //for traversing array ahead of the gap

                int newElement = shellArray[i];

                int j = i;

                while(j >= gap && shellArray[j - gap] > newElement){   //shifting values.
                    shellArray[j] = shellArray[j - gap];
                    j -= gap;
                }

                shellArray[j] = newElement;
            }

        }

        printArray(shellArray);

    }

    private static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
