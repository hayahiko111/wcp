package classMethod.human;

import classMethod.human.Human02;

class classMethod02 {
	public static void main(String[] age) {
		Human02 yamada = new Human02(); //Human02クラスのインスタンスを生成
		System.out.println("名前は" + yamada.name + "で年齢は" + yamada.age + "です");

		Human02 sato = new Human02("佐藤", 29);
		System.out.println("名前は" + sato.name + "で年齢は" + sato.age + "です");
	}
}