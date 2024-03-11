import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToGrayscale {

    public static void main(String[] args) throws Exception {
        String path = "multithreading-resources-main\\07-reducing-latency\\";
        File inputFile = new File(path + "beach.png"); // Input file
        File outputFile = new File(path + "beach_grayscale.png"); // Output file

        try {
            BufferedImage image = ImageIO.read(inputFile);
            long startTime = System.currentTimeMillis();
            convertToGrayscaleConcurrently(image, 4);
            long endTime = System.currentTimeMillis();

            long timeTaken = endTime - startTime;
            System.out.println("Time taken: " + timeTaken + " Milliseconds.");

            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

                                                        // 5000 pixels
    private static void convertToGrayscaleConcurrently(BufferedImage image, int numberOfThreads) throws InterruptedException {   
        int heightPerThread = image.getHeight() / numberOfThreads; // each thread will process 2500 pixels
        GreyScaleConverterThread[] threads = new GreyScaleConverterThread[numberOfThreads];
        for (int i = 0; i < threads.length; i++) {
            int startY = i * heightPerThread; 
            int endY = startY + heightPerThread;
            threads[i] = new GreyScaleConverterThread(image, startY, endY);
            threads[i].start();

            //Thread 0 -> Starts at 0 * 2500 == 0 -- Ends 0 + 2500
            //Thread 1 -> Starts at 1 * 2500 == 2500 -- Ends 2500 + 2500 (5000 pixels)
        }
        for (GreyScaleConverterThread greyScaleConverterThread : threads) {
            greyScaleConverterThread.join();
        }
    }
}