public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "color: " + color + " and filled: " + filled;
    }

    // This method can be implemented in subclasses that have an area calculation
    public double getArea() {
        throw new UnsupportedOperationException("getArea() is not supported for all GeometricObjects");
    }
}