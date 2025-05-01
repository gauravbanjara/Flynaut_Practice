package IJP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeAboveSalary {
    public static void main(String[] args) {
        HashMap<Integer,String> employee = new HashMap<>();
        employee.put(20000,"Gaurav");
        employee.put(45000,"Mahesh");
        employee.put(2000,"Kumar");
        employee.put(5000,"Sneha");
        employee.put(25000,"Rahul");

        for (Map.Entry<Integer, String> entry : employee.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (entry.getKey() >= 10000){
                System.out.println(entry);
            }
        }
        Iterator< Map.Entry<Integer,String> > iterator = employee.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> emp = iterator.next();
            if (emp.getKey() >= 10000) {
                System.out.println(emp);
            }
        }
    }
}
