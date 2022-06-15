
public class Role {

	private String Name;
	private int Life;
	private int Magic;
	
	public Role() {}
	Role(String Name,int Life,int Magic){
		this.Name=Name;
		this.Life=Life;
		this.Magic=Magic;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	public void setLife(int Life) {
		this.Life=Life;
	}
	public int getLife() {
		return Life;
	}
	public void setMagic(int Magic) {
		this.Magic=Magic;
	}
	public int getMagic() {
		return Magic;
	}
	public String toString()
	{
		return String.format("Name: %s, Life: %d, Magic: %d ", getName(), getLife(), getMagic());
	}
	
	public void Drink(Drug D) {
		if(D instanceof RedDrug) {
			setLife(getLife()+((RedDrug)D).getAddLife());}
			else if(D instanceof BlueDrug) {
				setMagic(getMagic()+((BlueDrug)D).getAddMagic());
			}
		}
	}

