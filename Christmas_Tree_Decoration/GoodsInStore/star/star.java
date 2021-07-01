package star;

import factory.Goods;
import factory.Interface_Goods;

public class star extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "christmas star\t price：" + this.price + "num:*"
				+ this.num + "Total original price:" + this.OriginalPrice());
	}

	public void minisize_Star(int num) {
		this.name = "small";
		this.price = 10.0F;
		this.num = num;
		this.meanning="small》》good luck";
	}

	public void largesize_star(int num) {
		this.name = "big";
		this.price = 15.0F;
		this.num = num;
		this.meanning="big》》good luck";
	}
}