package Exercicio03;

public class Retangle {

    private Size size;

    public Retangle (int width, int height) {
        this.size = new Size(width, height);
    }

    public void setWidth(int width) {
        this.size = new Size(width, size.getHeight());
    }

    public void setHeight(int height) {
        this.size = new Size(size.getWidth(), height);
    }

    public int area(){
        return size.getWidth() * size.getHeight();
    }

    
}
