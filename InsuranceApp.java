import java.util.Scanner;
public class InsuranceApp{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("______Menu______");
            System.out.println("Enter 1 : Premium Calculation");
            System.out.println("Enter 2 : Maturity Amount Calculation");
            System.out.println("Enter 3 : Convert Policy Details to Upper Case");
            System.out.println("Enter 4 : Convert Policy Details to Lower Case");
            System.out.println("Enter 5 : Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1 :
                System.out.println("Enter customers Age: ");
                int age=sc.nextint();
                douvle premium=0;
                System.out.println("Enter your sum: ");
                double sumAssured=sc.nextDouble();
                if(age<25)
                {
                    premium=0.05*sumAssured;
                }
                else if(age>25 && age < 40){
                    premium=0.10*sumAssured;

                }
                else if(age>40){
                    premium=0.20*sumAssured;
                }
                    System.out.println("Premium amount is :"+premium);
                    break;
                    case 2:
                    System.out.println("Maturity Amount Calculation);

                }
            }
            }
    }
}