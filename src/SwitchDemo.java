public class SwitchDemo {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c;

        String operation = "sub";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("Addition="+c);
                break;

            case "sub" : c = a - b;
                System.out.println("Subtraction="+c);
                break;

            case "mult" : c = a * b;
                System.out.println("multiply="+c);
                break;

            case "div" : c = a / b;
                System.out.println("Division="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;
        }


    }
}
