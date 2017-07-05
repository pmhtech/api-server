package net.pmhtech.mon.service.impl;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import net.pmhtech.mon.service.ImageService;

@Service("imageService")
public class ImageServiceImpl implements ImageService {
    
	
	private String imgDir;
	@Override
	public void imageDownload(String owner, String imgPath) throws Exception {

		Image image = null;
        try {
            URL url = new URL(imgPath);
            BufferedImage img = ImageIO.read(url);
            File file=new File(imgDir);
            ImageIO.write(img, "gif", file);
        } catch (IOException e) {
         e.printStackTrace();
        }
		
	}	
}
