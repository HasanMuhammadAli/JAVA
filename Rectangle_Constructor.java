class Rectangle{
	int length;
	int width;

	//This is constructor
	Rectangle(){
		length = 10;
		width = 20;
	}
	void getdata(){
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
	}
}

class Rectangle_Constructor{
	public static void main(String [] args){
		Rectangle r_obj= new Rectangle();
		r_obj.getdata();
	}
}