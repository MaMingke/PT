package bell;

import factory.Goods;
import factory.Interface_Goods;

public abstract class Bell_abstract extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("~~~~~~~" + this.name + "beels\t price：" + this.price + "\num"
				+ this.num+"\n"+this.meanning+"\n");
	}
}