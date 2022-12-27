
public class Car {
//	フィールド
	private int fuel; //燃料
	private int consumption; //燃費
	
//	コンストラクタ
	Car(int fuel, int consumption){
		this.fuel = fuel;
		this.consumption = consumption;
	}
	
//	メソッド
//	運転
	public void run(int mileage) {
		this.fuel -= mileage / consumption;
	}
	
//	燃料系の表示
	public void dispFuelGauge() {
		System.out.println("残量：" + this.fuel + "ℓ");
	}
}
