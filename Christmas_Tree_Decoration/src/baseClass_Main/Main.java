package baseClass_Main;

import state.Store;
import state.input;

public class Main extends input{
	public static void main(String[] args) {
		Store store=new Store();	//menu state进入不同模式
		System.out.print(store);
		
		store.show();//展示商店界面
		store.type();//展示商店里你选择的商品属性	
		int type=store.type();	
		int num=store.num();
		store.cal(type,num);
		int monney=input();
		System.out.println("Merry Christmas！");
		System.out.println("~~~~~~~~~~~~~~~~~~~~谢谢~~~~~~~~~~~~~~~~~~~");
		
		
	
		
		
		
		
	}
}