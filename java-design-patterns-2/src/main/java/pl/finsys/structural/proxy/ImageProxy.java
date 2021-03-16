package pl.finsys.structural.proxy;

public class ImageProxy implements Image {
    /**
     * Private Proxy data
     */
    private String imageFilePath;

    /**
     * Reference to RealSubject
     */
    private Image proxifiedImage;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }


    @Override
    public void displayImage() {
        // create the Image Object only when the image is required to be shown

        proxifiedImage = new HighResolutionImage(imageFilePath);

        // now call showImage on realSubject
        proxifiedImage.displayImage();
    }
}
