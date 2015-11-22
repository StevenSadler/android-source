package com.bloc.threads;

import java.net.URL;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

public class ImageGetter extends Thread {

	private String mURL;
	private boolean mOpenWhenCompleted;

	/*
	 * ImageGetter
	 *
	 * Initialize the ImageGetter class.
	 *
	 * @param url The URL of the image this ImageGetter should
	 *		  download (String)
	 * @param openWhenCompleted if `true`, the image will be opened
	 *		  as soon it is downloaded, `false` otherwise
	 */
	public ImageGetter(String url, boolean openWhenCompleted) {
		mURL = url;
		mOpenWhenCompleted = openWhenCompleted;

		File existingImage = new File("google_logo.png");
		if (existingImage.exists()) {
			existingImage.delete();
		}
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Implement this constructor for ImageGetter.
 	 *	The variables passed into it must impact the `run()` method's
 	 *	behavior as described above.
	/************************************************/

	@Override
	public void run() {
		try {
			URL url = new URL(mURL);
			BufferedImage bufferedImage = ImageIO.read(url);
			File outputfile = new File("google_logo.png");
			ImageIO.write(bufferedImage, "png", outputfile);
			if (mOpenWhenCompleted) {
				if ("/".equals(System.getProperties().getProperty("file.separator"))) {
					Runtime.getRuntime().exec("open google_logo.png");
				} else {
					String command = "rundll32 url.dll,FileProtocolHandler \""+ outputfile.getAbsolutePath() +"\"";
					Runtime.getRuntime().exec(command);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Perform the work found in `Main.java` in this
 		 *	Thread instead.
		/************************************************/
	}
}