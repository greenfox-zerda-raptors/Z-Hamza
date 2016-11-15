import java.util.*;

public class Ship {
    private ArrayList<String> crew = new ArrayList<>();
    private String Captain;
    private String[] Captains= {"Eric", "Aze", "Misi"};
    private String CrewNames[]= {"Princz Zsófia", "Papp Beáta", "Vikuk Zsuzsanna" ,"Hamza Zoltán", "Pásztor Rita",  "Almási Csaba",
            "Kiss Zoltán Gergő", "Bodrogi Bence", "Puskás Rudolf", "Dálnoki Anna", "Dr. Klébesz Rita", "Verőci Ádám", "Nagy Viktor",
            "Pósa Márton", "Németh Zsófia","Biczók Bálint", "Bedi Szilvia", "Söptei Balázs", "Bence Réka", "Mozga Anna"};
    private Random rnd = new Random();


    public Ship(){
    }
public void RandomCrew(){
    for(int i=0; i<10; i++) {
     int b = rnd.nextInt(19);
        crew.add(CrewNames[b]);
    }
}
public void RandomCaptain(){
    int c = rnd.nextInt(Captains.length);
        Captain = Captains[c];
    }
public Integer crewSize(){
    int result = crew.size();
    return result;
}
public String getCrew(int i){
    return crew.get(i);
}





}

