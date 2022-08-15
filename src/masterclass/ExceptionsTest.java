package masterclass;

public class ExceptionsTest {

    public static void main(String[] args) {
        // Throwables - Errors Exceptions
//        Exceptions - Checked(compile time) and Unchecked(runtime exceptions)
        // try-catch block

        try {int x = 5;
        int y = 0;
        System.out.println(x/y);
        }
        catch (Exception ex){
            System.out.println("You are trying to divide a number by 0, it is UNDEFINED");
        }
        finally {
            System.out.println("The operation has ended");
        }

    }

}

