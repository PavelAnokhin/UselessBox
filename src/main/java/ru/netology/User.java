package ru.netology;

public class User  extends Thread  {

    private String name;
    private SwitcherActivity switcher;

    private final static int waitingTime = 1000;
    private final static byte quantityOfSwitching = 5;
    private final static boolean positionOnSwitcher = true;

    public User(String name, SwitcherActivity switcher) {
        this.name = name;
        this.switcher = switcher;
    }

    public void run() {
        try {
            for (byte i = 0; i < quantityOfSwitching; i++) {
                Thread.sleep(waitingTime);
                if (!switcher.getStatus()) {
                    switcher.pushStatus(positionOnSwitcher);
                    System.out.println(name + " переключатель активировал. ");
                }
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            System.out.printf("%s завершен\n", name);
        }
    }
}
