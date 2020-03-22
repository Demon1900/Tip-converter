import  java.util.Scanner;


  public class Lab21{


  public static void main (String[] args)
 {
  Scanner Sc= new Scanner(System.in);

  System.out.println("Enter the check amount:");
  double check= Sc.nextDouble();

  System.out.println("Enter tip percentage");
  int tip= Sc.nextInt();

  if(tip<0 || tip>100){
	 System.out.println("Individual tip percentage");
}
else{ double tipAmount= check * tip/100;
System.out.printf("Tip Amount= $%f.\n",tipAmount);
}

if(tip<15){
	System.out.println(" *Warning*\n Tip percentage is below started ");

	}
	else if(tip>25){
		System.out.println("**Warning**\n now you are being to generous. ");
	}

 }
}