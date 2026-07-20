package org.example.WarmUp1;

public class sleepIn {
    public boolean sleep(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}

