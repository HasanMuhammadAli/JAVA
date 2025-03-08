package OOPConcepts;

interface Vehical{
    void start();
    void stop();
}
class FordInterface implements Vehical {
    @Override
    public void start(){
        System.out.println("Ford Started.");
    }
    @Override
    public void stop(){
        System.out.println("Ford Stopped.");
    }

    public static void main(String[] args) {
        FordInterface f150 = new FordInterface();
        f150.start();
        f150.stop();
    }
}
