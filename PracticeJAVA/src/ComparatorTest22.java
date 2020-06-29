
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    class Movie{

        int ID;
        String name;
        Integer ReleaseYear;


        public  Movie(int ID, String name, Integer ReleaseYear)
        { this.ID=ID;
            this.name=name;
            this.ReleaseYear =ReleaseYear;
        }

        @Override
        public String toString(){return "ID-"+this.ID+" name-"+this.name
                +" Release Year-"+this.ReleaseYear;}
    }

    class NameComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m,  Movie n)
        {return m.name.compareTo(n.name);}}


class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m,  Movie n)
    {return m.ReleaseYear-n.ReleaseYear;}}

public class ComparatorTest22 {
        public static void main(String[] args) {
            System.out.println("hi");
            Movie m1 =new Movie(1,"zubeida",2022);
            Movie m2 =new Movie(5,"Apharan",2012);
            Movie m3 =new Movie(3,"Once time",2002);

            ArrayList<Movie> list= new ArrayList<>();
            list.add(m1); list.add(m2); list.add(m3);
            System.out.println("before arraylist  is");

            for(int i=0;i<list.size();i++)
                System.out.println(list.get(i));


            Collections.sort(list,new NameComparator());
            System.out.println("name comparator string is");
            for(int i=0;i<list.size();i++)
                System.out.println(list.get(i));

            Collections.sort(list,new YearComparator());
            System.out.println("Release Year comparator string is");
            for(int i=0;i<list.size();i++)
                System.out.println(list.get(i));


        }
    }

