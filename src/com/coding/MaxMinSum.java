package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MaxMinSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Long> longArr = arr.stream().map(Integer::longValue).collect(Collectors.toList());
        int size = arr.size();
        Collections.sort(longArr);
        long max = 0;
        long min = 0;
        if (size == 1) {
            System.out.println(arr.get(0) + " " + arr.get(0));
        } else {
            for (int j = 0; j < size - 1; j++) {
                min = min + longArr.get(j);
                max = max + longArr.get(j + 1);
            }
            System.out.print(min + " " + max);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MaxMinSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}

//    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
//
//        Example
//
//        The minimum sum is  and the maximum sum is . The function prints
//
//        16 24
//        Function Description
//
//        Complete the miniMaxSum function in the editor below.
//
//        miniMaxSum has the following parameter(s):
//
//        arr: an array of  integers
//        Print
//
//        Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
//
//        Input Format
//
//        A single line of five space-separated integers.
