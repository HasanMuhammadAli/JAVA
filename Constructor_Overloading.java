class Rectangle{
	int length;
	int width;

	//This is constructor
	Rectangle (){
		length = 20;
		width = 40;
	}

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

class Constructor_Overloading{
	public static void main(String [] args){
		Rectangle r_obj= new Rectangle(10,30);
		r_obj.getdata();
		
		Rectangle r2_obj= new Rectangle();
		r2_obj.getdata();
	}
}