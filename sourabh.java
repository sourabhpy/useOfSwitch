package NewJavaProject;

import java.util.Scanner;
class sourabh {

    public static void main(String[] args) {

    	int number, choice;
    	System.out.println("Enter a number :");
	    Scanner scan = new Scanner(System.in);
    	number = scan.nextInt();
    	System.out.println("Enter 1 for reverse or 2 for sum of the digits of the entered number : ");
    	choice = scan.nextInt();
    	scan.close();
    	switch(choice){
    	case 1:
    		int sum=0, rem;
    		System.out.println("The reverse of this number is : ");
    		while (number!=0){
    			rem = number%10;
    			sum = sum*10 + rem;
    			number = number/10;
    		}
    		System.out.println(""+sum);
    		break;
    	case 2:
    		int sum2=0;
    		System.out.println("The sum of the digits is : ");
    		while (number!=0){
    			sum2 = sum2 + number%10;
    			number = number/10;
    		}
    		System.out.println(""+sum2);
    		break;
	    }
    }
}