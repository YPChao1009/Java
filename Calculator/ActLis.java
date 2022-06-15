/*
 * CALCULATOR-ActLis.java
 * Author:Yun Pei Chao 
 */
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActLis extends app17_18 implements ActionListener{

	
	private static double num=0.0;
	private static byte op;
	private static double result=0.0;
	
	public void actionPerformed(ActionEvent e) throws NumberFormatException,ArithmeticException{
		
		Button btn=(Button)e.getSource();
		
			try {
				// 處理數字1~9
				for (int i = 0; i <= 9; i++ ) {
					if (btn == digits[i]) {
						save_digit( btn );
						output_num( num );
						break;
					}
				}

				if (btn == cn) {
					result = 0.0;// 把儲存的結果歸0
					num = 0.0;
					op = 0;
					output_num( num );
				}
				else if (btn == add) { // 加
					save_num();
					op = 1;
					output_button( btn );
				}
				else if (btn == sub) { // 減
					save_num();
					op = 2;
					output_button( btn );
				}
				else if (btn == mul) { // 乘
					save_num();
					op = 3;
					output_button( btn );
				}
				else if (btn == div) { // 除
					save_num();
					op = 4;
					output_button( btn );
				}
				else if (btn == eql) {
					switch (op) {
					case 1:
						result += num;
						break;
					case 2:
						result -= num;
						break;
					case 3:
						result *= num;
						break;
					case 4:
						result /= num;
						break;
					default:
					}
					num = 0.0;
					output_num( result );
				}
			} catch (NumberFormatException ne) {
				// 捕捉例外
			} catch (ArithmeticException ae) {
				// 捕捉被除數是零的例外
			}
		}
	
	private void save_num() {
		result=num;
		num=0.0;
		}
	private void save_digit(Button btn) {
		num=num*10+Double.parseDouble(btn.getLabel());
		
	}
	
	private void output_button(Button btn) {
		lab.setText( btn.getLabel() );
	}

	// 輸出計算數值到標籤
	private void output_num(double num) {
		int i = ( int ) num;
		if (num == ( double ) i)
			lab.setText( Integer.toString( i ) );
		else
			lab.setText( Double.toString( num ) );
	}

}
