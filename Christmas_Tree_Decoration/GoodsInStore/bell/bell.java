package bell;

import factory.Goods;
import factory.Interface_Goods;

public class bell extends Goods implements Interface_Goods {
	
	public void printMessage() {
		System.out.println("~~~~~~~" + this.name + "beels\t price：" + this.price + "\num"
				+ this.num+"\n"+this.meanning+"\n"+ "Total original price:" + this.OriginalPrice());
	}

	public void snowman(int num) {
		this.name = "snow man";
		this.price = 59.0F;
		this.num = num;
		this.meanning="snow man》》good luck.》》";
	}

	public void ball(int num) {
		this.name = "gold ball";
		this.price = 15.0F;
		this.num = num;
		this.meanning="gold ball》》good luck.》》";
	}
}