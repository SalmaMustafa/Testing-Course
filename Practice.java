package Day1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
      /* 1
       int rate = 15;
        int MaxWeeklyHours = 40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your weekly hours:");
        double WorkWeeklyHours = scanner.nextDouble();
        while(WorkWeeklyHours > MaxWeeklyHours || WorkWeeklyHours <=0) {
            System.out.println("Invalid input, please enter hours between 1 & 40");
            WorkWeeklyHours = scanner.nextDouble();
        }
        scanner.close();
        double salary = WorkWeeklyHours * rate;
        System.out.println("the gross salary is:" + salary);

    */

     /* 2
        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.println("please enter first number:");
           double num1 = scanner.nextDouble();
            System.out.println("please enter 2 number:");
            double num2 = scanner.nextDouble();
            System.out.println("please enter 3 number:");
            double num3 = scanner.nextDouble();

            double sum = num1 + num2 + num3;
            System.out.println("the sum of  numbers:" + sum);
            System.out.println("do u want to repeat?");
            again = scanner.hasNextBoolean();

        }while (again);
        scanner.close();

      */
      /*  //3
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers of items");
        int quantity = scanner.nextInt();
        double total = 0;
        for (int i = 0;i< quantity; i++ ){
            System.out.println("enter item " + (i+1) +"price");
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();
        System.out.println("the total price is " + total);

       */
        /*//4
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the text");
        String text = scanner.nextLine();
        boolean letterfound = false;
        for (int i = 0; !letterfound && i<text.length();i++) {
            char currentletter = text.charAt(i);
            if (currentletter == 'A' || currentletter == 'a') {
                letterfound = true;
            }
        }

            if (letterfound){
                System.out.println("text has A or a");
            }else {
                System.out.println("text doesn't has A or a");
            }
*/
        //5
        int numberofstudent = 3;
        int numberoftest = 4;
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<numberofstudent;i++)
        {
            int total = 0;
            for (int j = 0; j<numberoftest;j++)
            {
                System.out.println("enter score of the test" + (j+1) + "for student " + (i+1)+ ":");
                double score = scanner.nextDouble();
                total *=score;
            }
            double avg = total/numberoftest;
            System.out.println("the avg score of student " + (i+1) +" is " + avg);
        }
    }
}
