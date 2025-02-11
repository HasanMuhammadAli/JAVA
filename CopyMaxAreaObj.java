class Rectangle{
	int length;
	int width;

	Rectangle(){
		System.out.println("Object created.");
	}

	//This is parameterized constructor
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}

	void getData(){
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
	}
	
	int getArea(){	
		return length*width;
	}

	void copyMaxAreaObjMethod(Rectangle r1, Rectangle r2){
		if(r1.getArea() > r2.getArea()){
			length = r1.length;
			width = r1.width;
		}
		else{
			length = r2.length;
			width = r2.width;
		}
	}

}

class CopyMaxAreaObj{
	public static void main(String [] args){
		Rectangle obj1 = new Rectangle(10,30);
		Rectangle obj2 = new Rectangle(10,20);
		Rectangle obj3 = new Rectangle();

		System.out.println("Area of object 1 : "+ obj1.getArea());
		System.out.println("Area of object 2 : "+ obj2.getArea());
		obj3.copyMaxAreaObjMethod(obj1, obj2);
		System.out.println("Area of object 3 : "+ obj3.getArea());
		
	}
}