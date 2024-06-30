public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Main Start");
        CustomThread customThread=new CustomThread();
        customThread.setDaemon(true);
        customThread.start();

        System.out.println("Main end");
    }
}
