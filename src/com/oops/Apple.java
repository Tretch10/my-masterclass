package com.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apple {


    public static void main(String[] args) {
        String value = "HelloWorld";
        Pattern pattern = Pattern.compile("[\s]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Match Found!");
        }
        else{
            System.out.println("Match NOT Found!");
        }

    }
}
