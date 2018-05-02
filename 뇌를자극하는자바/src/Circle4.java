public class Circle4 {
	public int radius;
	public String name;
		
	// 매개변수 없는 생성자
	public Circle4() { 
		radius = 1;
		name = "";  
	}

	// 매개변수를 가진 생성자
	public Circle4(int r, String n) {
		radius = r;
		name = n;
	}

	// 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}

	// 메인메소드
	public static void main(String[] args) {
		
		Circle4 pizza = new Circle4(10, "자바피자");
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + pizza_area);
/*		
		Circle4 donut = new Circle4(); // 매개변수 없는 생성자 호출
		donut.radius = 2;
		donut.name = "자바도넛";
		
		double donut_area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + donut_area);
		System.out.println(pizza.name + "의 면적은 " + pizza_area);	
*/
	}

}