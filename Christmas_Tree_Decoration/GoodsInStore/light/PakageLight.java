package light;

//工厂的具体实现
public class PakageLight extends Light_abstract {
	public PakageLight(int num) {
		this.name = "lampe";
		this.price = 50.09F;
		this.num = num;
		this.meanning="lampe》》light";//
	}
}