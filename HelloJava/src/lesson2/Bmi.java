package lesson2;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("키 입력?"); // 커서가 바로 뒤로 감
		var height = scan.nextDouble();
		height = height / 100; // cm => m
		height /= 100;
		System.out.println("몸무게 입력?");
		var weight = scan.nextDouble();
		System.out.println("당신의 체질량 지수는 ");
		var bmi = weight/ (height * height);
		System.out.println(bmi + "입니다.");
	}

}
