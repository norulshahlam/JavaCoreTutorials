package Beginner.ParseInt;
/*
This method is used to get the primitive data type of a certain String
*/
public class intro1 {
  public static void main(String[] args) {

    String a= "1";
    int a2=Integer.parseInt(a);
    //once parsed, u can do maths ops
    System.out.println(a2+1);

    //double check its datatype
    System.out.println(((Object) a).getClass().getName());
    System.out.println(((Object) a2).getClass().getName());

  }
}
