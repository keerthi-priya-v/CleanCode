package com.javassignment6;

import java.util.*;

public class VampireNumber {

    public static boolean vampireMethod(int fang1,int fang2, int num){

        if((Integer.toString(fang1).endsWith("0") && Integer.toString(fang2).endsWith("0")))
            return false;

        int origLen = digitsVampire(num);
        if (digitsVampire(fang1) != origLen / 2 || digitsVampire(fang2) != origLen / 2)
            return false;

        byte[] numBytes = Integer.toString(num).getBytes();
        byte[] fangBytes = (Integer.toString(fang1) + Integer.toString(fang2)).getBytes();
        Arrays.sort(numBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(numBytes, fangBytes);

    }
    private static int digitsVampire(int  vampireNum){
        return Integer.toString(Math.abs(vampireNum)).length();
    }
    public static void main(String[] args){
        HashSet<Integer> vampire = new HashSet<>();
        for (int num = 10; vampire.size() <= 100; num++)
        {
            if ((digitsVampire(num) % 2) != 0)
            {
                num = num * 10 - 1;
                continue;
            }
            for(int fang1=10; fang1<=Math.sqrt(num) ;fang1++)
            {
                if( num % fang1 == 0 )
                {
                    int fang2 = num / fang1;
                    boolean val = vampireMethod(fang1, fang2,num);
                    if (val)
                    {
                        System.out.println(num);
                        vampire.add(num);
                    }
                }
            }
        }
    }
}
