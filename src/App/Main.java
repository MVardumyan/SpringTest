package App;

import Collection.ComputerMap;
import Computers.Mik_Comp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by evarmic on 29-Aug-18.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Mik_Comp comp = (Mik_Comp) context.getBean("mik_comp");
//        MikConveyor conveyor = (MikConveyor) context.getBean("conveyor");
//        Mik_Comp comp = (Mik_Comp) conveyor.createComputer();
//
//        comp.start();
//        comp.destroy();

        ComputerMap compMap = (ComputerMap) context.getBean("compMap");
        compMap.start();
        compMap.destroy();
        compMap.printMap();
    }
}