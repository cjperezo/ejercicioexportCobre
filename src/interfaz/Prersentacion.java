package interfaz;

import entidades.ExportCobre;

public class Prersentacion {
    public static void main(String[] args) {
        String nombreCliente, paisDestino;
        int numExportacion;
        int[] tonExportadas;

        ExportCobre exportacion= null;
        int opcion;

        do{
            System.out.println("-----Bienvenido al Sistema de Exportación de ExportCobre-----");
            System.out.println("1.) Registro de Exportación");
            System.out.println("2.) Correo electrónico del cliente");
            System.out.println("3.) Mes de Mayor Exportación");
            System.out.println("4.) Total de Toneladas Exportadas en el periodo Otoño-Invierno");
            System.out.println("5.) Consulta la cantidad exportada en el mes  de Junio");
            System.out.println("6.) Salir del Sistema");
            opcion= Leer.datoInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el número de Exportación"); numExportacion = Leer.datoInt();

                    do{
                        System.out.println("Ingrese el país de destino (mínimo 4 caracteres)"); paisDestino = Leer.dato();
                    }while(paisDestino.length()<4);

                    String[] datosNombre= null;

                    do{
                        System.out.println("Ingrese el nombre del cliente (Nombre y dos Apellidos)"); nombreCliente= Leer.dato();
                        datosNombre = nombreCliente.split(" ");
                    }while(datosNombre.length != 3);

                    exportacion = new ExportCobre(numExportacion, paisDestino,nombreCliente);

                    System.out.println("Información Ingresada Correctamente");
                    System.out.println("Numero de Exportanción: "+ exportacion.getNumExportacion());
                    System.out.println("Pais de Destino: "+ exportacion.getPaisDestino());
                    System.out.println("Nombre del Cliente: "+ exportacion.getNombreCliente());

                    for(int i=0; i<exportacion.getTonExportadas().length; i++) {
                        System.out.println("Las toneladas exportadas del mes " + (i + 1) +
                                " son en total: " + exportacion.getTonExportadas()[i] + "Tn");
                    }
                    break;

                case 2:
                    if(exportacion==null){
                        System.out.println("Por Favor Ingrese los datos de Exportación para continuar");
                    }else{
                        System.out.println("Correo electronico: "+ exportacion.correo());
                    }
                    break;

                case 3:
                    if(exportacion==null){
                        System.out.println("Por Favor Ingrese los datos de Exportación para continuar");
                    }else{
                        System.out.println("El mes con Mayor cantidad de Toneladas Exportadas es el mes nro; ----> "+ exportacion.mesMayorExportacion());
                    }
                    break;

                case 4:
                    if(exportacion==null){
                        System.out.println("Por Favor Ingrese los datos de Exportación para continuar");
                    }else{
                        System.out.println("El total de Toneladas de la Temporada Otoño-Invierno es: "+ exportacion.totalOtonnoInvierno()+ " Tn");
                    }
                    break;

                case 5:
                    if(exportacion==null){
                        System.out.println("Por Favor Ingrese los datos de Exportación para continuar");
                    }else{
                        System.out.println("La cantidad de toneldas exportadas en el mes de Junio es: "+ exportacion.cantidadExportadaMesX(6)+ "Tn");
                    }
                    break;

            }

        }while(opcion != 6);






    }

}
