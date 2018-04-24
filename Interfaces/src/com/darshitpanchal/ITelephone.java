package com.darshitpanchal;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    // Access modifiers (public / private0 are useless here because you're gonna be doing that in the actual class.
}
