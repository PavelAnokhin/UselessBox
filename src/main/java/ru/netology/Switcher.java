package ru.netology;

public class Switcher implements SwitcherActivity {

    private volatile boolean status = false;

    public Switcher() {
        this.status = status;
    }


    @Override
    public boolean pushStatus(boolean status) {
        return false;
    }

    @Override
    public boolean getStatus() {
        return false;
    }
}
