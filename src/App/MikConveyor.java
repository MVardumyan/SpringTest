package App;

import Interfaces.Computer;
import Interfaces.ComputerConveyor;

/**
 * Created by evarmic on 30-Aug-18.
 *
 * For method injection (<lookup-method></lookup-method>)
 */
public abstract class MikConveyor implements ComputerConveyor {

    @Override
    public abstract Computer createComputer();
}
