package ntu_63130554;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame {
	private JFrame frame;
	public Interface() {
		frame = new JFrame("App Sap Xep");
		JButton btn_number = new JButton("Số 1");
		btn_number.addActionListener(e->{
			System.out.println("Số 1");
		});
	}

}
