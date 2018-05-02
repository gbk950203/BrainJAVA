


public class Circle3 {
	public int radius;
	public String name;
	
	//매개변수 없는 생성자
	public Circle3() {
		radius = 1;
		name = "";
	}
	
	//매개변수를 가진 생성자
	public Circle3(int r, String n) {
		radius = r;
		name = n;
	}
	
	//메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	//메인메소드
	public static void main(String[] args) {
		
		Circle3 pizza = new Circle3(10, "자바피자");
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + pizza_area);

	}

}
