public class Calculo {
        String tipoAtaq,tipoDef;
        Double ataq,defend;

     public Calculo(String tipoAtaq, String tipoDef, Double ataq, Double defend) {
        this.tipoAtaq = tipoAtaq;
        this.tipoDef = tipoDef;
        this.ataq = ataq;
        this.defend = defend;
     }

    double guiaEfectividad(String tipoAtaque, String tipoDefensa){

        double numeroAgua = 0.0,numeroPlanta = 0.0 ,numeroFuego = 0.0 ,numeroElectrico = 0.0;
        int numero = 0;

        if(tipoAtaque.equalsIgnoreCase("fuego")){
            numeroFuego = 1.0;
            numeroAgua = 0.5;
            numeroPlanta = 2.0;
            numeroElectrico = 1.0;
        }else if(tipoAtaque.equalsIgnoreCase("planta")){
            numeroFuego = 0.5;
            numeroAgua = 2.0;
            numeroPlanta = 1.0;
            numeroElectrico = 1.0;
        }else if(tipoAtaque.equalsIgnoreCase("electrico")){
            numeroFuego = 1.0;
            numeroAgua = 2.0;
            numeroPlanta = 1.0;
            numeroElectrico = 1.0;
        }else if(tipoAtaque.equalsIgnoreCase("agua")){
            numeroFuego = 2.0;
            numeroAgua = 1.0;
            numeroPlanta = 0.5;
            numeroElectrico = 0.5;
        }

        Double[] guia = new Double[4];
        guia[0] = numeroFuego;
        guia[1] = numeroAgua;
        guia[2] = numeroPlanta;
        guia[3] = numeroElectrico;

        if(tipoDefensa.equalsIgnoreCase("agua")) numero = 1;
        else if(tipoDefensa.equalsIgnoreCase("planta")) numero = 2;
        else if(tipoDefensa.equalsIgnoreCase("electrico")) numero = 3;

        return guia[numero];
    }
    double danioTotal(){
        return 50 * (this.ataq / this.defend) * guiaEfectividad(this.tipoAtaq,this.tipoDef) ;
    }
}
