public class GFG {

    public static String frechlop(String[] geek)
    {
        int count = 0;
        for (String var : geek) {
            if (count == 3)
                return var;
            else count++; //or just write count++;
        }
        return "hihi";
    }

    public static void main(String[] args)
            throws Exception
    {

        String[] arr1 = { "Geeks", "For", "Geeks" };
        String secelt = frechlop(arr1);
        System.out.println(secelt);
    }
}