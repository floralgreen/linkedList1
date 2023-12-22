import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Mela");
        Fruit fruit2 = new Fruit("Pera");
        Fruit fruit3 = new Fruit("Banana");
        Fruit fruit4 = new Fruit("Ciliegia");

        LinkedList<Fruit> fruitsLinkedList = new LinkedList<>(List.of(fruit1,fruit2));

        //stampo la linkedlist creata
        System.out.println(fruitsLinkedList);

        //aggiungo al primo posto
        fruitsLinkedList.addFirst(fruit3);

        //aggiungo all'ultimo posto
        fruitsLinkedList.addLast(fruit4);

        //stampo la lista aggiornata
        System.out.println(fruitsLinkedList);


    }

}
