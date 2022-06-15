
public class RedDrug extends Drug{

	public RedDrug() {
super();
	}
	public RedDrug(String Size) {
	switch (Size) {
	case "large":
		setAddLife(120);
		break;
	case "medium":
		setAddLife(80);
		break;
	case"small":
		setAddLife(50);
		break;
	default:
		System.out.println("No such drug size:"+Size);
		setAddLife(0);
	}
	}
	
}
