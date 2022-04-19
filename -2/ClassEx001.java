class Rectangle {
       int width;
       int height;
       public int gelArea() {
              return width * height;
       }
       public int getRound() {
              return 2 * (width + height);
       }
} 
public class ClassEx001 {
    
       public static void main(string[] args) {
              Rectangle aaa = new Rectangle();
              aaa.width = 10;
              aaa.height =20;
              System.out.println("사각형의 넓이 :"+aaa.getArea());
              System.out.println("사각형의 둘레 :"+aaa.getRound());
       }
}