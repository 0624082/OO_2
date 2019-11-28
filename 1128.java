public class HelloWorld{

     public static void main(String []args){
        Rectangle rec = new Rectangle(5,10);
        rec.getArea();
        Triangle tri = new Triangle(5,10);
        tri.getArea();
     }
}
interface Shape{

  abstract void getArea();

}





class Rectangle implements Shape{

  double length;

  double width;

  public Rectangle(double l, double w){

     length = l;

     width = w;

  }

  public String toString(){

  return "Area = ";

  }

  

  public void getArea(){

    System.out.println("Rectangle ="length*width);

  }

}



class Triangle implements Shape{

  double base;

  double height;

  public Triangle(double b, double h){

     base = b;

     height = h;

  }

  public void getArea(){

    System.out.println("Triangle ="base*height/2);

  }

}
