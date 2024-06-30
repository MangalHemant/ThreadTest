public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Main Start");
        CustomThread customThread=new CustomThread();
        customThread.setDaemon(true);
        customThread.start();
        CustomThread2 thread2=new CustomThread2();
        thread2.start();

        System.out.println("Main end");
    }
}
