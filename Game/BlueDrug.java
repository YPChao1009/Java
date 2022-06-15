
public class BlueDrug extends Drug{

	public BlueDrug() {
	super();
	}
	public BlueDrug(String Size) {
	switch (Size) {
	case "large":
		setAddMagic(100);
		break;
	case "medium":
		setAddMagic(60);
		break;
	case "small":
		setAddMagic(30);
		break;
	default:
		System.out.println("No such drug size:"+Size);
		setAddMagic(0);
	}
	
	}
	
}
