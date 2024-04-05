package es.iesmz.tests;

public class Time {

    private int sec;
    private int min;
    private int h;

    public Time(int h, int min, int sec) {
        verificaSec(sec);
        verificaMin(min);
        verficaHora(h);
    }

    public void verificaSec(int segundo){
        if(segundo>=0 && segundo<=59){
            this.sec=segundo;
        }
    }

    public void verificaMin(int minuto){
        if(minuto>=0 && minuto<=59){
            this.min=minuto;
        }
    }

    public void verficaHora(int hora){
        if(hora>=0 && hora<=23){
            this.h=hora;
        }
    }

    public Time nextSecond(){
        if(this.sec==59){
            this.sec=0;
            if(this.min==59){
                this.min=0;
                if(this.h==23){
                    this.h=0;
                }else{
                    this.h++;
                }
            }else{
                this.min++;
            }
        }else{
            this.sec++;
        }
        Time t= new Time(this.h, this.min, this.sec);
        return t;
    }

    @Override
    //Es necesario sobreescribirlo porque assertEquals compara que la posición de memoria de los objetos Time es la misma o no
    public boolean equals(Object timeDelTest) {
        Time esTime = (Time) timeDelTest;
        //Si los atributos coinciden, devolverá true
        return this.h == esTime.h && this.min == esTime.min && this.sec == esTime.sec;
    }

}
