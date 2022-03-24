package er.task;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resources")
public class AppResourceConfig extends ResourceConfig {
	public AppResourceConfig() {
		packages("er.task.perfectnumber");
	}
}
