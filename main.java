import java.util.*;


class Main {
	public static void main(String[] args) {
		System.out.println("Calculator");
		

		Scanner num = new Scanner(System.in);
		
		System.out.print("Number 1:");
		float num1 = num.nextFloat();
		
		System.out.print("Number 2:");
		float num2 = num.nextFloat();

		System.out.println("Choose an opperative (+, -, x, %): ");
		String choose = num.toString();
		
		switch(choose) {
		case "+": {
			System.out.println(num1+num2);
			break;
		}
		case "-": {
			System.out.println(num1-num2);
			break;
		}
		case "x": {
			System.out.println(num1*num2);
			break;
		}
		case "*": {
			System.out.println(num1*num2);
			break;
		}
		case "%": {
			System.out.println(num1/num2);
			break;
		}
		case "/": {
			System.out.println(num1/num2);
			break;
		}

		}
	}
}
