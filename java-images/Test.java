import java.util.Properties;

class Test {

    public static void printSystemProperties(){
        System.out.println(" Printing the System properties using ");
       Properties properties= System.getProperties();
       System.out.println(properties);
    
    }

    public static void main(String arges []){

        System.out.println("This is printing form java-image");
        printSystemProperties();
    }
}