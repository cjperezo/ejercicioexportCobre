package interfaz;

import entidades.ExportCobre;

public class App {
    public static void main(String[] args) {

        //Creamos un objeto
        ExportCobre exportacion = new ExportCobre(123456, "Grecia","Luis Saa Cancino");

        System.out.println("----------Registro de Exportacion----------");
        System.out.println("Numero de Exportanción: "+ exportacion.getNumExportacion());
        System.out.println("Pais de Destino: "+ exportacion.getPaisDestino());
        System.out.println("Nombre del Cliente: "+ exportacion.getNombreCliente());
        System.out.println("Correo electronico: "+ exportacion.correo());

        for(int i=0; i<exportacion.getTonExportadas().length; i++){
            System.out.println("Las toneladas exportadas del mes "+ (i+1) +
                    " son en total: "+ exportacion.getTonExportadas()[i]+ "Tn");
        }

        System.out.println("El mes con Mayor cantidad de Toneladas Exportadas es el mes nro; ----> "+ exportacion.mesMayorExportacion());
        System.out.println("El total de Toneladas de la Temporada Otoño-Invierno es: "+ exportacion.totalOtonnoInvierno()+ " Tn");

        int mes;
        do{
            System.out.println("-----Cantidad de Toneladas Exportadas X Mes-----");
            System.out.println("Ingrese el mes a consultar"); mes= Leer.datoInt();
        }while(mes<1 || mes>12);
        System.out.println("La cantidad de toneldas exportadas en el mes "+ mes + " es: "+ exportacion.cantidadExportadaMesX(mes)+ "Tn");





    }
}
