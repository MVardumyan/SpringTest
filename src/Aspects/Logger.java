package Aspects;

import org.aspectj.lang.ProceedingJoinPoint;

import java.io.*;
import java.util.Calendar;

public class Logger {

    private Object log(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        Object result=null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long time = System.currentTimeMillis() - start;

        try (PrintWriter pw = new PrintWriter(new FileWriter("logfile.txt", true))) {
            pw.println("=====\n" + Calendar.getInstance().getTime() + "\nMethod " + joinPoint.getSignature().toString() + " processed in " + time + " ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
