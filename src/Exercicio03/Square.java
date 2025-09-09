package Exercicio03;

public class Square {

    private Size size;

    public Square (int side) {
        this.size = new Size(side, side);
    }

    public void setSide(int side) {
        this.size = new Size(side, side);
    }
    public int area(){
        return size.getWidth() * size.getHeight();
    }
    
}
