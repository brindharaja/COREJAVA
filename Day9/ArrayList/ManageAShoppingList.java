//Create a program that allows the user to manage a shopping list using an ArrayList.
//Implement the following features:
//Add items to the shopping list.
//Remove an item from the list.
//Display the shopping list.
//Input Example:
//Add items: "Milk", "Eggs", "Bread", "Butter".
//Remove "Eggs".
//Output Example:
//Shopping List: [Milk, Bread, Butter]

import java.util.ArrayList;
import java.util.Scanner;
public class ManageAShoppingList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> items=new ArrayList<>();
        String removeitem=sc.nextLine();
        items.add("Milk");
        items.add("Eggs");
        items.add("Bread");
        items.add("Butter");
        items.remove(removeitem);
        System.out.println(items.toString());
    }
}