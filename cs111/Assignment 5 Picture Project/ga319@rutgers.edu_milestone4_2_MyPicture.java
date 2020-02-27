
public class MyPicture {

    /*
     * Fields or instance variables
     */
    private Picture picture; // basis that provides the extension of class Picture
    private String filename; // the name of the image file
    private int width;       // the image width
    private int length;      // the image length
    private String description; // the image description
//	private PictureFrame pictureFrame;

    /* 
     * Constructor. 
     * Takes as a parameter the name of the file to load and a description of the picture.
     * The width and height of an image are available in the Picture class.
     */
    public MyPicture(String filename, String description) {
	// WRITE YOUR CODE HERE
    	picture = new Picture (filename);
    	this.filename  = filename;
    	this.description = description;
    	
    	width = picture.getWidth();
    	length = picture.getHeight();
    	
    	
    }

    /*
     * Returns the string representation for a MyPicture object.
     * The string's format should match the following EXACTLY:
     *       <imagename>.<extension> <width> x <length> <description>
     * Replace <xxx> with the respective data about this image
     */
    public String toString() {
	// WRITE YOUR CODE HERE
    	int k = 0;
    	for(int i = 0; i < filename.length(); i++) {
    		if(filename.charAt(i) == '/') {
    			k = i;
    		}
    	}
    	String res = filename.substring(k+1)+ " " + Integer.toString(width) + " x " + Integer.toString(length) + " " + description;
    	return res;
    	
    }

    /* 
     * Returns true if the parameter MyPicture object is equal 
     * to the current instance, false otherwise. MyPicture objects 
     * are considered equal if and only if their filenames are the 
     * same AND their descriptions are the same.
     */
    public boolean equals(MyPicture p) {
	// WRITE YOUR CODE HERE
    	//&& (p.description).equals(description)
    	
    	if((p.filename).equals(this.filename) && (p.description).equals(this.description))  {
    		return true;
    	}
    	return false;
    	
    }

    /* 
     * Returns a new Picture object representing the 'negative'
     * image of this MyPicture object. The negative of a pixel
     * is defined by taking each pixel's red, blue, and green value and
     * subtracting that value from 255.
     */
    public Picture negative () {
	// WRITE YOUR CODE HERE
    	Picture pic = new Picture(width,length);
    	
    	int r, g, b;
    	for (int y = 0; y < length; y++) {
    		for (int x = 0; x < width; x++) {
    			r = 255 - picture.getPixel(x,y).getRed();
    			g = 255 - picture.getPixel(x,y).getGreen();
    			b = 255 - picture.getPixel(x,y).getBlue();
    			
    			pic.getPixel(x,y).setRed(r);
    			pic.getPixel(x,y).setGreen(g);
    			pic.getPixel(x,y).setBlue(b);    
    			
    		}
    	}
    	
    	return pic;
    }

    /*
     * Returns the redness score of this image. 
     * The redness score is defined by the total number of pixels that have
     * a red value that is greater than both the blue and green
     * pixels divided by the total number of pixels
     */
    public double redness() {
	// WRITE YOUR CODE HERE
    	
    	int totalpixels = 0;
    	int r, g, b;
    	double t = (width*length);
    	for (int y = 0; y < length; y++) {
    		for (int x = 0; x < width; x++) {
    			r = picture.getPixel(x,y).getRed();
    			g = picture.getPixel(x,y).getGreen();
    			b = picture.getPixel(x,y).getBlue();
    			if(r > g && r > b){
    				totalpixels++;
    			}
    		}
    	}
    	return (double)(totalpixels)/t;
    	
    }

    /* 
     * Convert flipHorizontal from Part 1 to an instance method
     */
    public void flipHorizontal () {
	// WRITE YOUR CODE HERE
    	
    	
    	int H = length;
    	int W = width;
    	
    	
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W/2; j++) {
    			
    				Pixel one = picture.getPixel(j, i);
    				Pixel two = picture.getPixel(W-j-1, i);
    				two.setColor(one.getColor());
    				
    			}
    			
    		}
    }

    /* 
     * Convert flipVertical from Part 1 to an instance method
     */
    public void flipVertical () {
	// WRITE YOUR CODE HERE
    	
    	int H = length;
    	int W = width;
    	
    	
    	for (int i = 0; i < H/2; i++) {
    		for (int j = 0; j < W; j++) {
    			
    				Pixel one = picture.getPixel(j, i);
    				Pixel two = picture.getPixel(j, H-i-1);
    				two.setColor(one.getColor());
    				
    			}
    			
    		}
    }
    
    
  /*  public void show()
    {
       // if there is a current picture frame then use it 
      if (pictureFrame != null)
        pictureFrame.updateImageAndShowIt();
      
      // else create a new picture frame with this picture 
      else
        pictureFrame = new PictureFrame(picture);
    }
    */
    
}
