import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(new GameManager()) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
