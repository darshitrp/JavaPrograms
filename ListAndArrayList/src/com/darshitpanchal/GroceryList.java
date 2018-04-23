package com.darshitpanchal;

import java.util.ArrayList;

public class GroceryList {
    /*
        "private int[] myNumbers;" here we need to specify type of array i.e "int".
        But "ArrayList" contains "objects", so we need to specify the Type of Object that will go into "ArrayList".
        "ArrayList" is actually an "Class", thus we add brackets as the end.
        Because "ArrayList" is an "Class" it can also have its own "Constructor".
    */

    private ArrayList<String> groceryList = new ArrayList<String>();

    // Getter is created to retrieve all contents of currentArray to newArray
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0){
            removeGroceryItem(position);
        }

    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    /*
    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }

        return null;
    }
    */

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;
    }

}
