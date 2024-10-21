package entidades;

public class ExportCobre {
    //declarar atributos

    private int numExportacion;
    private String paisDestino;
    private String nombreCliente;
    private int[] tonExportadas;

    //Constructores

    public ExportCobre() {
    }

    public ExportCobre(int numExportacion, String paisDestino, String nombreCliente/*int[] tonExportadas*/) {
        this.numExportacion = numExportacion;
        this.paisDestino = paisDestino;
        this.nombreCliente = nombreCliente;
        this.tonExportadas = new int[12];//tonExportadas;

        for (int i = 0; i < tonExportadas.length; i++) {
            //Obtenemos el valor aleatorio de 0 a 1500
            tonExportadas[i] = (int) (Math.random() * (1500 - 0)+1);
        }
    }

    //Accesadores y Mutadores


    public int getNumExportacion() {
        return numExportacion;
    }

    public void setNumExportacion(int numExportacion) {
        this.numExportacion = numExportacion;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int[] getTonExportadas() {
        return tonExportadas;
    }

    public void setTonExportadas(int[] tonExportadas) {
        this.tonExportadas = tonExportadas;
    }

    // Métodos

    public String correo() {
        String mail = "";
        String[] n = nombreCliente.split(" "); // Separamos al nombre por espacios y tenemos un arreglo de 3
        if (n[0].length() >= 5) {
            mail = n[0].substring(0, 5);
        } else {
            mail = n[0];
            int dif = 5 - n[0].length();
            for (int i = 1; i <= dif; i++) {
                mail = mail.concat("x");
                mail = mail.concat("_"); //esto imprimira luisx_
            }
        }
            if (n[1].length() >= 4) {
                mail = mail + n[1].substring(n[1].length() - 4);
            } else {
                mail = mail + n[1];
                int dife = 4 - n[1].length();
                for (int i = 1; i <= dife; i++) {
                    mail = mail.concat("x"); //esto imprimira saax

                }
            }
            mail= mail + paisDestino.substring(1,2) + "@exportcobre.cl";
            return mail.toLowerCase();
    }

    public int mesMayorExportacion(){
        int max= tonExportadas[0];
        int mes = 0;

        for(int i=1; i<tonExportadas.length;i++){
            if(tonExportadas[i] > max){
                max = tonExportadas[i];
                mes = i + 1;
            }
        }
        return mes;
    }

    public int totalOtonnoInvierno(){ // tenemos un arreglo de tañamo {12} y las posiciones a considerar seran [3,4,5,6,7,8}
        int suma= 0;
        for(int i=3; i<=8;i++){
            suma= suma + tonExportadas[i];
        }
        return suma;
    }

    public int cantidadExportadaMesX(int mes){
        return tonExportadas[(mes-1)];
    }

}

