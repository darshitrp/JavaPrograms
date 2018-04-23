package com.darshitpanchal;

public class Player {
    public String name;
    //public String fullName;
    /*
    If i change the field name "name" to "fullName" then it must not create any issue as
    it is just an internal class change.

    But it will create an issue/error in the "Class:Main" where assignment for "Field:name" is done.

    Now if we change any field in this "class:Player" then will have to change the details in other classes.
    This is possible in this type of small application but in large applications it does become a problem.

    Also it might be possible that we forget to initialise the value for any of the field, then it will create issue
    while invoking the method.

    */
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocked out!");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
