class Immutable {
    //used for cacheing purposes
    //Synchronization - coz in mutable the state wont change
    //no setters
    //all fields final
    final String name;//="Khandekar";
    final int id;//=8;
    final bottle b;//=new bottle() ; //the bottle object field is not immutable

    public Immutable(String s, int id2, bottle b1) {
        name = s;
        id = id2;
        bottle clone = new bottle();
        clone.capacity = b1.capacity;
        clone.color = b1.color;
        b = clone;
        // b=b1; ------- wud have caused norma behaviour ...no immutability
    }

    @Override
    public String toString() {
        return "name " + name + "id " + id + "bottle " + b.color + b.capacity;
    }
}

class mainClass {
    public static void main(String[] args) {
        bottle beer = new bottle();
        beer.color = "blue";
        beer.capacity = 500;
        Immutable im = new Immutable("dehradun", 88, beer);
        System.out.println(im.toString());
        beer.capacity = 800;
        System.out.println(im.toString());
    }
}


class bottle {
    String color = "yellow";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int capacity = 500;
}
