package NormalProg;
class Rectangle{
	int length;
	int width;

	//This is parameterized constructor
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	Rectangle (Rectangle obj){
		length = obj.length;
		width = obj.width;
	}

	void getdata(){
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
	}
}

class CopyConstructor{
	public static void main(String [] args){
		Rectangle obj1= new Rectangle(10,30);
		Rectangle obj2= new Rectangle(obj1);
		obj1.getdata();
		obj2.getdata();
		if(obj1 == obj2)
			System.out.println("Same");
		else
			System.out.println("Not same.");
	}
}