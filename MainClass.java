/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CS102Assignment03;

public class MainClass {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new MainClass().getGreeting());
        
        IsUnique.main(args);
        PalindromeCheck.main(args);
        CapitalizeSentence.main(args);
    }
}
