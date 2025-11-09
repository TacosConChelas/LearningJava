public class HelloWorld {
    public static void main(String[] args) {
        if (args == null) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
