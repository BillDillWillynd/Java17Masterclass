public class Main {

    public static void main(String[] args){

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial health is: " + tim.healthRemaining());

        EnhancedPlayer john = new EnhancedPlayer("John", 200, "Staff");
        System.out.println("Initial health is: " + john.healthRemaining());
    }

}