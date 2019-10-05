package stores;

import hamburgers.Hamburgers;
/*
 * 子类AmericaHamburgerStore继承父类HamburgerStores
 */
public class AmericaHamburgerStore extends HamburgerStores{
	//实现父类HamburgerStores中的createHamburgers方法，用equals判断参数与汉堡种类是否一样，返回对应的汉堡种类
	public Hamburgers createHamburgers(String type) {
		if("BaconEggCastle".equals(type)) {
			return new AmericaBaconEggCastleHamburgers();
		}
		else if("ShrimpCastle".equals(type)) {
			return new AmericaShrimpCastleHamburgers();
		}
		else if("CodFishCastle".equals(type)) {
			return new AmericaCodFishCastleHamburgers();
		}
		else {
			return null;
		}
	}


}
