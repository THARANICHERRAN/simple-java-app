public class App {
    public static void main(String[] args) {
        System.out.println("Java CI/CD Application Started...");

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Hello from Java CI/CD Pipeline!");
        }
    }
}