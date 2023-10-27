import java.util.Scanner;

public class RectangleArea {

    private double length;

    private double width;

    private double area;

    public void getData(){
        Scanner a = new Scanner (System.in);

        System.out.println("ENTER THE LENGTH OF RECTANGLE IN CM");
        length= a.nextDouble();

        System.out.println("ENTER THE WIDTH OF RECTANGLE IN CM");
        width=a.nextDouble();

    }

    public void computeField(){
        area = width * length ;
    }

    public void fileDisplay(){
        System.out.println("ARE OF RECTANGLE ARE EQUAL " + area + "CM");
    }

}
