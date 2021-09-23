package com.csc205.project2;

public class RectangularPrism extends Shape{

    private double width;
    private double height;
    private double length;

    public RectangularPrism() {
        super();
        this.width = 5.0;
        this.height = 1.0;
        this.length = 3.0;
    }

    public RectangularPrism(double w, double h, double l) {
        super();
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return 2 * ((width * length) + (height * length) + (height * width));
    }

    public double volume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangular Prism {");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", length=").append(length);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
