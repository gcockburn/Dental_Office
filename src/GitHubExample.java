
/*
 *
 * @author hackman
 */
public class GitHubExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Look at my pyramid, isn't it neat");
        printStars(); 
    }

    public static void printStars() {
        for (int i = 0; i < 10; i++) {
            for (int h = 0; h <= i; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
