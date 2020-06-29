import java.util.*;

public class Test2
{
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ccc");
        treeSet.add("harsh");
        treeSet.add("aaa");
        treeSet.add("abb");
        treeSet.add("aaa");
        treeSet.add("3");  //digit comes first
        treeSet.add("Khan"); //upper case comes Second

        for (String temp : treeSet)
            System.out.printf(temp + " ");

        System.out.println("\n");
    }
} 