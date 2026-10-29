PA4:
package oop;
import java.util.Scanner;
abstract class Shape {
protected double dim1, dim2;
Shape(double a, double b) {
dim1 = a;
dim2 = b;
}
void setValues(double a, double b) {
dim1 = a;
dim2 = b;
}
// Abstract method -> Shape cannot be instantiated
abstract double computeArea();
}
}
class Rectangle extends Shape {
Rectangle(double l, double w) {
super(l, w);
}
double computeArea() {
return dim1 * dim2; // length * width
}
}
public class ShapeDemo {
Scanner sc = new Scanner(System.in);
static int choice;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
do {
System.out.println("Shape Area Calculator");
System.out.println("1. Triangle");
System.out.println("2. Rectangle");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
class Triangle extends Shape {
Triangle(double b, double h) {
super(b, h);
}
double computeArea() {
return 0.5 * dim1 * dim2; // 1/2 * base * height
}
Shape obj;
switch (choice) {
case 1:
System.out.print("Enter base and height: ");
double b = sc.nextDouble();
double h = sc.nextDouble();
obj = new Triangle(b, h);
break;
case 2:
System.out.print("Enter length and width: ");
double l = sc.nextDouble();
double w = sc.nextDouble();
obj = new Rectangle(l, w);
break;
case 3: System.out.println("Exiting program...");
System.exit(0);
default:
System.out.println("Invalid choice.");
sc.close();
return;
}
System.out.println("Area = " +obj.computeArea());
}while(ShapeDemo.choice != 3);
sc.close();
}
}