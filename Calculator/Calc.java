class Main {
public static void main (String [] args)
{
float input1 = Integer.parseInt(args[0]);
float input2 = Integer.parseInt(args[2]);
String operator = args[1];
float result = 0;

if(args.length == 3) {

switch(operator){
	
	case "+":
	result = input1 + input2;
	System.out.println("Result is : " +result);
	break;
	
	case "-":
	result = input1 - input2;
	System.out.println("Result is : " +result);
	break;
	
	case "x":
	result = input1 * input2;
	System.out.println("Result is : " +result);
	break;
	
	case "/":
	if(input2 == 0) 
		System.out.println("Enter a right expression!!");
	
	else{
	result = input1 / input2;
	System.out.println("Result is : " +result);}
	break;
	
	default:
	System.out.println("Enter a right expression!!");
}


}
else{
System.out.println("Enter a right expression!!");}
}
}