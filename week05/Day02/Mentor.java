
public class Mentor extends Person {
    String senioritylevel;
    String subject;


    public Mentor(String name, Integer age, String senioritylevel, String subject){
        super(name, age);
        this.senioritylevel=senioritylevel;
        this.subject=subject;
    }
    public String toString(){
        String a = new String(name +" " +age + " " + senioritylevel + " " + subject);
        return a;
    }

}

