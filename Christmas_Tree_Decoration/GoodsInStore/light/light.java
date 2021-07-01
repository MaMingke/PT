package light;

import factory.Goods;

public class light extends Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "light\t price：" + this.price + "num:*"
				+ this.num + "total" + this.OriginalPrice());
	}

	public void Silver_light(int num) {
		this.name = "liver";
		this.price = 30.0F;
		this.num = num;
	}

	public void colorful_light(int num) {
		this.name = "color";
		this.price = 50.0F;
		this.num = num;
	}
}