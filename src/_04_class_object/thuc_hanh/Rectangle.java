package _04_class_object.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public Rectangle() {
    }
    public Rectangle(double width,double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double  getPerimeter() {
        return (this.width+this.height)*2;
    }
    public String display() {
        return "Rectangle{"+width+","+height+"}";
    }

}

class Chay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}