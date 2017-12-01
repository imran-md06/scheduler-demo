import java.time.Instant;

public class RunnableTask implements Runnable {

	private String taskName;
	private String appName;
	
	public RunnableTask() {
		
	}
	
	public RunnableTask(String taskName, String appName) {
		this.taskName = taskName;
		this.appName = appName;
	}
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Override
	public void run() {
		System.out.println(Instant.now().toString() + " Running " + taskName + " of appname " + appName);
	}
}
