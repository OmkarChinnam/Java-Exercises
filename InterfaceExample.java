interface Computer {

    void start();
    void shutdown();
}
class Laptop implements Computer{
    @java.lang.Override
    public void start() {
        System.out.println("Laptop starts with battery");
    }

    @java.lang.Override
    public void shutdown() {
        System.out.println("Laptop Shutting Down");
    }
}
class Desktop implements Computer {
    @java.lang.Override
    public void start() {
        System.out.println("Desktop starts with power supply");
    }

    @java.lang.Override
    public void shutdown() {
        System.out.println("Desktop Shutting Down");
    }
}
class InterfaceExample {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        laptop.start();
        laptop.shutdown();

        Computer desktop = new Desktop();
        desktop.start();
        desktop.shutdown();
    }
}