package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bubble Sorting in Java
//        BubbleSort bubbleSort=new BubbleSort();
        int[] list={22,1,55,3,7,10,99,34,20};
//        int[] list1= bubbleSort.bubblesort(list);
//        System.out.println(list1[list1.length-1]);

//        int[] list={3,3};
//        AddList addList=new AddList();
//        int[] list1= addList.add(list,6);
//
//        for(int i=0;i<2;i++){
//            System.out.println(list1[i]);
//        }

        Scanner scanner=new Scanner(System.in);
        LinearSearching linearSearching=new LinearSearching();
        System.out.println("Enter the Number you want to search in the array:");
        int target=scanner.nextInt();
        int index=linearSearching.Linearsearch(list,target);
        if(index==-1){
            System.out.println("There is no number present in the list.");

        }else{
            System.out.println("Your number exist at "+index);
        }


    }
}