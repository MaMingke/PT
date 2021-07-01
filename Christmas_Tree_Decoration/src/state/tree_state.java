package state;


import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;
import tree.Christmas_tree;

public class tree_state extends input implements State {
	float monney;
	float monney_after_discount;
	float monney_after_dis_and_activity;
	float monney_after_acti_and_disc;
	float activity_monney;
	float after_discount;
	float goodsPrice = 0.0F;
	GoodsStrategy strategy = new discount_Strategy();//折扣优惠
	GoodsStrategy strategy1 = new newStrategy();//-10优惠
	Price discount_price = new Price(strategy);
	Price new_price1 = new Price(strategy1);
	
	float z = 0.0F;
	Store store;
	
	
	
	
	public tree_state(Store store){
		this.store=store;
	}
	
	public void cal(int type,int num) {
		// TODO Auto-generated method stub
		new newStrategy();
		Christmas_tree c1 = new Christmas_tree();
		Christmas_tree c2 = new Christmas_tree();
		if(type==2){
			c2.Pine_Tree(num);
			c2.printMessage();
			
			System.out.print("Discount？   1.yes   2.no    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(c2.OriginalPrice());
				System.out.println("￥￥Discounted price：" + monney);
			}
			else if (i==2){
				monney=c2.OriginalPrice();
			}
			
			
			activity_monney = new_price1.quote(c2.OriginalPrice());
			System.out.println("￥￥price：" + activity_monney);
		}
		else if(type==1){
			c1.Eucalyptus_Tree(num);
			c1.printMessage();
			System.out.print("Discount？   1.yes   2.no    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(c1.OriginalPrice());
				System.out.println("￥￥Discounted price：" + monney);
			}
			else if (i==2){
				monney=c1.OriginalPrice();
			}
			activity_monney = discount_price.quote(monney);
			System.out.println("￥￥price：" + activity_monney);
			
			
		}
		
		System.out.println("￥￥total" + activity_monney);
		System.out.println("❥(^_-)Pls pay:");
	}
	public String toString() {
		return "tree";
	}
	@Override
	public int type() {
		System.out.println("Enter");
		//Scanner choises = new Scanner(System.in);//选商品种类
		int type = input();
		return type;
		
	}
	

	@Override
	public int num() {
		System.out.println("Num");
		//Scanner choises = new Scanner(System.in);//选商品数量
		int num = input();
		return num;
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	

	
}
