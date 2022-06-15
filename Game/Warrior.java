
public class Warrior extends Role implements LifeRcoverable{

	public Warrior() {
		super("God",8000,500);}
	public Warrior(String Name,int Life,int Magic) {
		super(Name, Life, Magic);}
	
	public void NewMoon(Role R) {
		if(getMagic()<10) {
			System.out.println("魔力不足，攻擊無效!");
		}
		else {
			
			setMagic(getMagic()-10);
			if(R instanceof Warrior) {
			R.setLife(R.getLife()-25);}
			else if(R instanceof Witch) {
				R.setLife(R.getLife()-40);
			}
			
			if(R.getLife()<=0) {
				System.out.println(R.getName()+"被"+getName()+"打死了~");
				System.exit(0);
				}
		}
	}
	public double recoverLife() {
	return LIFERATE;
	}
	
}
