public class Profile {
    public String inputPath = null;
    public int amountGreyscale = 0;
    public int clusterSizeGreyscale = 0;
    public int amountSepia = 0;
    public int clusterSizeSepia = 0;
    public int amountNegative = 0;
    public int clusterSizeNegative = 0;
    public int additiveCorrupt = 0;
    public int subtractiveCorrupt = 0;
    public int amountRed = 0;
    public int clusterSizeRed = 0;
    public int amountGreen = 0;
    public int clusterSizeGreen = 0;
    public int amountBlue = 0;
    public int clusterSizeBlue = 0;
    public String outputPath = null;

    public Profile() {

    }

    public Profile(String inputPath, int amountGreyscale, int clusterSizeGreyscale, int amountSepia,
                   int clusterSizeSepia, int amountNegative, int clusterSizeNegative,
                   int additiveCorrupt, int subtractiveCorrupt, String outputPath) {

        this.inputPath = inputPath;
        this.amountGreyscale = amountGreyscale;
        this.clusterSizeGreyscale = clusterSizeGreyscale;
        this.amountSepia = amountSepia;
        this.clusterSizeSepia = clusterSizeGreyscale;
        this.amountNegative = amountNegative;
        this.clusterSizeNegative = clusterSizeNegative;
        this.additiveCorrupt = additiveCorrupt;
        this.subtractiveCorrupt = subtractiveCorrupt;
        this.outputPath = outputPath;

    }

}
