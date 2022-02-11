package com;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;

public class JavaAssignment3
{
    public static int pingHost(String host) throws IOException
    {
        Long start = System.currentTimeMillis();
        System.out.println("start time "+start);
        if (!InetAddress.getByName(host).isReachable(2000))
            return -1;
        System.out.println("current time "+ System.currentTimeMillis());
            return (int) (System.currentTimeMillis()-start);

    }

    public static void main(String args[]) throws IOException
    {
        int i=0;
        int value;
        ArrayList<Integer> array = new ArrayList<>();
        while(i<5) {
            value = pingHost("192.168.31.21");
            i++;
            array.add(value);
            System.out.println("Time required to reach Host "+i+": "+value);
        }
        Collections.sort(array);
        System.out.println(array.get(2));
    }
}

