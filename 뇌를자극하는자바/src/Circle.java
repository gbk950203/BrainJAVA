public class Circle{
	int radius;
	String name;
	
	//매개변수 없는 생성자
	public Circle() {
		radius = 1;
		name = "";
	}
	
	//매개변수를 가진 생성자
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
		
	//메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	//메인메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza = new Circle (10, "자바피자");
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + pizza_area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "도넛피자";
		double donut_area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + donut_area);
		
		System.out.println(pizza.name + "의 면적은" + pizza_area);
		System.out.println(donut.name + "의 면적은" + donut_area);
		
	}
}
