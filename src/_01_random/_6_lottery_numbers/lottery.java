package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	Random ran = new Random();
	int num = ran.nextInt(10);
	
	Random a = new Random();
	int b = a.nextInt(10);
	
	Random c = new Random();
	int d = c.nextInt(10);
	
	Random e = new Random();
	int f = e.nextInt(10);
	
	Random g = new Random();
	int h = g.nextInt(10);
	
	Random i= new Random();
	int j = i.nextInt(10);
	
	
	JOptionPane.showMessageDialog(null,  num+ ", " +b+ ", "+d+ ", "+f+ ", "+h+ ", "+j + ".");
	
}
}
