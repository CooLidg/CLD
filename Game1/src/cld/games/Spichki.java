package cld.games;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spichki {

	public static void main(String[] args) {
		int machHeap = 15;
		String winMessage;
		
		while(true){

			//                   ճ� ������� ������
			
			String s = JOptionPane.showInputDialog(" ճ� ������. �� ����� ����� "+machHeap+" ������ ����� 1, 2 ��� 3 " );
			int move = Integer.parseInt(s);
			machHeap = machHeap - move;
			
			//                    ��������
			
			if (machHeap <= 0){
				winMessage = "��� ������ �� ������ ��������";
				break;
			}
		   
			//                    ճ� ������� ������
			
			Random r = new Random();
			move = r.nextInt(3)+1;
			
			JOptionPane.showMessageDialog(null,
					" �� ����� ����� "+machHeap+" ������. ����'���� ���� "+move+" ������. ");
			machHeap = machHeap - move;
			
			//                       ��������
			
			if (machHeap <=0){
				winMessage = "�� ���� ���. ����� �� ������ ";
				break;
			}
		}
        JOptionPane.showMessageDialog(null, winMessage);
	}

}
