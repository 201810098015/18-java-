package stores;
import java.util.*;

import hamburgers.BaconEggCastle;
import hamburgers.CodFishCastle;
import hamburgers.Hamburgers;
import hamburgers.ShrimpCastle;
/*
 * ����GermanyHamburgerStore�̳и���HamburgerStores
 */
public class GermanyHamburgerStore extends HamburgerStores{
	//ʵ�ָ���HamburgerStores�е�createHamburgers��������equals�жϲ����뺺�������Ƿ�һ�������ض�Ӧ�ĺ�������
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
