
/************************************************/
/*                                              */
/* Compile: javac generic_programming/demo.java */
/* Run: java generic_programming.demo           */
/* Note: Compile in sub_dir and run from root   */
/*                                              */
/************************************************/

package generic_programming;

class objs <T> {
    T obj;
    
    objs(T obj) {
        this.obj = obj;
    }

    T getObject() {return obj;}
}

public class demo {
    public static void main(String[] args) {
        objs <String> sObj = new objs<String>("Hello World!");
        System.out.println(sObj.getObject());

        objs <Integer> iObj = new objs<Integer>(15);
        System.out.println(iObj.getObject());

        objs <Double> dObj = new objs<Double>(15.5);
        System.out.println(dObj.getObject());
    }
}