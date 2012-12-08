package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {

	BufferedImage image1, image2, thing;

	public Panel() {
		try {
			image1 = ImageIO.read(getClass().getResource(
					"/resources/cookie.png"));
			image2 = ImageIO.read(getClass().getResource(
					"/resources/testimage.png"));

		} catch (IOException e) {
			System.err.println("testimage fail");
		}
	}

	public void imageThing() {
		System.out.println("created thing");
		thing = (BufferedImage) createImage(100, 100);

		Graphics2D g = (Graphics2D) thing.getGraphics();
		g.setColor(new Color(255, 100, 0));
		g.drawOval(50, 50, 80, 80);
		g.drawLine(10, 10, 100, 100);

	}

	@Override
	public void paint(Graphics g) {
		// if (image1 != null)
		// g.drawImage(image1, 0, 0, this);
		// if (image2 != null)
		// g.drawImage(image2, 0, 0, this);

		if (thing != null)
			g.drawImage(thing, 0, 0, this);

	}

}
