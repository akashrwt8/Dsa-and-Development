package JAVA_DSA.JAVA_BASIC;
import java.util.Scanner;
public class area_circle {
    public static void main(String args[]){
        float radius;
        System.out.println("Enter radius of circle :");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle is " + area);
        sc.close();
    }
}
