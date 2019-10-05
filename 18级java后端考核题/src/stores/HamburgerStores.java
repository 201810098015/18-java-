package stores;
import hamburgers.Hamburgers;
/*
 * 定义抽象类汉堡店
 */
public abstract class HamburgerStores {
	//获取汉堡
	public Hamburgers orderHamburgers(String type) {
		//创建汉堡对象，并调用下面的抽象方法createHamburgers(String type)
		Hamburgers hamburger=createHamburgers(type);
		hamburger.bake();
		hamburger.cut();
		hamburger.box();
		hamburger.price();
		return hamburger;
	}
        //定义抽象汉堡型的制作汉堡方法，参数为汉堡种类
	 public abstract Hamburgers createHamburgers(String type);

}
