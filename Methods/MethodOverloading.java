package Methods;
class MethodOverloading{
	public static void main(String [] args){
		System.out.println("Area of Square : "+getArea(4));
		System.out.println("Area of Rectangle : "+getArea(4,3));
		System.out.println("Area of Circle : "+getArea(2.3));
	}
	static int getArea(int a){
		return a*a;
	}
	static int getArea(int a ,int b){
		return a*b;
	}
	static double getArea(double r){
		return 3.14*r*r;
	}	
}