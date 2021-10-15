package ru.netology;

public class Main {

    public static void main(String[] args) throws InterruptedException {

            Switcher switcher = new Switcher();

            Thread user = new User("User", switcher);
            Thread box = new Box("Box", switcher);

             box.start();
            user.start();
            user.join();
            box.interrupt();
        }
}
