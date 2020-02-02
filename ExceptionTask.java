
public class ExceptionTask {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3, 4, 5, 6};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Exception was thrown: " + e.getMessage());
        } finally {
            System.out.println("Block compited successfully");
        }

    }
}