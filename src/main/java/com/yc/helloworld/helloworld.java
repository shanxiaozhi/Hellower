package com.yc.helloworld;

import org.omg.Messaging.SyncScopeHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class helloworld {
    public static void main(String[] args) {
        String []s={"sdfasdf","sdfsads","sdghgf"};

        System.out.println(longestCommonPrefix(s));

    }


    public static int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int sum=0;
        int temp=getValue(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (getValue(arr[i]) > temp) {
                sum-=temp;
            } else {
                sum +=temp  ;
            }
            temp=getValue(arr[i]);
        }
        sum+=temp;
        return sum;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static String longestCommonPrefix(String[] strs) {
        String temp=strs[0];
        for(int i =1;i<strs.length;i++){
            int j;
            for(j=0;j<strs[i].length()&&j<temp.length();j++){
                if(temp.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            temp=temp.substring(0,j);
            if(temp==""){
                return temp;
            }
        }
        return temp;
    }


}
