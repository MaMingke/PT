package star;

import factory.Goods;
import factory.Interface_Goods;

public abstract class Star_abstract extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "Christmas star\t price：" + this.price + "num"
				+ this.num);
	}
}