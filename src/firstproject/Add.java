package firstproject;

public class Add {
	Add(int a, int b){
		System.out.println("hello this is sum of two"+(a+b));
		
	}
	Add(int a, int b, int c){
		System.out.println("this isthe three"+(a+b+c));
	}

public static void main(String[] args)
{
  Add arm = new Add(2,2);
  Add aer = new Add(2,2,2);
  
}}

