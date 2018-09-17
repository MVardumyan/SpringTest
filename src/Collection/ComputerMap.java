package Collection;

import Aspects.ForLog;
import Computers.Mik_Comp;

import java.util.Map;
import java.util.Set;

/**
 * Created by evarmic on 31-Aug-18.
 *
 * For Collection Injection (<Map></Map>)
 */
public class ComputerMap {
    private Map<Integer, Mik_Comp> compCollection;

    public void setCompCollection(Map<Integer, Mik_Comp> compCollection) {
        this.compCollection = compCollection;
    }

    public Map<Integer, Mik_Comp> getCompCollection() {
        return compCollection;
    }

    @ForLog
    public void start() {
        for(Map.Entry<Integer, Mik_Comp> entry: compCollection.entrySet())
            entry.getValue().start();
    }

    public void destroy() {
        for(Map.Entry<Integer, Mik_Comp> entry: compCollection.entrySet())
            entry.getValue().destroy();
    }

    public void printMap() {
        Set<Integer> keys = compCollection.keySet();

        for(Integer key: keys)
            System.out.println(key + " - " + compCollection.get(key));
    }
}
