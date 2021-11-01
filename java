// This Java program calculates sales. It has a set sales price & value of products 1 -5 and requests user input. The application requests what product (1-5) the user purchased.
Afterwards, it requests the quantity user purchased and then successfully calculates the final sales value.

import java.util.Scanner;

public class CalcSales {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

double totalRetail=0;
while(true){ //Menu
System.out.println("1 - Product 1, $2.98");
System.out.println("2 - Product 2, $4.50");
System.out.println("3 - Product 3, $9.98");
System.out.println("4 - Product 4, $4.49");
System.out.println("5 - Product 5, $6.87");
System.out.println("6 - Exit program");

System.out.print("Enter product number: ");
int productnumber=input.nextInt();
if(productnumber==6){ //Exit
break;}

System.out.print("Enter quantity sold: "); // Quanity
int quantitySold=input.nextInt();

switch(productnumber){ // Switch statement
case 1: totalRetail+=2.98*quantitySold;
break;
case 2: totalRetail+=4.50*quantitySold;
break;
case 3: totalRetail+=9.98*quantitySold;
break;
case 4: totalRetail+=4.49*quantitySold;
break;
case 5: totalRetail+=6.87*quantitySold;
break;}

System.out.println("\nThe total retail value of all products sold: $"+totalRetail);
    }
} 
}
