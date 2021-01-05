package Dominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class ClaseDominio {
	
	public double calcularPrecioNocheParcela(String FechaLlegada, int tipo) {
		double precio=0.0;

		
		switch(tipo) {
			case 1:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.ParcelaP);
				break;
			}
			
			case 2:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.ParcelaM);
				break;			
			}
			
			case 3:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.ParcelaD);
				break;			
			}
			
			case 4:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.ParcelaA);
				break;			
			}
		}

		return precio;
	}
	
	public double calcularPrecioNocheBungalow(String FechaLlegada, int tamano) {
		double precio=0.0;

		
		switch(tamano) {
			case 1:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.BungalowP);
				break;
			}
			
			case 2:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.BungalowM);
				break;			
			}
			
			case 3:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.BungalowG);
				break;			
			}
			
			case 4:{
				precio=calcularIncrementoDecremento(FechaLlegada, Datos.BungalowD);
				break;			
			}
		}

		return precio;
	}
	
	
	public int calcularDias(String fechaLlegada, String fechaSalida) {
		StringTokenizer st1 = new StringTokenizer(fechaLlegada, "/");
		StringTokenizer st2 = new StringTokenizer(fechaSalida, "/");
		
		return Integer.valueOf(st2.nextToken()) - Integer.valueOf(st1.nextToken());
	}
	
	public double calcularIncrementoDecremento(String fechaLlegada, double precio) {
		double resultado=0.0;
		StringTokenizer st = new StringTokenizer(fechaLlegada, "/");
		st.nextToken();//dia		
		int mes=Integer.valueOf(st.nextToken());

		if(mes >= 11 || mes <=3)//Estamos en temporada baja (de Noviembre a Marzo)
			resultado = precio - precio*Datos.Temporada;
		
		else //Estamos en temporada alta (de Abril a Octubre)
			resultado = precio + precio*Datos.Temporada;


		return resultado;
	}


}
