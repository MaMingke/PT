package tree;

import factory.Goods;
import factory.Interface_Goods;

public class Christmas_tree extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "tree\t price：" + this.price + "num:*"
				+ this.num + "Total original price:" + this.OriginalPrice());
	}

	public void Eucalyptus_Tree(int num) {
		this.name = "Fir tree";
		this.price = 2500F;
		this.num = num;
		this.meanning="Fir tree》》》long life";
	}

	public void Pine_Tree(int num) {
		this.name = "Larch";
		this.price = 3500F;
		this.num = num;
		this.meanning="Larch》》》long life";
	}
}