import java.util.Scanner;

class Main {
  public static void main(String[] args){
    System.out.println("Hellow World");//outputs then output a new line
Scanner in = new Scanner (System.in);
//in.nextInt();

//in.nextDouble();
//in.nextBoolean();//for dooblenas
//in.nextLine();//for strings
//the above does not store input in variable, to do so:
//prompt: System.out.print("Input an integer"); - don't use println
//acc input: 
//int num = in.nextInt();
//System.out.prontln();
//because of the Scanner thing, when pressing "enter", it also inputs a \n, which in.newLine can detect and just skip. 
//To avoid this, after inputs, use a in.nextLine(); to clear the Scanner - read \n so others won't - do this for all input command other than nextLine. 


//lowercase first letter data type are primitive, uppercase are non-primitiv- can be broken down into other data types
//escape character "\"
// \n, new line character, \t tab, \" -changes from being a string ending delimiter to a normal character
// \\ change escape character to normal backslash
double fracNum;
fracNum = 3.5;
fracNum = 4.0;// 4.0!=4
//subtraction, (-), multiplication (*), division (/), Mod (%) - remainder of division
System.out.println(fracNum);
//Variable call - use, when variable is not on left side of an assignment, replace the variable with a copy of value
//num++ comes after all rest of codes are run, ++num are before. 

System.out.println(5+5 + "Hello");



}

}
