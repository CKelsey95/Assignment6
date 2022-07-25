import java.util.Scanner;
public class Colton_Kelsey_Demo {

    public static void main(String[] args){
    Colton_Kelsey_Geometry geometry = new Colton_Kelsey_Geometry();
    Scanner userMenu = new Scanner(System.in);

    System.out.println(" Geometry Calculator ");
    System.out.println("1. Calculate the Area of a Circle ");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit");

    int userSelection = userMenu.nextInt();

    if (userSelection == 1) {
        geometry.RadiusUser();
        geometry.getAreaCircle();
    }

    else if (userSelection == 2){
        geometry.LengthUser();
        geometry.WidthUser();
        geometry.getAreaRectangle();
    }

    else if (userSelection == 3){
        geometry.BaseUser();
        geometry.HeightUser();
        geometry.getAreaTriangle();
    }

    else System.out.println("ERROR PLEASE ENTER A VALID VALUE");






    }
}