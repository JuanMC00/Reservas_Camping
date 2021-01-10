package Dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClaseDominio implements Datos{
	
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
	
	public double calcularIncrementoDecremento(String fechaLlegada, double precio) throws NoSuchElementException{
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
	
	public String datosRuta(int numRuta) {
		String datos="";
		
		switch(numRuta) {
			case 1:{datos=Datos.DatosRutaLlanura; break;}
			case 2:{datos=Datos.DatosRutaMontaña; break;}
			case 3:{datos=Datos.DatosRutaEmbalse; break;}
		}
		return datos;
	}

	public String infoCercaniasParcela(String parcela, String idioma) throws FileNotFoundException {
		return infoParcela(parcela, idioma)[0];
	}

	public String infoParticularidadesParcela(String parcela, String idioma) throws FileNotFoundException {
		return infoParcela(parcela, idioma)[1];
	}
	
	public String[] infoParcela(String parcela, String idioma) throws FileNotFoundException {
		String[] info = new String[2];
		File parcelas = new File("Parcelas.txt");
		Scanner sc = new Scanner(parcelas);

		boolean token=true;
		while(sc.hasNextLine() && token) {
			String linea=sc.nextLine();
			StringTokenizer st = new StringTokenizer(linea, ";\n");

			while(st.hasMoreTokens()) {
				if(st.nextToken().equals(parcela)) {
					st.nextToken();//Saltamos el tipo
					if(idioma.equals("espanol")) {
						info[0]=st.nextToken();
						info[1]=st.nextToken();
					}
					else {
						st.nextToken();st.nextToken();//Saltamos las cercanias y particularidades en español
						info[0]=st.nextToken();
						info[1]=st.nextToken();
					}
					token=false;
				}
			}
		}

		return info;
	}
}
