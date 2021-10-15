package ru.netology;


public class Box extends Thread {

    private String nameThread;
    private SwitcherActivity switcher;

    final static int waitingTime = 500;
    private final static boolean positionOnSwitcher = false;

    public Box(String nameThread, SwitcherActivity switcher) {
        this.nameThread = nameThread;
        this.switcher = switcher;
    }

    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(waitingTime);
                turnOff();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            turnOff();
            System.out.printf(nameThread + " завершен.");
        }
    }

    private void turnOff() {
        if (switcher.getStatus()) {
            switcher.pushStatus(positionOnSwitcher);
            System.out.println(nameThread + " переключатель выключил.");
        }
    }
}
