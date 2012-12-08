package teste;

import java.awt.Dimension;

import javax.swing.JFrame;

import drawing.Panel;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Such a nice day");

		JFrame frame = new JFrame();
		Dimension size = new Dimension(512, 512);
		frame.setSize(size);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		Panel panel = new Panel();

		frame.add(panel);

	}

}
