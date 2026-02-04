package lesson5;

public class Kia implements Sport<Integer>{

	@Override
	public void intro(Integer sunsu) {
		switch (sunsu) {

		case 5:
			System.out.println("김도영입니다.");
			break;
		default:
			System.out.println("기아는 선수가 다 좋음");
		}
	}

}
