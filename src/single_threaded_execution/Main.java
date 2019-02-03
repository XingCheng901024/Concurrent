package single_threaded_execution;

public class Main {
    public static void main(String[] args){
        System.out.println("Testing Gate,hit ctrl+c to exit.");
        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();
    }
}