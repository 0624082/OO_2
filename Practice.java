

public class app11_1{
  public static void main(String args[]){
    CShape shape3 =new CTriango(3,4,5);
    shape3.setColor("Red");
    shape3.show;
   }
}
abtract class CShape{
  protected String color;
  public void setColor(String str){
    color=str;
  }
  public abstract void show();
}

class CTriangle extends Cshape{
  protected double area;
  public CTriangle(double a,double b,double c){
    area =a*b*1/2;
   // System.out.println("面積是:"+area);
   }
  public void show(){
    System.out.println("面積是:"+area);
  }
}

