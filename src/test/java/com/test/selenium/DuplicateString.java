package com.test.selenium;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateString {

    public static void main( String[] args )
    {
        String str ="Hello this has has duplicate strings this strings";
        Map<String, Integer> map = new HashMap<String, Integer>();
        String [] arr=str.split(" ");
        int count = 0;
        for (String s: arr){
            if (map.containsKey(s)){
                count = count + 1;
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        Set<Map.Entry<String, Integer>> k = map.entrySet();
        //System.out.println("Solution -->" + "\t" + k);
        for (Map.Entry<String, Integer> m : k){
            System.out.println(m);
        }


    }


}
