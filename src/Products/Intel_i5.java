package Products;

import Interfaces.Processor;

/**
 * Created by evarmic on 29-Aug-18.
 */
public class Intel_i5 implements Processor {

    @Override
    public void calculate() {
        System.out.println("i5 processor calculates");
    }
}
