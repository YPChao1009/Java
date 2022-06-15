public class Game {

	public static void main(String[] args) {
		Role[] R = new Role[6];
		
		R[0] = new Warrior("天下第一刀",4000,10000);
		R[1] = new Warrior("天下第二刀",4000,10000);
		R[2] = new Warrior("天下第三刀",4000,10000);
		
		R[3] = new Witch("天下第一法", 2800, 20000) ;
		R[4] = new Witch("天下第二法", 2800, 20000) ;
		R[5] = new Witch("天下第三法", 2800, 20000) ;
		
		int a, b, turn = 1 ;
		
		while(true) {
			do{
			a = (int)(Math.random()*6) ;
			b = (int)(Math.random()*6) ;
			}while(a==b);//不能同一人
			
			
			//兩個互打
			System.out.println("Turn " + turn);
			//R[a]先打R[b]
			System.out.println(R[a].getName() + " 打 " + R[b].getName());
			if(R[a] instanceof Warrior)
			{
				((Warrior)R[a]).NewMoon(R[b]);
			}
			else if(R[a] instanceof Witch)
			{
				((Witch)R[a]).SmallFire(R[b]);
			}
			System.out.println(R[b]);//還沒死print剩餘血量
			
			recover(R[a]);
			recover(R[b]);
			if(R[b].getLife()<=40) {
				int chance=(int)(Math.random()*10+1);
				if(chance==1) {
					R[b].Drink(new RedDrug("large"));
					System.out.println("使用了大瓶紅藥水");
				}
				else if(chance>=2&&chance<=3) {
					R[b].Drink(new RedDrug("medium"));
					System.out.println("使用了中瓶紅藥水");
				}
				else if(chance>=4&&chance<=7) {
					R[b].Drink(new RedDrug("small"));
					System.out.println("使用了小瓶紅藥水");
				}
				else {
					System.out.println("沒喝到紅藥水");
				}
			}
			
			if(R[a].getMagic()<=30) {
				int chance=(int)(Math.random()*10+1);
				if(chance==1) {
					R[a].Drink(new BlueDrug("large"));
					System.out.println("使用了大瓶藍藥水");
				}
				else if(chance>=2&&chance<=3) {
					R[a].Drink(new BlueDrug("medium"));
					System.out.println("使用了中瓶藍藥水");
				}
				else if(chance>=4&&chance<=7) {
					R[a].Drink(new BlueDrug("small"));
					System.out.println("使用了小瓶藍藥水");
				}
				else {
					System.out.println("沒喝到藍藥水");
				}
			}
			System.out.println(R[a]);
			System.out.println(R[b]);
			//R[b]再打R[a]
			System.out.println(R[b].getName() + " 打 " + R[a].getName());
			if(R[b] instanceof Warrior)
			{
				((Warrior)R[b]).NewMoon(R[a]);
			}
			else if(R[b] instanceof Witch)
			{
				((Witch)R[b]).SmallFire(R[a]);
			}
			System.out.println(R[a]);//還沒死print剩餘血量
			
			recover(R[a]);
			recover(R[b]);
			if(R[a].getLife()<=40) {
				int chance=(int)(Math.random()*10+1);
				if(chance==1) {
					R[a].Drink(new RedDrug("large"));
					System.out.println("使用了大瓶紅藥水");
				}
				else if(chance>=2&&chance<=3) {
					R[a].Drink(new RedDrug("medium"));
					System.out.println("使用了中瓶紅藥水");
				}
				else if(chance>=4&&chance<=7) {
					R[a].Drink(new RedDrug("small"));
					System.out.println("使用了小瓶紅藥水");
				}
				else {
					System.out.println("沒喝到紅藥水");
				}
			}
			
			if(R[b].getMagic()<=30) {
				int chance=(int)(Math.random()*10+1);
				if(chance==1) {
					R[b].Drink(new BlueDrug("large"));
					System.out.println("使用了大瓶藍藥水");
				}
				else if(chance>=2&&chance<=3) {
					R[b].Drink(new BlueDrug("medium"));
					System.out.println("使用了中瓶藍藥水");
				}
				else if(chance>=4&&chance<=7) {
					R[b].Drink(new BlueDrug("small"));
					System.out.println("使用了小瓶藍藥水");
				}
				else {
					System.out.println("沒喝到藍藥水");
				}
			}
			System.out.println(R[a]);
			System.out.println(R[b]);
			turn++; //回合結束								
				
		}}
			public static void recover(Role i) {
			if(i instanceof Warrior) {
				if(i.getLife()<4000) {
				i.setLife(i.getLife()+(int)((Warrior)i).recoverLife());
			}}
			else if(i instanceof Witch) {
				if(i.getMagic()<20000)
				i.setMagic(i.getMagic()+(int)((Witch)i).recoverMagic());
			}
		}
	
}