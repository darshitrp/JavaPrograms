package com.darshitpanchal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        // Sorting using "LinkedList" and "ListIterator"
        LinkedList<String> placesToVisit1 = new LinkedList<String>();
        addInOrder(placesToVisit1, "Sydney");
        addInOrder(placesToVisit1, "Melbourne");
        addInOrder(placesToVisit1, "Brisbane");
        addInOrder(placesToVisit1, "Perth");
        addInOrder(placesToVisit1, "Canberra");
        addInOrder(placesToVisit1, "Adelaide");
        addInOrder(placesToVisit1, "Darwin");
        printList(placesToVisit1);
        visit(placesToVisit1);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator(); // Same as "for" loop
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        /*
            While initialising "ListIterator", list will not automatically point to the first entry,
            we will have to use ".next()" compulsory to point to first index entry.
        */

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal, do not add
                System.out.println(newCity + " is already included as a destination.");
                return false;
            }else if(comparison > 0){
                // "newCity" must appear before this one.
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                // move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list.");
                    }
                    break;

                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list.");
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - To Quit\n" +
                "1 - Goto Next City\n" +
                "2 - Goto Previous City\n" +
                "3 - Print Menu Options");
    }
}
