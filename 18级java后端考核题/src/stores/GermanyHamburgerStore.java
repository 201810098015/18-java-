package stores;
import java.util.*;

import hamburgers.BaconEggCastle;
import hamburgers.CodFishCastle;
import hamburgers.Hamburgers;
import hamburgers.ShrimpCastle;
/*
 * 子类GermanyHamburgerStore继承父类HamburgerStores
 */
public class GermanyHamburgerStore extends HamburgerStores{
	//实现父类HamburgerStores中的createHamburgers方法，用equals判断参数与汉堡种类是否一样，返回对应的汉堡类型
	public Hamburgers createHamburgers(String type) {
		if("BaconEggCastle".equals(type)) {
			return new GermanyBaconEggCastleHamburgers();
		}
		else if("ShrimpCastle".equals(type)) {
			return new GermanyShrimpCastleHamburgers();
		}
		else if("CodFishCastle".equals(type)) {
			return new GermanyCodFishCastleHamburgers();
		}
		else {
			return null;
		}
	}

}
