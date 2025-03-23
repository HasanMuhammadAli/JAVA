package NormalProg;
class Shape{
	int length;
	int width;
	Shape(){
		System.out.println("Object created.");
	}
	Shape(int length){
		this.length = length;
		this.width = length;
		getData();
	}
	Shape(int length, int width){
		this.length = length;
		this.width = width;
		getData();
	}
	void getData(){
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
		getArea();
	}
	void getArea(){
		System.out.println("Area = "+length*width);
	}
}
class ShapeDemo{
	public static void main(String []args){
		Shape Square = new Shape(4);
		Shape Rectangle = new Shape(4,3);
		Square.getData();
		Square.getArea();
		Rectangle.getData();
		Rectangle.getArea();
	}
}