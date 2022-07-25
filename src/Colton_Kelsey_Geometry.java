import java.util.Scanner;
public class Colton_Kelsey_Geometry {
    double circleArea;   // could this be cleaner?
    double circleRadius;
    double rectangleArea;
    double rectLength;
    double rectWidth;
    double triangleArea;
    double triBase;
    double triHeight;


public void getAreaCircle() {
circleArea = Math.PI * Math.pow(circleRadius, 2);
System.out.println("Your Circle's Area is: " + circleArea );  
}

public void getAreaRectangle() {
rectangleArea = rectLength*rectWidth;
System.out.println("Your Rectangle's Area is:" + rectangleArea);
}

public void getAreaTriangle() {
triangleArea = triBase * triHeight * 0.5;
System.out.println("Your Triangle's Area is:" + triangleArea);
}

public void RadiusUser() {
    Scanner circleScan = new Scanner(System.in);
    System.out.println("Please enter your circle's radius: ");
    double circleRadiusUser= circleScan.nextDouble();
    if (circleRadiusUser < 0) System.out.println("ERROR NO NEGATIVE NUMBERS");
    else SetRadiusCircle(circleRadiusUser);
}

public void LengthUser() {
    Scanner lengthScan = new Scanner(System.in);
    System.out.println("Please enter your rectangle's length: ");
    double rectangleLengthUser = lengthScan.nextDouble();
    if (rectangleLengthUser < 0) System.out.println("ERROR NO NEGATIVE NUMBERS");
    else SetRectangleLength(rectangleLengthUser);
}

public void WidthUser() {
    Scanner widthScan = new Scanner(System.in);
    System.out.println("Please enter your rectangle's length: ");
    double rectangleWidthUser = widthScan.nextDouble();
    if (rectangleWidthUser < 0) System.out.println("ERROR NO NEGATIVE NUMBERS");
    else SetRectangleWidth(rectangleWidthUser);
}

public void BaseUser(){
    Scanner baseScan = new Scanner(System.in);
    System.out.println("Please enter your triangle's base: ");
    double triangleBaseUser = baseScan.nextDouble();
    if (triangleBaseUser < 0) System.out.println("ERROR NO NEGATIVE NUMBERS");
    else SetTriangleBase(triangleBaseUser);
}

public void HeightUser(){
    Scanner heightScan = new Scanner(System.in);
    System.out.println("Please enter your triangle's height: ");
    double triangleheightUser = heightScan.nextDouble();
    if (triangleheightUser < 0) System.out.println("ERROR NO NEGATIVE NUMBERS");
    else SetTriangleHeight(triangleheightUser);
}



public void SetRadiusCircle(double r){
    circleRadius = r;
}

public void SetRectangleLength(double l){
    rectLength = l;
}

public void SetRectangleWidth(double w){
    rectWidth = w;
}

public void SetTriangleBase(double b){
    triBase = b;
}

public void SetTriangleHeight(double h){
    triHeight = h;
}    
}
