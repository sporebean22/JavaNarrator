package App.Narrator.BaseClass;

import java.lang.System;
import App.Narrator.Interface.INarrator;

public class Narrator implements INarrator {
    
    private final String _userName;

    public Narrator(String username) {
        _userName = username;
    }

    public void Narrate() throws Exception {
        System.out.println("Hello Mr." + _userName);
    }
}