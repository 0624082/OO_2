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
  return "area+="
  }
  
  public void getArea(){
    System.out.println(length*width);
  }
}

class Triangle implements Shape{
  double base;
  double height;
  public Rectangle(double b, double h){
     base = b;
     height = h;
  }
  public void getArea(){
    System.out.println(base*height);
  }
}
