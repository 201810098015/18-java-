package stores;

import hamburgers.Hamburgers;
/*
 * ����AmericaHamburgerStore�̳и���HamburgerStores
 */
public class AmericaHamburgerStore extends HamburgerStores{
	//ʵ�ָ���HamburgerStores�е�createHamburgers��������equals�жϲ����뺺�������Ƿ�һ�������ض�Ӧ�ĺ�������
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
