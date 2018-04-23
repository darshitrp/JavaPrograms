package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        /*
        "Encapsulation" is a mechanism that restricts access to certain components in the objects you are creating.
        Protects members of class from external access in order to guard against unauthorised access.

        No exactly security, but we are stopping outsiders i.e classes or codes outside the class you are working on
        from accessing the inner working of the class.

        Also it might be possible that we forget to initialise the value for any of the field, then it will create issue
        while invoking the method. Eg: "Field:health".

        */

        Player player = new Player();
        player.name = "Darshit"; // Error because "Field:name" changed to "Field:fullName"
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        // Here i am able to change the health(control of program) and override the above declaration which can create an issue.
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // Enhanced code with "encapsulation" in "Class:EnhancedPlayer"

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Darshit", 500, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());

    }
}
