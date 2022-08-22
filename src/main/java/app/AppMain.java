package app;

 import org.apache.commons.lang3.StringUtils;
 import utils.Input;

public class AppMain {

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("please enter something: ");
        String user = input.getString();
        System.out.println("You entered:  "  + user);
        System.out.println("User input is numeric:  " + StringUtils.isNumeric(user));
        System.out.println("Users input reverse:  "   + StringUtils.reverse(user));
        System.out.println( "User input flipped:  "+ StringUtils.swapCase(user));
    }
}
