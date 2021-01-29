public class OperationsValidator {

  public static void main (String[] args) {
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]); 
    int number3 = Integer.parseInt(args[2]);

    System.out.println(operationMatch(number1, number2, number3)); 
  }

  public static String operationMatch(int a, int b, int c) {
    String operations = "";

    if(a+b == c){
      operations = "+";
    }
    if(a-b == c){
      operations = operations + "-";
    }
    if(a*b == c){
      operations = operations + "*";
    }
    if(a/b == c){
      operations = operations + "/";
    }
    if(operations == ""){
      operations = "None";
    }
    return operations; 
  }

}
