package test;

import hamburgers.Hamburgers;
import stores.AmericaHamburgerStore;
import stores.GermanyHamburgerStore;
import stores.HamburgerStores;

public class Test {
	
	public static void main(String[] args) {
		//ʵ����������ΪhamburgerStore1
		HamburgerStores hamburgerStore1=new AmericaHamburgerStore();
		//Ϊ��������Ӻ�������hamburger1
	    Hamburgers hamburger1=hamburgerStore1.createHamburgers("BaconEggCastle");
	    //Ϊ�����������ʵ���������ĸ�����
		hamburger1.bake();
		hamburger1.cut();
	    hamburger1.box();	
	    hamburger1.price();
	    //ʵ����������ΪhamburgerStore2
		HamburgerStores hamburgerStore2=new GermanyHamburgerStore();
		//Ϊ��������Ӻ�������hamburger2
		Hamburgers hamburger2=hamburgerStore2.createHamburgers("CodFishCastle");
		//Ϊ�����������ʵ���������ĸ�����
		hamburger2.bake();
		hamburger2.box();
		hamburger2.cut();
		hamburger2.price();
	}

}
