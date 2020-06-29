//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class EmpTable {
//    String name;
//    Integer id;
//    Double salary;
//
//    public EmpTable(String name,Integer id,Double salary){
//        this.name=name;
//        this.id=id;
//        this.salary=salary;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Double salary) {
//        this.salary = salary;
//    }
//
//    public static void main(String[] args) {
//        EmpTable emp=new EmpTable("harshada",28,30000.0);
//        EmpTable emp2=new EmpTable("harshada2",38,20000.0);
//        EmpTable emp3=new EmpTable("harshada3",56,10000.0);
//        List<EmpTable> list= new ArrayList<>();
//        list.add(emp);list.add(emp2); list.add(emp3);
//
//        list.stream().filter(t->t.getSalary()<20000).forEach(t->t.setSalary());
//
//
//    }
//}
