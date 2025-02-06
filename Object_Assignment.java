class Rectangle{
	int length;
	int width;

	//This is parameterized constructor
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	void getdata(){
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
	}
}

class Object_Assignment{
	public static void main(String [] args){
		Rectangle r_obj1= new Rectangle(10,30);
		Rectangle r_obj2=r_obj1;
	
		if(r_obj1 == r_obj2){
			System.out.println("Objects are same");
		}
		
	}
}