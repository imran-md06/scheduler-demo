import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Driver {
	public static void main(String[] args) {
		
		RunnableTask task1 = new RunnableTask("task1", "app1");
		RunnableTask task2 = new RunnableTask("task2", "app2");
		
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		executor.scheduleAtFixedRate(task1, 0, 5, TimeUnit.SECONDS);
		
		executor.scheduleAtFixedRate(task2, 0, 2, TimeUnit.SECONDS);
	}
}
