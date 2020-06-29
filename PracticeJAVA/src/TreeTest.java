

    import java.util.*;

    public class TreeTest{
        public static void main(String[] args)
        {
            TreeSet<car> ts1 = new TreeSet<>();

           ts1.add(new car(1234,"BMW",78f));
            ts1.add(new car(124,"audi",78f));
            ts1.add(new car(123,"MercBenz",78f));
            ts1.add(new car(1234,"BMW",78f));



            // Duplicates will not get insert
            System.out.println("size of treeset= "+ts1.size());

            // Elements get stored in default natural
            // Sorting Order(Ascending)
            for(car c:ts1){
                System.out.println(c.getPpx()+""+c.getPrice()+""+c.getName());
            }
        }

    }
    class car implements Comparable<car> {
        int price;
        String name;

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPpx() {
            return ppx;
        }

        public void setPpx(float ppx) {
            this.ppx = ppx;
        }

        float ppx;

        public car(int price, String name, float ppx) {
            this.price = price;
            this.name = name;
            this.ppx = ppx;
        }

        @Override
        public int compareTo(car o1) {
            return o1.price - this.price;
            // return 0;
        }
    }