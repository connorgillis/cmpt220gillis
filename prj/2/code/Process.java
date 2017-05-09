import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by connorgillis on 4/25/17.
 */
public class Process {

    int place = 0;

    public static int determine(int height, int width, int xO, int yO, int clX, int clY) {
        if ((xO + clX) > width && (yO + clY) > height) {
            return 0;
        } else if (xO + clX > width) {
            return 1;
        } else {
            return 2;
        }
    };

    public static void Create(Profile userProfile) {


        BufferedImage workingImage = null;
        File inputFile = null;

        try {
            inputFile = new File(userProfile.inputPath);
            workingImage = ImageIO.read(inputFile);
        } catch (IOException e) {
            System.out.println(e);
        }

        int width = workingImage.getWidth();
        int height = workingImage.getHeight();
        for (int i = 0; i < userProfile.amountGreyscale; i++) {
            int xO = ThreadLocalRandom.current().nextInt(0, width + 1);
            int yO = ThreadLocalRandom.current().nextInt(0, height + 1);
            int lBound = width * userProfile.clusterSizeGreyscale / 10;
            int clX = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            int clY = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            System.out.println("--" + i + "--");
            System.out.println("X Orgin: " + xO);
            System.out.println("Y ORgin: " + yO);
            System.out.println("Cluster Length X : " + clX);
            System.out.println("Cluster Length Y: " + clY);

            try {
                for (int x = xO; x <= clX + xO; x++) {
                    for (int y = yO; y <= clY + yO; y++) {
                        Processes.ProcessGreyscale(workingImage, x, y);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                int caseVal = (determine(height, width, xO, yO, clX, clY));
                if (caseVal == 0) {
                    clX = width - xO - 2;
                    clY = height - yO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessGreyscale(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 1) {
                    clX = width - xO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessGreyscale(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 3) {
                    clY = height - yO - 2;
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessGreyscale(workingImage, x, y);
                        }
                    }
                }


            }
        }

        for (int i = 0; i < userProfile.amountSepia; i++) {
            int xO = ThreadLocalRandom.current().nextInt(0, width + 1);
            int yO = ThreadLocalRandom.current().nextInt(0, height + 1);
            int lBound = width * userProfile.clusterSizeSepia / 10;
            int clX = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            int clY = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            System.out.println("--" + i + "--");
            System.out.println("X Orgin: " + xO);
            System.out.println("Y ORgin: " + yO);
            System.out.println("Cluster Length X : " + clX);
            System.out.println("Cluster Length Y: " + clY);
            //int xTotal  = xO + cl;
            //int yTotal = yO + cl;
            //if (xTotal > height) {

            try {
                for (int x = xO; x <= clX + xO; x++) {
                    for (int y = yO; y <= clY + yO; y++) {
                        Processes.ProcessSepia(workingImage, x, y);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                int caseVal = (determine(height, width, xO, yO, clX, clY));
                if (caseVal == 0) {
                    clX = width - xO - 2;
                    clY = height - yO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessSepia(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 1) {
                    clX = width - xO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessSepia(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 3) {
                    clY = height - yO - 2;
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessSepia(workingImage, x, y);
                        }
                    }
                }


            }
        }

        for (int i = 0; i < userProfile.amountNegative; i++) {
            int xO = ThreadLocalRandom.current().nextInt(0, width + 1);
            int yO = ThreadLocalRandom.current().nextInt(0, height + 1);
            int lBound = width * userProfile.clusterSizeNegative / 10;
            int clX = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            int clY = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            System.out.println("--" + i + "--");
            System.out.println("X Orgin: " + xO);
            System.out.println("Y ORgin: " + yO);
            System.out.println("Cluster Length X : " + clX);
            System.out.println("Cluster Length Y: " + clY);
            //int xTotal  = xO + cl;
            //int yTotal = yO + cl;
            //if (xTotal > height) {

            try {
                for (int x = xO; x <= clX + xO; x++) {
                    for (int y = yO; y <= clY + yO; y++) {
                        Processes.ProcessNegative(workingImage, x, y);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                int caseVal = (determine(height, width, xO, yO, clX, clY));
                if (caseVal == 0) {
                    clX = width - xO - 2;
                    clY = height - yO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessNegative(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 1) {
                    clX = width - xO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessNegative(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 3) {
                    clY = height - yO - 2;
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessNegative(workingImage, x, y);
                        }
                    }
                }


            }
        }

        for (int i = 0; i < userProfile.amountRed; i++) {
            int xO = ThreadLocalRandom.current().nextInt(0, width + 1);
            int yO = ThreadLocalRandom.current().nextInt(0, height + 1);
            int lBound = width * userProfile.clusterSizeRed / 10;
            int clX = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            int clY = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            System.out.println("--" + i + "--");
            System.out.println("X Orgin: " + xO);
            System.out.println("Y ORgin: " + yO);
            System.out.println("Cluster Length X : " + clX);
            System.out.println("Cluster Length Y: " + clY);


            try {
                for (int x = xO; x <= clX + xO; x++) {
                    for (int y = yO; y <= clY + yO; y++) {
                        Processes.ProcessRed(workingImage, x, y);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                int caseVal = (determine(height, width, xO, yO, clX, clY));
                if (caseVal == 0) {
                    clX = width - xO - 2;
                    clY = height - yO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessRed(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 1) {
                    clX = width - xO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessRed(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 3) {
                    clY = height - yO - 2;
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessRed(workingImage, x, y);
                        }
                    }
                }


            }
        }

        for (int i = 0; i < userProfile.amountGreen; i++) {
            int xO = ThreadLocalRandom.current().nextInt(0, width + 1);
            int yO = ThreadLocalRandom.current().nextInt(0, height + 1);
            int lBound = width * userProfile.clusterSizeGreen / 10;
            int clX = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            int clY = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            System.out.println("--" + i + "--");
            System.out.println("X Orgin: " + xO);
            System.out.println("Y ORgin: " + yO);
            System.out.println("Cluster Length X : " + clX);
            System.out.println("Cluster Length Y: " + clY);


            try {
                for (int x = xO; x <= clX + xO; x++) {
                    for (int y = yO; y <= clY + yO; y++) {
                        Processes.ProcessGreen(workingImage, x, y);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                int caseVal = (determine(height, width, xO, yO, clX, clY));
                if (caseVal == 0) {
                    clX = width - xO - 2;
                    clY = height - yO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessGreen(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 1) {
                    clX = width - xO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessGreen(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 3) {
                    clY = height - yO - 2;
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessGreen(workingImage, x, y);
                        }
                    }
                }


            }
        }

        for (int i = 0; i < userProfile.amountBlue; i++) {
            int xO = ThreadLocalRandom.current().nextInt(0, width + 1);
            int yO = ThreadLocalRandom.current().nextInt(0, height + 1);
            int lBound = width * userProfile.clusterSizeBlue / 10;
            int clX = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            int clY = ThreadLocalRandom.current().nextInt(lBound - 100, lBound);
            System.out.println("--" + i + "--");
            System.out.println("X Orgin: " + xO);
            System.out.println("Y ORgin: " + yO);
            System.out.println("Cluster Length X : " + clX);
            System.out.println("Cluster Length Y: " + clY);

            try {
                for (int x = xO; x <= clX + xO; x++) {
                    for (int y = yO; y <= clY + yO; y++) {
                        Processes.ProcessBlue(workingImage, x, y);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                int caseVal = (determine(height, width, xO, yO, clX, clY));
                if (caseVal == 0) {
                    clX = width - xO - 2;
                    clY = height - yO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessBlue(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 1) {
                    clX = width - xO - 2;
                    System.out.println("There was an x error new clust x is " + clX);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessBlue(workingImage, x, y);
                        }
                    }
                }
                if (caseVal == 3) {
                    clY = height - yO - 2;
                    System.out.println("There was an y error new clust y is " + clY);
                    for (int x = xO; x <= clX + xO; x++) {
                        for (int y = yO; y <= clY + yO; y++) {
                            Processes.ProcessBlue(workingImage, x, y);
                        }
                    }
                }


            }
        }

        try {
            inputFile = new File(userProfile.outputPath);
            ImageIO.write(workingImage, "jpg", inputFile);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
