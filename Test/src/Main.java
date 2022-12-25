import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void f() throws IOException {}
}

class B extends Main{


    @Override
    public void f() throws FileNotFoundException, InternalError {

    }
}