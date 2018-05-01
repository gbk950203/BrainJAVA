
public class ConditionalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0, num2 = 0;
		
		if (++num1 > 0 || ++num2 > 0) {
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		}
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}

}
