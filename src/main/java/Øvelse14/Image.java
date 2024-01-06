package Øvelse14;

public class Image {
    private String filename;
    private int width;
    private int height;

    public Image(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType(){
        return filename.endsWith(".gif") || filename.endsWith(".jpg") || filename.endsWith(".jpeg") || filename.endsWith(".png") || filename.endsWith(".webp") || filename.endsWith(".bmp");
    }
    public boolean isPortarit(){
        return height>width;
    }
    public boolean isLandScape(){
       return width>height;
    }
}
