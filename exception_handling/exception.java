// Code for user-defined exceptions

package exception_handling;

class myException extends Exception {
    String s;
    public myException(String s) {
        super(s);
        this.s=s;
    }

    public String toString() {
        return ("Exception Occurred: " + s);
    }
}

public class exception {
    public static void main(String[] args) throws myException {
        try {
            throw new myException("User-defined Exception");
        } catch (myException e) {
            System.err.println(e);
        }
    }    
}
