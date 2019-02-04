package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //                0        1       2
        String[] str = {"much", "More", "Java"};

        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;

        str[1] = "Better";// 1 has been reassigned to "better".

        System.out.println("String array length is " + str.length); // str has 3 elements, 0, 1, 2.
        System.out.println("Integer array length is " + num.length); // num has 3 elements too.
        System.out.println(num [0] + ", " + num[1] + ", " + num[2]);// num[2] was not assigned a value so it aromatically gets 0;
        System.out.println(str[0] + str[1] + str[2]);

    }
}
