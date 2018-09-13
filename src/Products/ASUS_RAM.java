package Products;

import Interfaces.RAM;

/**
 * Created by evarmic on 29-Aug-18.
 */
public class ASUS_RAM implements RAM {

    @Override
    public void store() {
        System.out.println("Asus RAM stores");
    }
}
