package state;


import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;


public class menuFirst_state  extends input implements State {
	Store store;
	public menuFirst_state(Store store){
		this.store=store;
	}
	public void pay(Object o, int num) {
		// TODO Auto-generated method stub
		
	}
	public void cal() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	float goodsPrice = 0.0F;
	float z = 0.0F;
	
	GoodsStrategy strategy = new discount_Strategy();
	GoodsStrategy strategy1 = new newStrategy();
	
	Price price = new Price(strategy);
	
	//new baseStrategy();
	
	Price price1 = new Price(strategy1);
	
	float mix_after_discount;
	float monney;

	
	@Override
	public int type() {
		/*Scanner choises = new Scanner(System.in);//选商品种类
		int t = choises.nextInt();*/
		int t=input();
		if(t==1){
			System.out.println("Please choose quantity and color：1.Silver，2.gold");
			store.setState(store.getlight_state());//切换到选购圣诞灯模式
			//System.out.println(store);
		}
		else if (t == 2) {
			System.out.println("Please select the type and number of trees：1.Fir tree，2.pine");
			store.setState(store.gettree_state());
		// TODO Auto-generated method stub
		}
		else if (t == 3) {
			System.out.println("Please select the type and quantity of Christmas stars：1.small，2.large");
			store.setState(store.getstar_state());
		}
		else if (t == 4) {
			System.out.println("Please select the type and quantity of Christmas bells：1.snow man，2.gold ball");
			store.setState(store.getbell_state());
		}
		return 0;
	}
	
	public String toString() {
		return "~~~~~~~~~~~~xxxx设计模式集团xxxxx~~~~~~~~~~~~";
	}
	
	public void show(){
		System.out.println("------------Christmas Tree  store--------------");
		System.out.println("~~~~~~~~~~~~~christmas get discount！~~~~~~~~~~~~·");
		System.out.println("1.single			     	2.Tree menu ");
		int sing_or_mix_choise=input();
		switch (sing_or_mix_choise) {
		case 1 :
			System.out.println("1.christmas light，2.christmas tree，3.christmas star，4.christmas bells");
			//store.type();//切换到选购圣诞灯模式
			break;
		case 2 :
			System.out.println("menu is batter！  :");
			store.setState(store.getpakage());
			
			
		}
	}
	

	@Override
	public int num() {
		return 0;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cal(int type, int num) {
		// TODO Auto-generated method stub
		
	}
	
	
}
