import java.util.*;
public class trycatch{
  public static void main(String[] args){
    int a = 100, res;
    try{
      Scanner input = new Scanner(System.in);
      System.out.print("Ingresa un valor para b: ");
      int b = input.nextInt();
      System.out.print("Ingresa un valor para c: ");
      int c = input.nextInt();
      res = 10 / (b-c);
      System.out.println("El resultado es: " + res);
    }
    catch(Exception e){
      String error = e.getMessage();
      System.out.println(error);
    }
    System.out.println("Despues del bloque catch");
  }
}
