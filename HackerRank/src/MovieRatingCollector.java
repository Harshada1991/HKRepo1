import java.util.*;
import java.util.stream.Stream;

public class MovieRatingCollector {

    public static class RatingCollectorImpl implements RatingCollector {

      //  ArrayList<Double> li = new ArrayList<Double>();
        Map<String,ArrayList<Double>> map=new HashMap<String,ArrayList<Double>>();
        @Override
        public void putNewRating(String movie, double rating) {
            // YOUR CODE HERE
        if(map.containsKey(movie)==false)
        {  ArrayList<Double> li2 = new ArrayList<Double>();
            li2.add(rating);
            map.put(movie,li2);

        }
        else{
            ArrayList al=map.get(movie);
            al.add(rating);
         map.put(movie,al);

        }}

        @Override
        public double getAverageRating(String movie) {

            // YOUR CODE HERE
            double sum=0;
           ArrayList<Double> al=   map.get(movie);
           //double d1= Stream.of(al).mapToInt((x)->x).summaryStatistics().getAverage();
            for (Double d:al)
            {sum+=d; }
            sum=sum/(al.size());
            return sum;

        }

        @Override
        public int getRatingCount(String movie) {
            ArrayList<Double> al=   map.get(movie);
            return al.size();
            }
            // YOUR CODE HERE

    }



    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();
           // String line="pinjar 65.77,ddlj 76.22,pinjar 33.22,ssdd 66.12";
            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}
//input and wrong outpput
//pinjar 20.20,ddlj 10.10,pinjar 20.20,ssdd 66.12
//        ddlj 20.20,pinjar 40.40
//
//        ssdd 66.12
//        pinjar 26.93
//        ddlj 15.15