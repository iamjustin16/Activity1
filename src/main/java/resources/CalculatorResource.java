package resources;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Path("/_calculator")
public class CalculatorResource {
	@POST
	@Produces (MediaType.APPLICATION_JSON)
	public Response calculator (CalculatorRequest request) {	
		
		if (StringUtils.isEmpty(request.getFirstnumber()) || 
			StringUtils.isEmpty(request.getSecondnumber()) ||
			StringUtils.isEmpty(request.getOperator())) {
//			return Response.ok().entity("400 Bad Request: \n   Check for null value(s)").build();
			return Response.status(HttpServletResponse.SC_BAD_REQUEST).entity(HttpServletResponse.SC_BAD_REQUEST).build();
		}
		
		Float a = request.getFirstnumber();
		Float b = request.getSecondnumber();
		
		CalculatorResponse messageResponse = new CalculatorResponse();
		String action = null;
		Float result;
		Float add = a+b; Float minus = a-b;	Float times = a*b; Float divide = a/b;	
		
		switch (request.getOperator()) {
		case "+": action ="addition"; result = add; break;
		case "-": action ="subtraction"; result = minus; break;
		case "*": action ="multiplication"; result = times; break;
		case "/": action ="division"; result = divide; break;
		default : return Response.ok().entity("400 Bad Request: \n   Invalid operator").build();}
		
		BigDecimal finalResult = new BigDecimal(String.format("%.5f", result));
		
		 String[] arr=String.valueOf(finalResult).split("\\.");
		    int[] intArr=new int[2];
		    int whole = intArr[0]=Integer.parseInt(arr[0]);
		    int deci = intArr[1]=Integer.parseInt(arr[1]);
		    
			if (deci == 00000) {
				BigDecimal finalResult1 = new BigDecimal(String.format("%.0f", result));
				messageResponse.setResult(finalResult1);	
			} else {
				messageResponse.setResult(finalResult);	
			}
		
		messageResponse.setAction(action);
		return Response.ok().entity(messageResponse).build();
	}
}
