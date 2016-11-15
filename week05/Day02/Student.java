import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.11.15..
 */
public class Student extends Person{
   private double Average;
    private ArrayList<Integer> Grades = new ArrayList<>();

    public Student(String name, Integer age){
        super(name, age);
    }
    public void addGrade(Integer a){
        Grades.add(a);
    }
//    public Integer size(){
//        return Grades.size();
//   }
////    public Integer get(Integer i){
//        return Grades.get(i);
//    }
    public void getAverage(){
        double sum = 0;
        for(int i = 0; i<Grades.size(); i++){
            sum = sum + Grades.get(i);
        }
        Average = sum/Grades.size();
    }
    public String toString(){
        String a = new String(name + " " + age + " " + Average);
        return a;
    }
}
