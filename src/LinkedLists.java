import org.w3c.dom.ls.LSOutput;

import java.util.*;

record Place(String placenName, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", placenName, distance);
    }
}
public class LinkedLists {

    public LinkedLists(){

        Scanner scanner = new Scanner(System.in);

        LinkedList<Place> itinerary = new LinkedList<>(
                List.of(new Place("Sydney", 1234),
                        new Place("Adelaide", 8278),
                        new Place("Brisbane", 2831),
                        new Place("Brisbane", 2831)));

        duplicateCheck(itinerary);
        ListIterator<Place> iterator = itinerary.listIterator();

        printMenu();
        boolean flag = false;

        while(!flag){
            char input = scanner.next().toUpperCase().charAt(0);
            switch (input){
                case 'F' : {
                    if(iterator.hasNext()) System.out.println(iterator.next());
                    else System.out.println("You cant go anymore forward");
                }break;
                case 'B' : {
                    if(iterator.hasPrevious()) System.out.println(iterator.previous());
                    else System.out.println("You cant go anymore backwards");
                }break;
                case 'L' : System.out.println(itinerary); break;
                case 'M' : printMenu(); break;
                case 'Q' : flag = true; break;
            }
        }
    }

    public void duplicateCheck(LinkedList<Place> itinerary){
        HashSet<Place> set = new HashSet<>(); // Cannot have duplicates in
        for(Place i : itinerary){
            if(!set.add(i)){
                itinerary.remove(i);
            }
        }
    }
    public void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}


