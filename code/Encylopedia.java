abstract class Book{
protected static String material="papyrus";
public Book(){}
public Book(String material){this.material=material;}
}
public class Encylopedia extends Book{
public static String material="cellulose";
public Encylopedia(){super();}
public String getMaterial(){return super.material;}
public static void main(String []args){
System.out.print(new Encylopedia().getMaterial());
}
}