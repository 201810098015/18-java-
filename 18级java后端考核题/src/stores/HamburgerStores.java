package stores;
import hamburgers.Hamburgers;
/*
 * ��������຺����
 */
public abstract class HamburgerStores {
	//��ȡ����
	public Hamburgers orderHamburgers(String type) {
		//�����������󣬲���������ĳ��󷽷�createHamburgers(String type)
		Hamburgers hamburger=createHamburgers(type);
		hamburger.bake();
		hamburger.cut();
		hamburger.box();
		hamburger.price();
		return hamburger;
	}
        //������󺺱��͵�������������������Ϊ��������
	 public abstract Hamburgers createHamburgers(String type);

}
