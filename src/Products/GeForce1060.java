package Products;

import Interfaces.Videocard;

/**
 * Created by evarmic on 29-Aug-18.
 */
public class GeForce1060 implements Videocard {

    @Override
    public void display() {
        System.out.println("GeForce 1060 displays");
    }
}
