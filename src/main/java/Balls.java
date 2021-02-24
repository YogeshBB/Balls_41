import processing.core.PApplet;
public class Balls extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static void main(String[] args){
        PApplet.main("Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle();
    }
    int x=0,y=0,w=0,z=0;
    private void drawCircle() {
        int height=HEIGHT/5;
        ellipse(x, height, 10, 10);
        x++;
        ellipse(y, height*2, 10, 10);
        y+=2;
        ellipse(w, height*3, 10, 10);
        w+=3;
        ellipse(z, height*4, 10, 10);
        z+=4;
    }
}
