
public class Drug {

	 String Size;
     int AddLife;
  	 int AddMagic;
	
	public Drug() {	}
	public Drug(String Size,int AddLife,int AddMagic) {
	this.Size=Size;
	this.AddLife=AddLife;
	this.AddMagic=AddMagic;
	}
	
	public String getSize() {
		return Size;
	}

	public void setSize(String Size) {
		this.Size = Size;
	}

	public int getAddLife() {
		return AddLife;
	}

	public void setAddLife(int AddLife) {
		this.AddLife = AddLife;
	}

	public int getAddMagic() {
		return AddMagic;
	}

	public void setAddMagic(int AddMagic) {
		this.AddMagic = AddMagic;
	}
}
