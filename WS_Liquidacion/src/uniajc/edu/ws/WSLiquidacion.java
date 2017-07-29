package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.Liquidacion;
import uniajc.edu.servicio.ImplLiquidacion;
//import uniajc.edu.dao.CargaAcademicaDao;
//import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.ImplLiquidacion;;

public class WSLiquidacion {
	

	
	
	
  
   public Liquidacion getCargaAcademica(int P_ID) {
 
	   ImplLiquidacion dao = new ImplLiquidacion();
	  System.out.println("re: "+P_ID); 
	   return dao.Liquidacion(P_ID);
  
   }
  
  @WebMethod(operationName = "nota")
  public String getCargaAcademicafullJson(int P_ID) {

	  System.out.println("1 Metodo a Consultar getCargaAcademicaJSON "+ P_ID);
	   ImplLiquidacion imp = new ImplLiquidacion();
	   System.out.println(" 2 Metodo a Consultar getCargaAcademicaJSON "+ P_ID);
	   return imp.LiquidacionJson(P_ID);
 
  }
	
	
}
