package com.collectionexcercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
 find the sum of the numbers in List. */
public class QuestionOne {
    public static void main(String[] args) {
        List<Float> ll = new ArrayList<>();
        int s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        for(int i = 0 ; i < s ; i++){
            float num;
            num = sc.nextFloat();
            ll.add(num);
        }

        Iterator<Float> it = ll.iterator();
        float sum = 0.0f;
        while(it.hasNext()){

            sum += it.next();

        }

        System.out.println("sum of floating point number"+sum);
    }
}
