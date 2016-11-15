
public class Piratetest {
    public static void main(String[] args) {
        Pirate parrot = new Pirate();
        parrot.addPirates("Sting");
        for(int i = 0; i < parrot.size(); i++) {
            System.out.println(parrot.get(i));
        }
        parrot.brawl();
    }
}
