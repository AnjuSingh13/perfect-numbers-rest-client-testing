package er.task;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class PerfectNumbersRestService {
	private final PerfectNumberService perfectNumbersService = new PerfectNumberService();
	
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "PerfectNumbersService is running";
    }
    
    @GET
    @Path("isPerfect/{number}")
    @Produces(MediaType.TEXT_PLAIN)
    public Boolean isItPerfect(@PathParam("number")Long number) {
    	return perfectNumbersService.isItPerfect(number) ? true : false;
    }
    
    @GET
    @Path("perfectNumbersFromRange/{start}/{end}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Integer> perfectNumbersFromRange(@PathParam("start") int start, @PathParam("end") int end) {
		return perfectNumbersService.checkForPerfectNumbers(start, end);
    }
}
