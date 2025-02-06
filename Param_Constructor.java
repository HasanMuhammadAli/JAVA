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

class Param_Constructor{
	public static void main(String [] args){
		Rectangle r_obj= new Rectangle(10,30);
		r_obj.getdata();
	}
}