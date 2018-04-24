package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        /*
            "Interfaces" in java terms specifies a method that a particular class that implements the interface must implement.

            Now "Interface" itself that you are creating is "abstract" and that means if there's no actual code for any of the
            methods, you only supply the actual method name and parameters.

            The actual code still goes in the actual "class" that you're creating.

            The idea is to provide same behaviour to several classes by having them all implement the same "interface".

            "Interface" is like a commitment, a contract if you will, that the method's signatures and that those
            variables in the interface constants if you defined any will not change.

            "Implements" keyword is used to access the "Interface" in the actual class.
        */

        ITelephone darshPhone;
        /*
            "DeskPhone darshphone;" this instantiation will also work as the actual methods are
            implemented in the "Class:DeskPhone".
        */
        darshPhone = new DeskPhone(123456789);
        darshPhone.powerOn();
        darshPhone.callPhone(123456789);
        darshPhone.answer();

        /*
            In below code, "Object:darshphone" is used to initialise different "class:MobilePhone".
            This was possible because "Object:darshphone" is created using "Interface:ITelephone" which is implemented
            by both "classes:DeskPhone/MobilePhone".

            But if the "Object:darshphone" was created using the "Class:DeskPhone" then below code will give error.
        */

        darshPhone = new MobilePhone(987654321);
        darshPhone.powerOn();
        darshPhone.callPhone(987654321);
        darshPhone.answer();

    }
}
