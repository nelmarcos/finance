package com.yahoo.util;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n number of prisoners
     *  2. INTEGER m number of sweets
     *  3. INTEGER s starting seat
     */

    public static int saveThePrisoner(int n, int m, int s) {
        int remainder = n>m?n%m:m%n-1;
        int result = s+remainder;
        if(result > n) {
            result -= n;
        }
        return result;
    }

}

public class Solution {

    public static void test (Consumer s) {

    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        /*List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Result.rotLeft(a, 4);*/

        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<String> integerList = integers.stream().filter(i -> i%2!=0).map(i -> i+" "+(Math.pow(i,3))).collect(Collectors.toList());
        integerList.stream().forEach(System.out::println);

        String s = "ABC";
        String s1 = new String("ABC");
        String s2 = "ABC";

        if(s == s1) {
            System.out.println("s == s1");
        } else {
            System.out.println("s != s1");
        }
        if(s == s2) {
            System.out.println("s == s2");
        } else {
            System.out.println("s != s2");
        }

        Solution.test(a-> System.out.println());
        Solution.test1(Arrays.asList(1),a-> "");
        Result.saveThePrisoner(7, 19, 2);
        Result.saveThePrisoner(3, 7, 3);
        Result.saveThePrisoner(5, 2, 1);
    }

    public static void test1(List<Integer> integers, Function<Integer,String> func) {
        integers.stream().map(func).forEach(System.out::println);
    }
}
