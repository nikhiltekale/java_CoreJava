import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!...We are learning Collections");

        List<String> li= new ArrayList<String>();
        li.add("nikhil");
        li.add("pratap");
        li.add("rohan");
        li.add("amol");
        li.add(1,"ajay");

        //For printing list element
        System.out.println("Traversing list in object format");
        System.out.println(li);

        //Traversing list through Iterator
        System.out.println("Traversing list through Iterator");
        Iterator it = li.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //Traversing list through for-each loop
        System.out.println("Traversing list through for-each loop");
        for (String names: li)
        {
            System.out.println(names);
        }
        //Traversing list through forEach loop
        System.out.println("Traversing list through forEach loop");
        li.forEach(e->{

            System.out.println(e);
        });
        //sort list

        Collections.sort(li);
        System.out.println("sorted list:"+ li);

        //Remove element from list
        li.remove(1);
        System.out.println("removed item at index 1:"+ li);
    }
}