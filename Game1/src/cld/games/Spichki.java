package cld.games;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spichki {

	public static void main(String[] args) {
		int machHeap = 15;
		String winMessage;
		
		while(true){

			//                   Хід першого гравця
			
			String s = JOptionPane.showInputDialog(" Хід гравця. На купці зараз "+machHeap+" Введіть число 1, 2 або 3 " );
			int move = Integer.parseInt(s);
			machHeap = machHeap - move;
			
			//                    Перевірка
			
			if (machHeap <= 0){
				winMessage = "Сорі братан ти проєбав квартиру";
				break;
			}
		   
			//                    Хід другого гравця
			
			Random r = new Random();
			move = r.nextInt(3)+1;
			
			JOptionPane.showMessageDialog(null,
					" На купці зараз "+machHeap+" сірників. Комп'ютер взяв "+move+" сірників. ");
			machHeap = machHeap - move;
			
			//                       Перевірка
			
			if (machHeap <=0){
				winMessage = "Ну ніхуя собі. Єбать ти інтілєкт ";
				break;
			}
		}
        JOptionPane.showMessageDialog(null, winMessage);
	}

}
