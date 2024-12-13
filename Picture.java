
import javax.swing.Timer;

/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: Ryu
 * @version: (Date)
 * 
 */
public class Picture
{
    // Private member (instance) variables
    private Canvas pic;
    private Circle bSBall;
    private Circle mSBall;
    private Circle head;
    private Circle nose;
    private Circle lEye;
    private Circle rEye;
    private Circle m1;
    private Circle m2;
    private Circle m3;
    private Circle m4;
    private Circle m5;
    private Circle d1;
    private Circle d2;
    private Circle d3;
    private Circle d4;
    private Circle d5;
    private Rect bHat;
    private Rect tHat;
    private Rect rStripe;
    private Rect lArm;
    private Rect rArm;
    private Rect ground;
    private Circle[] snow1;
    private Circle[] snow2;
    private Circle[] snow3;
    private Circle[] snow4;
    private Circle[] snow5;
    private Circle[] snow6;
    private Circle[] snow7;
    private Circle[] snow8;
    private Circle[] snow9;
    private Circle[] snow10;
    private int resetSnow1 = (int)(Math.random()*50);
    private int resetSnow2 = (int)(Math.random()*50);
    private int resetSnow3 = (int)(Math.random()*50);
    private int resetSnow4 = (int)(Math.random()*50);
    private int resetSnow5 = (int)(Math.random()*50);
    private int resetSnow6 = (int)(Math.random()*50);
    private int resetSnow7 = (int)(Math.random()*50);
    private int resetSnow8 = (int)(Math.random()*50);
    private int resetSnow9 = (int)(Math.random()*50);
    private int resetSnow10 = (int)(Math.random()*50);
    private int dr = 1;
    
    public Picture()
    {
        // Get a reference to the canvas for this drawing and set its title.
        pic = Canvas.getCanvas();
        pic.setTitle("Winter Scene");
        pic.setBackgroundColor("#90D5FF");
        
        // Turn off automatic redrawing
        pic.pause(true);
        
        bSBall = new Circle(325, 425, 150, "white", true);
        mSBall = new Circle(350, 350, 100, "white", true);
        head = new Circle(362, 290, 75, "white", true);
        nose = new Circle(395, 325, 10, "#FFA500", true);
        lEye = new Circle(380, 315, 10, "black", true);
        rEye = new Circle(410, 315, 10, "black", true);
        m1 = new Circle(381, 339, 6, "black", true);
        m2 = new Circle(389, 342, 6, "black", true);
        m3 = new Circle(397, 345, 6, "black", true);
        m4 = new Circle(405, 342, 6, "black", true);
        m5 = new Circle(413, 339, 6, "black", true);
        d1 = new Circle(395, 380, 10, "black", true);
        d2 = new Circle(395, 410, 10, "black", true);
        d3 = new Circle(395, 455, 10, "black", true);
        d4 = new Circle(395, 485, 10, "black", true);
        d5 = new Circle(395, 515, 10, "black", true);
        bHat = new Rect(357, 290, 86, 10, "black", true);
        tHat = new Rect(367, 240, 66, 50, "black", true);
        rStripe = new Rect(367, 280, 66, 10, "red", true);
        lArm = new Rect(370, 380, 100, 10, "brown", true);
        lArm.setRotation(180);
        rArm = new Rect(440, 380, 100, 10, "brown", true);
        rArm.setRotation(45);
        ground = new Rect(0, 550, 800, 50, "white", true);
        snow1 = new Circle[10];
        snow2 = new Circle[10];
        snow3 = new Circle[10];
        snow4 = new Circle[10];
        snow5 = new Circle[10];
        snow6 = new Circle[10];
        snow7 = new Circle[10];
        snow8 = new Circle[10];
        snow9 = new Circle[10];
        snow10 = new Circle[10];
        initializeSnow(snow1);
        initializeSnow(snow2);
        initializeSnow(snow3);
        initializeSnow(snow4);
        initializeSnow(snow5);
        initializeSnow(snow6);
        initializeSnow(snow7);
        initializeSnow(snow8);
        initializeSnow(snow9);
        initializeSnow(snow10);
        
        // Show the initial picture
        pic.redraw();
    }
    
    /**
     * Update the screen to create a new frame for the animation
     */
    public void update() 
    {
        int rLA = lArm.getRotation();
        //Move left arm
        rLA += dr;
        if(rLA > 240){
            dr = -dr;
        }
        else if(rLA < 150){
            dr = -dr;
        }
        lArm.setRotation(rLA);
        //Make snow continuously fall
        resetSnow(snow1, resetSnow1);
        if(resetSnow1 < 50){
            resetSnow1++;
        }
        else{
            resetSnow1 = 0;
        }
        resetSnow(snow2, resetSnow2);
        if(resetSnow2 < 50){
            resetSnow2++;
        }
        else{
            resetSnow2 = 0;
        }
        resetSnow(snow3, resetSnow3);
        if(resetSnow3 < 50){
            resetSnow3++;
        }
        else{
            resetSnow3 = 0;
        }
        resetSnow(snow4, resetSnow4);
        if(resetSnow4 < 50){
            resetSnow4++;
        }
        else{
            resetSnow4 = 0;
        }
        resetSnow(snow5, resetSnow5);
        if(resetSnow5 < 50){
            resetSnow5++;
        }
        else{
            resetSnow5 = 0;
        }
        resetSnow(snow6, resetSnow6);
        if(resetSnow6 < 50){
            resetSnow6++;
        }
        else{
            resetSnow6 = 0;
        }
        resetSnow(snow7, resetSnow7);
        if(resetSnow7 < 50){
            resetSnow7++;
        }
        else{
            resetSnow7 = 0;
        }
        resetSnow(snow8, resetSnow8);
        if(resetSnow8 < 50){
            resetSnow8++;
        }
        else{
            resetSnow8 = 0;
        }
        resetSnow(snow9, resetSnow9);
        if(resetSnow9 < 50){
            resetSnow9++;
        }
        else{
            resetSnow9 = 0;
        }
        resetSnow(snow10, resetSnow10);
        if(resetSnow10 < 50){
            resetSnow10++;
        }
        else{
            resetSnow10 = 0;
        }
        // Update the screen
        pic.redraw();
    }
    public static void initializeSnow(Circle[] snowGroup){
        for (int i = 0; i < snowGroup.length; i++) {
            snowGroup[i] = new Circle((int)(Math.random()*800), (int)(Math.random()*600), 3, "white", true);
        }
        
    }
    public static void resetSnow(Circle[] snowGroup, int reset){
        if(reset >= 50){
            for(int i = 0; i < snowGroup.length; i++){
                snowGroup[i].setY((int)(Math.random()*600));
            }
        }
        for(int i = 0; i < snowGroup.length; i++){
            snowGroup[i].setY(snowGroup[i].getY() + 1);
        }
    }
    /**
     * This main method prepares and regularly updates a picture.
     */
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        
        // update the screen every 33ms (30 times / second)
        new Timer(33, e->pic.update()).start();        
    }
   
}