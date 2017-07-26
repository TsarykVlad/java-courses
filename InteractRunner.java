import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String first = "", second = "";
            int save = 0;
            while (!exit.equals("yes")) {
                if (save == 0) {
                    System.out.println("Enter first arg : ");
                    first = reader.next();
                }
                System.out.println("Enter second arg: ");
                second = reader.next();
                System.out.println("Chouse an action: \n1 - add\n2 - sub\n3 - mul\n4 - div\n");
                int action = Integer.valueOf(reader.next());
                switch (action){
                    case 1: calc.add(Double.valueOf(first), Double.valueOf(second));
                            break;
                    case 2: calc.sub(Double.valueOf(first), Double.valueOf(second));
                            break;
                    case 3: calc.mult(Double.valueOf(first), Double.valueOf(second));
                            break;
                    case 4: calc.div(Double.valueOf(first), Double.valueOf(second));
                            break;
                    default: break;
                }
                System.out.println("Result: " + calc.getResult());
                System.out.println("Exit: yes/no ");
                exit = reader.next();
                if (exit.equals("yes")){
                    calc.cleanResult();
                    break;
                }
                System.out.println("Save result as the first arg? 1/0");
                save = Integer.valueOf(reader.next());
                if (save == 1) {
                    first = String.valueOf(calc.getResult());
                    calc.cleanResult();
                } else {
                    calc.cleanResult();
                }
            }
        } finally {
            reader.close();
        }
    }
}