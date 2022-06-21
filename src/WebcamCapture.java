import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;


public class WebcamCapture {
	public static void main(String[] args) throws IOException{
		Webcam webcam = Webcam.getDefault();
		webcam.open();
		ImageIO.write(webcam.getImage(), "JPG", new File("E:\\ujjwalcreate.png"));
		webcam.close();
	}
}
