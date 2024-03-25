package ntu_63130554;

import java.awt.EventQueue;

public class MainSapXep {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                Interface frame = new Interface();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
	}

}
