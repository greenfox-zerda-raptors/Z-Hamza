import java.util.ArrayList;

public class Person {
     String name;
     Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        String result = new String(name +" "+ age);
        return result;
    }


}
