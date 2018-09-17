package Computers;

import Aspects.ForLog;
import Interfaces.*;

/**
 * Created by evarmic on 29-Aug-18.
 */
public class Mik_Comp implements Computer {
    private Processor processor;
    private RAM ram;
    private Videocard videocard;
    private int price;

    public Mik_Comp() {
    }

    public Mik_Comp(Processor processor, RAM ram, Videocard videocard, int price) {
        this.processor = processor;
        this.ram = ram;
        this.videocard = videocard;
        this.price=price;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setVideocard(Videocard videocard) {
        this.videocard = videocard;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Videocard getVideocard() {
        return videocard;
    }

    public int getPrice() {
        return price;
    }

    @Override
    @ForLog
    public void start() {
        processor.calculate();
        ram.store();
        videocard.display();
        System.out.println("Price: " + price);
    }

    public void init() {
        System.out.println("Bean initialized");
    }

    public void destroy() {
        System.out.println("Bean destroyed");
    }

}
