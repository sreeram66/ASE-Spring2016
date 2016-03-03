

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/perimeter")
public class Perimeter {
	@GET
	@Produces("application/xml")
	public String perimeterstatic() {
 
		Double perimeter;
		Double side = 10.0;
		perimeter = 4*side;
 
		String result = "@Produces(\"application/xml\") \n Perimeter of square: " + perimeter;
		return "<Perimeter>" + "<side>" + side + "</side>" + "<output>" + result + "</output>" + "</perimeter>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String perimeterinput(@PathParam("c") Double c) {
		Double perimeter;
		Double side = c;
		perimeter = 4*side;
 
		String result = "@Produces(\"application/xml\") \n perimeter of Square: " + perimeter;
		return "<perimeter>" + "<side>" + side + "</side>" + "<output>" + result + "</output>" + "</perimeter>";
	}
	public Double parimeterTestInput(@PathParam("f") Double f)
	{
	  
	  Double perimeter;
	  perimeter = 4*f;
	  return perimeter;
	}
}