
import java.lang.Object;
class helloworld{

public static void main(String[] args){
System.out.println("Hello World!");
System.out.println("This is a test!");
helloworld hi = new helloworld();
String abc = hi.toString();
System.out.println("This class is: "+abc+" !");

Tobecallclass tbc = new Tobecallclass();
String stbc = tbc.getClassId();
System.out.println("The 2nd class id is: "+stbc);
/*
Tobecallclass ob;
ob = (Tobecallclass)tbc.clone();

Tobecallclass ob2 = ob.getClass();
String sob2 = ob2.getClassId();
System.out.println("The 2nd class id is: "+sob2);
*/
}
}