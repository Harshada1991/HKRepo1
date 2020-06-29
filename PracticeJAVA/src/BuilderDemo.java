public class BuilderDemo {
    public static void main(String[] args) {

//        when lot of attributes , attributes of similar types,
//       client has confusion with order of attrib
//        to set default in some attribs
//        https://www.journaldev.com/1425/builder-design-pattern-in-java

  player p = new player();
        System.out.println(p.toString());
        p.setAge(4);
        System.out.println(p.toString());

        //System.out.println(p.isMarried);// false if boolean
        //  System.out.println(p.getMarried()); null if Boolean

        System.out.println(p.setName("RogerFederer").
        setAge(44).setMarried(true).build().toString());

        //if I wanna set just name and age
        //So the IsMrried field remains default value
     System.out.println(p.setName("Djokovich").setAge(99).build().toString());

     p.setMarried(false);
     //just revising customException
        try{
       if(p.isMarried)
           System.out.println(p.name +"has"+p.noOfKids);
       else throw new HarshuException();}
        catch (HarshuException e){e.showMsg();}
        finally {
            System.out.println("finally block");
        }

    }
}
class player{

    String name;
    boolean isMarried; //Boolean default is false
    int age;

    public int getNoOfKids() {
        return noOfKids;
    }

    public void setNoOfKids(int noOfKids) {
        this.noOfKids = noOfKids;
    }

    int noOfKids;
   @Override
    public String toString()
    {return ("Player details - name "+this.name+ " age"+
            this.age +"isMarried " +isMarried );}

    public player setName(String name) {
        this.name = name;
        return this;
    }

    public player setMarried(Boolean married) {
        isMarried = married;
        return this;
    }

    public player setAge(int age) {
        this.age = age;
        return this;
    }
 public Boolean getMarried() {
        return isMarried;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public player build(){
        return this;
    }
}
class HarshuException extends Exception{
    public void showMsg(){
        System.out.println("Exception caught");
        System.out.println("doesnt have kids as he is unmarried");
    }
}