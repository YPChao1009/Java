
public class Witch extends Role implements MagicRecoverable{

	public Witch() {
		super("Devil",8000,500);}
		
	public Witch(String Name,int Life,int Magic) {
		super(Name, Life, Magic);
	}
	
	public void SmallFire(Role R) {
		if(getMagic()<25) {
			System.out.println("魔力不足，攻擊無效!");
		}
		else {
			
			setMagic(getMagic()-25);
			if(R instanceof Warrior) {
			R.setLife(R.getLife()-40);}
			else if(R instanceof Witch) {
				R.setLife(R.getLife()-60);
			}
			if(R.getLife()<=0) {
				System.out.println(R.getName()+"被"+getName()+"打死了~");
				System.exit(0);
			}
				
			
		}
	}
	public double recoverMagic() {
		return MAGICRATE;
	}
	
}
