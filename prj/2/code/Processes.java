import java.awt.image.BufferedImage;

public class Processes {
    public static void ProcessNegative(BufferedImage workingImage, int x, int y) {

        int p = workingImage.getRGB(x, y);
        int a = (p >> 24) & 0xff;
        int r = (p >> 16) & 0xff;
        int g = (p >> 8) & 0xff;
        int b = p & 0xff;
        //subtract RGB from 255
        r = 255 - r;
        g = 255 - g;
        b = 255 - b;
        //set new RGB value
        p = (a << 24) | (r << 16) | (g << 8) | b;
        workingImage.setRGB(x, y, p);
    }

    public static void ProcessGreyscale(BufferedImage workingImage, int x, int y) {
        int p = workingImage.getRGB(x, y);
        int a = (p >> 24) & 0xff;
        int r = (p >> 16) & 0xff;
        int g = (p >> 8) & 0xff;
        int b = p & 0xff;
        int avg = (r + g + b) / 3;
        p = (a << 24) | (avg << 16) | (avg << 8) | avg;
        workingImage.setRGB(x, y, p);
    }

    public static void ProcessSepia(BufferedImage workingImage, int x, int y) {
        int p = workingImage.getRGB(x, y);

        int a = (p >> 24) & 0xff;
        int r = (p >> 16) & 0xff;
        int g = (p >> 8) & 0xff;
        int b = p & 0xff;

        //calculate tr, tg, tb
        int tr = (int) (0.393 * r + 0.769 * g + 0.189 * b);
        int tg = (int) (0.349 * r + 0.686 * g + 0.168 * b);
        int tb = (int) (0.272 * r + 0.534 * g + 0.131 * b);

        //check condition
        if (tr > 255) {
            r = 255;
        } else {
            r = tr;
        }

        if (tg > 255) {
            g = 255;
        } else {
            g = tg;
        }

        if (tb > 255) {
            b = 255;
        } else {
            b = tb;
        }

        //set new RGB value
        p = (a << 24) | (r << 16) | (g << 8) | b;

        workingImage.setRGB(x, y, p);
    }

    public static void ProcessRed(BufferedImage workingImage, int x, int y) {
        int p = workingImage.getRGB(x, y);


        int a = (p>>24)&0xff;
        int r = (p>>16)&0xff;

        //set new RGB
        p = (a << 24) | (r << 16) | 0;

        workingImage.setRGB(x, y, p);
    }

    public static void ProcessGreen(BufferedImage workingImage, int x, int y) {
        int p = workingImage.getRGB(x, y);


        int a = (p>>24)&0xff;
        int g = (p>>8)&0xff;

        //set new RGB
        p = (a << 24) | (g << 8) | 0;

        workingImage.setRGB(x, y, p);
    }

    public static void ProcessBlue(BufferedImage workingImage, int x, int y) {
        int p = workingImage.getRGB(x, y);


        int a = (p>>24)&0xff;
        int b = p & 0xff;

        //set new RGB
        p = (a << 24) | b;

        workingImage.setRGB(x, y, p);
    }
}
