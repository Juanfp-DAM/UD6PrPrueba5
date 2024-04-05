package es.iesmz.tests;

public class Time {

    private int sec;
    private int min;
    private int h;

    public Time(int sec, int min, int h) {
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
        Time t= new Time(this.sec, this.min, this.h);
        return t;
    }

}
