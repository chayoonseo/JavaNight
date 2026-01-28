package lesson4;

public record Phone(String name, int price, int hal, double fee ) {

	public void showMonthMoney() {
		//출고가 / 할부개월 수 + (출고가*할부수수료(%)/100)/12
		double monthMoney = price / hal + (price * fee / 100) / 12;
		System.out.println("매월 할부금:" + monthMoney);

	}
}
