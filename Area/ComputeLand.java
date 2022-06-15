
public class ComputeLand {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Land[] l=new Land[3];
		l[0]=new Circle(50.0);
		l[1]=new Square(80.0);
		l[2]=new Trapezoid(20, 80, 18);
		
		Calculator ca=new Calculator(150.0);
		
		for(int i=0;i<3;i++) {
			System.out.println(l[i]+" , Price="+ca.calculatePrice(l[i]));
		}
	}

}
