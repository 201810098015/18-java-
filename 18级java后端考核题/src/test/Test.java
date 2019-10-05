package test;

import hamburgers.Hamburgers;
import stores.AmericaHamburgerStore;
import stores.GermanyHamburgerStore;
import stores.HamburgerStores;

public class Test {
	
	public static void main(String[] args) {
		//实例化汉堡店为hamburgerStore1
		HamburgerStores hamburgerStore1=new AmericaHamburgerStore();
		//为汉堡店添加汉堡对象hamburger1
	    Hamburgers hamburger1=hamburgerStore1.createHamburgers("BaconEggCastle");
	    //为这个汉堡对象实例化以下四个方法
		hamburger1.bake();
		hamburger1.cut();
	    hamburger1.box();	
	    hamburger1.price();
	    //实例化汉堡店为hamburgerStore2
		HamburgerStores hamburgerStore2=new GermanyHamburgerStore();
		//为汉堡店添加汉堡对象hamburger2
		Hamburgers hamburger2=hamburgerStore2.createHamburgers("CodFishCastle");
		//为这个汉堡对象实例化以下四个方法
		hamburger2.bake();
		hamburger2.box();
		hamburger2.cut();
		hamburger2.price();
	}

}
