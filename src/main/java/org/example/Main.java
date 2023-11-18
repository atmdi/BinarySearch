package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int last,mid,num,first,item;
        Scanner input=new Scanner(System.in);
        System.out.println("enter num");
        num=input.nextInt();

        //تعریف آرایه
        int[] array=new int[num];

        //ذخیره عناصر در آرایه
        System.out.println("enter"+num+"integer");

        for(int i=0;i<num;i++){

            array[i]=input.nextInt();
        }
        //ورود مقدار مورد جستتجو

        System.out.println("enter search value:");
        item=input.nextInt();

        first=0;
        last=num-1;
        mid=(first+last)/2;

        while (first<=last){
            if(array[mid]<item){
               first=mid+1;

            }
               else if(array[mid]==item){
                    System.out.println(item+"found at location:"+(mid+1));
                    break;
                }
               else {
                   last=mid-1;

            }
               mid=(first+last)/2;
 if(first>last){
     System.out.println("not found");
 }
            }
        }

    }
