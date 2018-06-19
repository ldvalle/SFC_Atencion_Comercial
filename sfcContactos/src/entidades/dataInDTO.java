package entidades;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class dataInDTO {

	   public long		numero_cliente;
	   public String	sucursal;;
	   public String	motivo;
	   public String	sub_motivo;
	   public String	trabajo;
	   public String	observaciones;

	   public dataInDTO(interfaceDTO regIn) {
		   String s = regIn.data_in;
		   JSONParser parser = new JSONParser();

	      try{
	    	  
	          Object obj = parser.parse(s);
	          JSONArray array = (JSONArray)obj;

	          JSONObject obj1 = (JSONObject)array.get(0);
	          this.numero_cliente = (Long) obj1.get("numero_cliente");
	          this.sucursal=(String) obj1.get("sucursal");
	          this.motivo=(String) obj1.get("motivo");
	          this.sub_motivo=(String) obj1.get("sub_motivo");
	          this.trabajo=(String) obj1.get("trabajo");
	          this.observaciones=(String) obj1.get("observaciones");
	          
	      }catch(ParseException pe){
	          System.out.println("position: " + pe.getPosition());
	          System.out.println(pe);
	       }		
	   }
	   
}
