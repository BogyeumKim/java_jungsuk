import java.util.Iterator;
import java.util.Map;

public class Ex13_11_1 {
    public static void main(String[] args) {
        ThEx1 t1 = new ThEx1("Thread1");
        ThEx2 t2 = new ThEx2("Thread2");
        t1.start();
        t2.start();
    }
}

class ThEx1 extends Thread {
    ThEx1(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThEx2 extends Thread {
    ThEx2(String name) {
        super(name);
    }

    @Override
    public void run() {
        Map map = getAllStackTraces();
        Iterator it = map.keySet().iterator();

        int x=0;
        while (it.hasNext()) {
            Object obj = it.next();
            Thread t = (Thread) obj;
            StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));

            System.out.println("[" + ++x + "] name : " + t.getName() + ", group : " + t.getThreadGroup().getName() + ", demon : " + t.isDaemon());
            for (int i = 0; i < ste.length; i++) {
                System.out.println(ste[i]);
            }
            System.out.println();
        }
    }
}