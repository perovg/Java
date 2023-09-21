public final class Point {
    private double x;
    private double y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double[] getCoordinates(){
        double[] arr = {x, y};
        return arr;
    }
    public void translate(double x, double y){
        this.x += x;
        this.y += y;
    }
    public void scale(double x){
        this.x *= x;
        this.y *= x;
    }
}
