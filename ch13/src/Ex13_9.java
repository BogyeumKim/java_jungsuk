public class Ex13_9 {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup(); // 쓰레드 자신이 속한 그룹을 반환함
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        // ThreadGroup(ThreadGroup parent, String name)
        ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");

        grp1.setMaxPriority(3); // grp1의 우선순위 3

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } // run
        };

        // Thread( ThreadGroup tg, Runaable r, String name )
        /*
        * Thread th1 = new Thread(grp1,r,"th"1)
        * th1.start()와 동일*/
        new Thread(grp1, r, "th1").start();
        new Thread(subGrp1, r, "th2").start();
        new Thread(grp2, r, "th3").start();

        System.out.println(">> List of ThreadGroup : " + main.getName() + "\nActive ThreadGroup : "+main.activeGroupCount()+"\nActive Thread : "+main.activeCount());
        main.list(); // 쓰레드그룹의 메서드로 쓰레드그룹에 속한 정보를 출력
    }
}
/* 출력결과
* Active ThreadGroup : 3
Active Thread : 5
java.lang.ThreadGroup[name=main,maxpri=10]
    Thread[main,5,main]
    Thread[Monitor Ctrl-Break,5,main]
    java.lang.ThreadGroup[name=Group1,maxpri=3]
        Thread[th1,3,Group1]
        java.lang.ThreadGroup[name=SubGroup1,maxpri=3]
            Thread[th2,3,SubGroup1]
    java.lang.ThreadGroup[name=Group2,maxpri=10]
        Thread[th3,5,Group2]
*/
