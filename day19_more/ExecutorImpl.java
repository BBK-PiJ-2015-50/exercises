import java.util.*;
import java.util.concurrent.*;

public class ExecutorImpl implements Executor {
   private final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
   private final Executor executor;
   Runnable active;

   ExecutorImpl(Executor executor) {
     this.executor = executor;
   }

   public synchronized void execute(final Runnable r) {
     tasks.offer(new Runnable() {
       public void run() {
         try {
           r.run();
         } finally {
           scheduleNext();
         }
       }
     });
     if (active == null) {
       scheduleNext();
     }
   }

   protected synchronized void scheduleNext() {
     if ((active = tasks.poll()) != null) {
       executor.execute(active);
     }
   }
   
   public int getMaxPendingTime() {
	   return 1000*tasks.size();
   }
 }