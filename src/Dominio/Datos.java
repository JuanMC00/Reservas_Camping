package Dominio;

import Presentacion.Login;

public interface Datos {
	
	//Datos Parcela
	double ParcelaP=10.00;
	double ParcelaM=15.00;
	double ParcelaD=20.00;
	double ParcelaA=25.00;
	
	//Datos Bungalow
	double BungalowP=40.00;
	double BungalowM=60.00;
	double BungalowG=80.00;
	double BungalowD=100.00;
	
	//Datos Temporada
	double Temporada=0.10;
	
	//Datos rutas
	String DatosRutaLlanura="La Llanura Solitaria;10/03/2021;18:00;21:30;Entrada del Camping;Raul Serrano;10;20;1;Aventurate en la llanura solitaria llena de misterios;Ropa de deporte y cantinplora;Get into the 'Lonely Plain' full mysteries;Sport clothes and woter bottle;/Presentacion/Fotos/Ruta1.jpg";
	String DatosRutaMontaña="Montañas escarpadas;8/07/2021;16:00;18:30;Pisicina;Adrián Martín;4;12;2;Aventura por la montaña;Zapatillas de escalada, casco y cuerdas;Adventure through the montain;Climbing shoes, helmet and ropes;/Presentacion/Fotos/Ruta2.jpg";
	String DatosRutaEmbalse="El embalse del cuervo;15/08/2021;17:00;19:30;Rocodromo;Sergio Morro;8;10;3;Aventura através del embalse;Impermeable,Zapatillas ligeras;Feel the swamp's call;Light shoes;/Presentacion/Fotos/Ruta3.jpg";
	
	//Ayudas
	String AyudaReservaESP="Para poder reservar una parcela o bungalow, usted debe rellenar todos los campos obligatorios marcados con '(*)'.\n"
			+ "A continuación, deberá pulsar el botón Aceptar para que el programa compruebe la validez de los datos que haya introducido.\n"
			+ "Cuando todos los campos estén rellenados con datos correctos, se deshabilitarán por lo que no se podrán hacer más cambios (al menos en esa reserva).\n"
			+ "Por último, se habilitará el botón Reservar y al pulsar se completará la reserva y se habilitarán de nuevo los campos vacíos.\n"
			+ "El botón Limpiar, borra el contenido de todos los campos y los habilita, resetea los índices de los Jcombo y oculta los mensajes de error.\n"
			+ "El formato correcto de la fecha es: dd/mm/aaaa. Cualquier otro formato no funcionará.";

	String AyudaReservaENG="To book a plot or a bungalow, you have to complete all de mandatory fields marked with '(*)'.\n"
			+ "Next, you must press Ok button to let the program check the data you have already write.\n"
			+ "When all fields are filled with correct values, these fields will disable so you wouldn't be able to make anymore changes (at least in that booking).\n"
			+ "Last, Book button will be enabled and pressing it, the book will be done and the fields will be enbaled again but with anything inside them.\n"
			+ "The Delete button, delete the content of al the fields and enables them, reset Jcombo index and hide the error messages.\n"
			+ "The date format is: dd/mm/yyyy. Any other format will not work.";
	
	String AyudaRutasESP="Para poder crear una ruta propia usted debe rellenar todos los campos obligatorios marcados '(*)' omitiendo el campo Buscar.\n"
			+ "Si lo que desea es buscar informacion acerca de una ruta preestablecida por el camping elija la opción que desea en el campo Buscar \n"
			+ "y se le rellenaran los campos automaticamente con los datos de la ruta.";

	String AyudaRutasENG="In order to create your own route you must complete all the mandatory fields marked with '(*)' omitting the Search field.\n"
			+ "If what you want is to search for information about a pre-established route by the camp site, choose the option you want in the Search \n"
			+ "and fields will automatically complete with the route's data.";

}
