   //every th has its own set of varibles
    //what if many th used same variable..eg main th and new thread1
    //cant put synchronize to var
//    then use volatile
//    use it when not doing atomic operations
//    when we dnt use caches to see value rather get latest value by anu
//    th who write(). write() only to main mem
//can be volatile object also

//lock free
//    use in singleton demo also
//    public static  volatile Singleton single;
// if not volatile in singleton then in mutithreaded environ it might
// lose data or inconsistent if cached data is read

//good

//    do github code


public class VolatileDemo {

    public static void main(String[] args) {
        System.out.println("ImInMAINN");}}







//
//    In Changer value x =4
//    In Listener value x =3
//    In Changer value x =2
//    In Changer value x =2
//    In Listener value x =1
//    In Listener value x =1
//    In Changer value x =0
//    In Changer value x =0
//    In Listener value x =-1
//    In Changer value x =-1





