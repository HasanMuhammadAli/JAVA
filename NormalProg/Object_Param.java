package NormalProg;
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

	boolean isEqual(Rectangle temp){
		if(length == temp.length && width == temp.width)
			return true;
		return false;
	}
}

class Object_Param{
	public static void main(String [] args){
		Rectangle r_obj1= new Rectangle(10,30);
		Rectangle r_obj2= new Rectangle (10,20);
		if(r_obj1.isEqual(r_obj2))
			System.out.println("Both objs have same value.");
		else
			System.out.println("Both objs have different value.");
		
	}
}