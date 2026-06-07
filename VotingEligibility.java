import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Sacnner sc = new scanner(System.in);
    int a = sc.nextInt();
    if(a>18){
      System.out.println("Eligible for vote");
    }
    else{
      System.out.println("Note eligible for vote");
    }
    sc.close();
  }
}
