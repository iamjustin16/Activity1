//package resources;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.MediaType;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//@Component
//@Path("/people")
//public class GtgResource {
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response gtg() {
//
//		 JSONArray jsonArray = new JSONArray();
//		    JSONObject obj1 = new JSONObject();
//			    obj1.put ("firstName", "Justin");
//			    obj1.put ("lastName", "Hernandez");
//			    obj1.put ("birthDate", "01-16-1996");
//		    JSONObject obj2 = new JSONObject();
//			    obj2.put ("firstName", "Vince");
//			    obj2.put ("lastName", "Parcon");
//			    obj2.put ("birthDate", "02-21-1998");
//			JSONObject obj3 = new JSONObject();
//				obj3.put ("firstName", "Dan");
//				obj3.put ("lastName", "Rivera");
//				obj3.put ("birthDate", "07-23-1997");
//			    
//		    jsonArray.add(obj1);
//		    jsonArray.add(obj2);
//		    jsonArray.add(obj3);
//		    
//		    Stream<String> ss = jsonArray.stream().map (json->json.toString ());
//		    List<String> list = ss.collect (Collectors.toList ());
//		    System.out.println(list);
//			return null;
//	}
//}
