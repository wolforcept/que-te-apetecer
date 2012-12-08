package drawing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {

	BufferedImage image;

	public Panel() {

		try {
			image = ImageIO.read(getClass().getResource(
					"resources/testimage.png"));
		} catch (IOException e) {
			System.err.println("testimage fail");
		}
	}

	@Override
	public void paint(Graphics g) {
		if (image != null)
			g.drawImage(image, 100, 100, this);
	}

}
