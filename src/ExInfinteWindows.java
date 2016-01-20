import javax.swing.JFrame;

public class ExInfinteWindows {
	public static void main(String[] args) {
		while (true) {
			JFrame frame = new JFrame("loop");
			frame.setVisible(true);
		}
	}
}