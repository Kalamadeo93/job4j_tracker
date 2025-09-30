package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private  String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active is: " + active);
        System.out.println("Status is: " + status);
        System.out.println("Message is: " + message);
    }

    public static void main(String[] args) {
        Error e = new Error();
        Error ee = new Error(true, 1, "identified");
        Error eee = new Error(true, 2, "Ok");
        Error eeee = new Error(false, 3, "Message");
        e.printInfo();
        ee.printInfo();
    }
}
