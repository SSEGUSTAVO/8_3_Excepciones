public class calculadora{
  public int suma(int x, int y){
    return x+y;
  }
  public void division(double x, double y){
    String resultado = "";
    try{
       resultado = Double.toString(x/y);
    }
    catch (Exception e){
      resultado = e.getMessage();
    }
    finally{
      System.out.println("Resultado: " + resultado);
    }
  }
}
