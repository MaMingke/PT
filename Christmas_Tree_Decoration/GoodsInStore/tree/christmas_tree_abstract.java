package tree;

import factory.Goods;
import factory.Interface_Goods;

public abstract class christmas_tree_abstract extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "tree\t price：" + this.price + "num"
				+ this.num);
	}
}