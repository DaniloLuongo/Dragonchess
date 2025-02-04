package dev.dany.dragonchess.utils;

import dev.dany.dragonchess.Main;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dany
 */
public class IconUtils
{
    public static ImageIcon overlayImages(String path1, String path2)
    {
        BufferedImage bgImage = null, fgImage = null;
        try {
            bgImage = ImageIO.read(Main.class.getResource(path1));
            fgImage = ImageIO.read(Main.class.getResource(path2));
        } catch (Exception ex) {
            System.err.println(path2 + " not found!");
        }
        if (fgImage.getHeight() > bgImage.getHeight() || fgImage.getWidth() > fgImage.getWidth()) {
            JOptionPane.showMessageDialog(null,
                    "Foreground Image Is Bigger In One or Both Dimensions"
                            + "nCannot proceed with overlay."
                            + "nn Please use smaller Image for foreground");
            return null;
        }
 
        /**Create a Graphics  from the background image**/
        Graphics2D g = bgImage.createGraphics();
        /**Set Anti-alias Rendering**/
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        /**
         * Draw background image at location (0,0)
         * You can change the (x,y) value as required
         */
        g.drawImage(bgImage, 0, 0, null);
 
        /**
         * Draw foreground image at location (0,0)
         * Change (x,y) value as required.
         */
        g.drawImage(fgImage, 0, 0, null);
 
        g.dispose();
        return new ImageIcon(bgImage);
    }
    
    public static ImageIcon overlayImages(BufferedImage bgImage, String path2)
    {
        BufferedImage fgImage = null;
        try {
            fgImage = ImageIO.read(Main.class.getResource(path2));
        } catch (Exception ex) {
            System.err.println(path2 + " not found!");
        }
        if (fgImage.getHeight() > bgImage.getHeight() || fgImage.getWidth() > fgImage.getWidth()) {
            JOptionPane.showMessageDialog(null,
                    "Foreground Image Is Bigger In One or Both Dimensions"
                            + "nCannot proceed with overlay."
                            + "nn Please use smaller Image for foreground");
            return null;
        }
 
        /**Create a Graphics  from the background image**/
        Graphics2D g = bgImage.createGraphics();
        /**Set Anti-alias Rendering**/
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        /**
         * Draw background image at location (0,0)
         * You can change the (x,y) value as required
         */
        g.drawImage(bgImage, 0, 0, null);
 
        /**
         * Draw foreground image at location (0,0)
         * Change (x,y) value as required.
         */
        g.drawImage(fgImage, 0, 0, null);
 
        g.dispose();
        return new ImageIcon(bgImage);
    }
    
    public static ImageIcon overlayImages(String path1, BufferedImage fgImage)
    {
        BufferedImage bgImage = null;
        try {
            bgImage = ImageIO.read(Main.class.getResource(path1));
        } catch (Exception ex) {
            System.err.println(path1 + " not found!");
        }
        if (fgImage.getHeight() > bgImage.getHeight() || fgImage.getWidth() > fgImage.getWidth()) {
            JOptionPane.showMessageDialog(null,
                    "Foreground Image Is Bigger In One or Both Dimensions"
                            + "nCannot proceed with overlay."
                            + "nn Please use smaller Image for foreground");
            return null;
        }
 
        /**Create a Graphics  from the background image**/
        Graphics2D g = bgImage.createGraphics();
        /**Set Anti-alias Rendering**/
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        /**
         * Draw background image at location (0,0)
         * You can change the (x,y) value as required
         */
        g.drawImage(bgImage, 0, 0, null);
 
        /**
         * Draw foreground image at location (0,0)
         * Change (x,y) value as required.
         */
        g.drawImage(fgImage, 0, 0, null);
 
        g.dispose();
        return new ImageIcon(bgImage);
    }
    
    public static ImageIcon overlayImages(BufferedImage bgImage, BufferedImage fgImage)
    {
        if (fgImage.getHeight() > bgImage.getHeight() || fgImage.getWidth() > fgImage.getWidth()) {
            JOptionPane.showMessageDialog(null,
                    "Foreground Image Is Bigger In One or Both Dimensions"
                            + "nCannot proceed with overlay."
                            + "nn Please use smaller Image for foreground");
            return null;
        }
 
        /**Create a Graphics  from the background image**/
        Graphics2D g = bgImage.createGraphics();
        /**Set Anti-alias Rendering**/
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        /**
         * Draw background image at location (0,0)
         * You can change the (x,y) value as required
         */
        g.drawImage(bgImage, 0, 0, null);
 
        /**
         * Draw foreground image at location (0,0)
         * Change (x,y) value as required.
         */
        g.drawImage(fgImage, 0, 0, null);
 
        g.dispose();
        return new ImageIcon(bgImage);
    }
    
    public static ImageIcon getImageIcon(String path)
    {
        return new ImageIcon(Main.class.getResource(path));
    }
    
    public static BufferedImage iconToBufferedImage(Icon icon)
    {
        BufferedImage bi = new BufferedImage(
            icon.getIconWidth(),
            icon.getIconHeight(),
            BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        // paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0,0);
        g.dispose();
        
        return bi;
    }
}
