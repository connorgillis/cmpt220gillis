import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Final {
    private JButton selectSourceButton;
    private JButton selectDestButton;
    private JSlider amountGreyscaleSlider;
    private JButton runButton;
    private JProgressBar progressBar;
    private JSlider amountSepiaSlider;
    private JSlider amountNegativeSlider;
    private JSlider sizeNegativeSlider;
    private JSlider sizeSepiaSlider;
    private JSlider sizeGreyscaleSlider;
    private JPanel panel;
    private JLabel statusLabel;
    private JSlider amountRedSlider;
    private JSlider amountGreenSlider;
    private JSlider amountBlueSlider;
    private JSlider sizeRedSlider;
    private JSlider sizeGreenSlider;
    private JSlider sizeBlueSlider;

    Profile userProfile = new Profile();


    String fileSourceStr;
    String fileDestStr;

    public Final() {


        selectSourceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(1);
                final JFileChooser sourceFileChooser = new JFileChooser();
                if (e.getSource() == selectSourceButton) {
                    int returnVal = sourceFileChooser.showOpenDialog(panel);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        File fileSource = sourceFileChooser.getSelectedFile();
                        System.out.print(fileSource.getPath());
                        userProfile.inputPath = fileSource.getPath();
                        progressBar.setValue(1);
                        statusLabel.setText("Source File Selected");
                    } else {
                        System.out.print("SourceFileChooser: user cancelled");
                    }
                }

            }

        });
        selectDestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser destFileChooser = new JFileChooser();
                destFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                if (e.getSource() == selectDestButton) {
                    int returnVal = destFileChooser.showOpenDialog(panel);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        File fileDest = destFileChooser.getSelectedFile();
                        userProfile.outputPath = fileDest.getPath() + "/output.jpg";
                        progressBar.setValue(2);
                        statusLabel.setText("Destination Directory Selected");
                    } else {
                        System.out.print("DestFileChooser: user cancelled");
                    }
                }

            }
        });

        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(3);
                statusLabel.setText("Loading Profile Preferences");
                userProfile.amountGreyscale = amountGreyscaleSlider.getValue();
                userProfile.clusterSizeGreyscale = sizeGreyscaleSlider.getValue();
                userProfile.amountSepia = amountSepiaSlider.getValue();
                userProfile.clusterSizeSepia = sizeSepiaSlider.getValue();
                userProfile.amountNegative = amountNegativeSlider.getValue();
                userProfile.clusterSizeNegative = sizeNegativeSlider.getValue();
                userProfile.amountRed = amountRedSlider.getValue();
                userProfile.clusterSizeRed = sizeRedSlider.getValue();
                userProfile.amountGreen = amountGreenSlider.getValue();
                userProfile.clusterSizeGreen = sizeGreenSlider.getValue();
                userProfile.amountBlue = amountBlueSlider.getValue();
                userProfile.clusterSizeBlue = sizeBlueSlider.getValue();
                progressBar.setValue(4);
                statusLabel.setText("Running Manipulation Processes");
                runButton.setText("Running");
                runButton.setEnabled(false);
                Process.Create(userProfile);
                runButton.setEnabled(true);
                runButton.setText("Run");
                progressBar.setValue(5);
                statusLabel.setText("Image Created in Destination Directory");

            }
        });



    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Final");
        frame.setContentPane(new Final().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }




}


