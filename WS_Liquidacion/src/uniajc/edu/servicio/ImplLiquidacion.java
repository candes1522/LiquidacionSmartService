package uniajc.edu.servicio;

import com.google.gson.Gson;

import uniajc.edu.dao.LiquidacionDao;
import uniajc.edu.model.Liquidacion;
import uniajc.edu.servicio.Iliquidacion;

public class ImplLiquidacion implements Iliquidacion {

	@Override
	public Liquidacion Liquidacion(int id) {
		
		LiquidacionDao LiqDAO = new LiquidacionDao();
		  return LiqDAO.Liquidacion(id);
		
	}

	@Override
	public String LiquidacionJson(int id) {

		String respuesta = "";
		LiquidacionDao LiqDAO = new LiquidacionDao();

		Liquidacion liquidacion = LiqDAO.Liquidacion(id);
		System.out.println("re: " + liquidacion);
		Gson gson = new Gson();
		final Gson gson1 = new Gson();

	
		
		 String data = gson1.toJson(liquidacion);
		 
		 

		return data;
	
	}

}
