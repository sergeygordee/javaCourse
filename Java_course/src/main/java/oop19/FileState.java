package oop19;

public class FileState implements Stateable{
    @Override
    public void printState(int n) {
        if (n == OPEN){
            System.out.println("File is opened");
        } else if (n == CLOSED) {
            System.out.println("File is closed");
        }
        else {
            System.out.println("File state is undefined");
        }

    }
}
