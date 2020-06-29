import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class FindPattern123 {
        //problem where u will be given numerical array and u have to
        //select and return the nos which have 1,2,3(order doesnt matter)
        //these shd be in ascending order
        //ex- input -numerical array-[769,37214,321,75,62213,65432]
        //output -string-comma separated-ascending=321,37214,62213

        public static ArrayList<Integer> getPattern(@NotNull int [] input)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i =0;i<input.length;i++)
            {   Integer k= input[i];
                String k2=k.toString();
                boolean flag1=false,flag2=false,flag3=false;
                for(int j=0;j<k2.length();j++)
                {
                    if(k2.charAt(j)=='1')
                        flag1=true;
                    if(k2.charAt(j)=='2')
                        flag2=true;
                    if(k2.charAt(j)=='3')
                        flag3=true;
                }
                if(flag1 && flag2 && flag3)
                {
                    list.add(k);
                }
            }
            //u will get the patterns containing 123 in list
            //[37214, 321, 62213]
            Collections.sort(list);
            return list;

        }
       //  public  ArrayList<Integer> sortResultant(ArrayList<Integer> res)
        // {}
        public static void main(String[] args) {
            int[]  input ={769,37214,321,75,62213,65432};
            ArrayList<Integer> s=FindPattern123.getPattern(input);
            System.out.println("output is"+s);

        }

    }

