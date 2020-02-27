


/* Submit this file for Project Part 1 */
public class Milestone2 {
	

    public static void main (String[] args) {

	// Instantiate a Picture object from file mypic.jpg
	Picture p = new Picture("/Users/gazalarora/Downloads/cat.png");

	// The object referenced by p will be manipulated by your methods.

	// Example on how to call the countRedPixels method
	int redPixels = countRedPixels(p);
	System.out.println("The number of red pixels is: " + redPixels);
	
	switchRedBlue(p);
	//flipHorizontal(p);
	//flipVertical(p);
	//flipDiagonal(p);
	p.show();
	
    }
    
    /*
     * 1) Returns the number of red pixels in picture v
     */
    public static int countRedPixels(Picture v) {
	// WRITE YOUR CODE HERE
    	
    	int H = v.getHeight();
    	int W = v.getWidth();
    	int count = 0;
    	
    	
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W; j++) {
    			
   	if ((v.getPixel(j, i)).getRed() == 255 && (v.getPixel(j, i)).getBlue() == 0 && (v.getPixel(j, i)).getGreen() == 0) {
    			count++;	
    			}
    		}
    	}
    	return  count;
    }
	
    /*
     * 2) Change all the red pixels in an image to blue pixels and vice versa 
     *    Only pure red and pure blue
     */
    public static void switchRedBlue(Picture v) {
	// WRITE YOUR CODE HERE
    	int H = v.getHeight();
    	int W = v.getWidth();
    	
    	
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W; j++) {
    			
    			if ((v.getPixel(j, i)).getRed() == 0 && (v.getPixel(j, i)).getBlue() == 255 && (v.getPixel(j, i)).getGreen() == 0) {
    				(v.getPixel(j, i)).setRed(255);
    				(v.getPixel(j, i)).setBlue(0);
    			
    			}
    			
    			else if ((v.getPixel(j, i)).getRed() == 255 && (v.getPixel(j, i)).getBlue() == 0 && (v.getPixel(j, i)).getGreen() == 0) {
    				(v.getPixel(j, i)).setRed(0);
    				(v.getPixel(j, i)).setBlue(255);
    			
    			}
    			
    			}
    		}
    	
    	
    	
    }

    /*
     * 3. Take the left half of an image and reflect it over an imaginary 
     *    vertical line going across the middle of the image.
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipHorizontal(Picture v) {
	// WRITE YOUR CODE HERE
    	
    	int H = v.getHeight();
    	int W = v.getWidth();
    	
    	
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W/2; j++) {
    			
    				Pixel one = v.getPixel(j, i);
    				Pixel two = v.getPixel(W-j-1, i);
    				two.setColor(one.getColor());
    				
    			}
    			
    		}
    	}
    	
    
	 
    /*
     * 4. Take the top half of an image and reflect it over an imaginary horizontal 
     *    line going through the image 
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipVertical(Picture v) {
	// WRITE YOUR CODE HERE
    	
    	int H = v.getHeight();
    	int W = v.getWidth();
    	
    	
    	
    	for (int i = 0; i < H/2; i++) {
    		for (int j = 0; j < W; j++) {
    			
    				Pixel one = v.getPixel(j, i);
    				Pixel two = v.getPixel(j, H-i-1);
    				two.setColor(one.getColor());
    				
    			}
    			
    		}
    	
    }

    /*
     * 5. Take the upper half of an image and reflect it over an imaginary diagonal 
     *    line going from the upper left corner of the image to the lower right corner. 
     *    Upper right to lower left diagonal line
     *    You may assume SQUARE images (height == width)
     *    IF pixels exist ON the midline, leave them there without reflecting
     *    
     *   
     */
    public static void flipDiagonal(Picture v) {
	// WRITE YOUR CODE HERE
    	int H = v.getHeight();
    	int W = v.getWidth();
    	//Assuming square so H=W
    	for (int y = 0; y < H; y++) {
    		for (int x = 0; x < H-(y); x++) {
    	
    				Pixel one = v.getPixel(x, y);
    				Pixel two = v.getPixel(H-x-1, H-y-1);
    				two.setColor(one.getColor());
    			
    		}
    	}
    }
}
