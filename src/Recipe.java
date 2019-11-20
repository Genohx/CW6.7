import java.util.ArrayList;
import java.util.ListIterator;
public class Recipe
{
    public static void main(String[] args)
    {
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("flour");
        ingredients.add("sugar");
        ingredients.add("cocoa");
        ingredients.add("oil");
        ingredients.add("butter");
        ingredients.add("eggs");
        ingredients.add("baking soda");
        System.out.println("To make a chocolate, using the following "+ingredients.size()+" ingredients");
        ListIterator iterator = ingredients.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }//end while
    }//end main method
}//end class Recipe
