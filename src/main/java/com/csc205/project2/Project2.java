package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {

        ThreeDimensionalShape cube = new Cube();
        ThreeDimensionalShape cylinder = new Cylinder();
        ThreeDimensionalShape rectangularprism = new RectangularPrism();
        ThreeDimensionalShape sphere = new Sphere();

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(rectangularprism);
        shapes.add(sphere);

        shapes.forEach(System.out::println);

    }

}

