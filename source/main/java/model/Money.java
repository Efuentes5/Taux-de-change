package model;

/**
 * Created by Fuentes Enzo on 02/12/2015.
 */
public class Money {

    private String devise;
    private double taux;

    public Money(String devise, double taux){
        this.devise = devise;
        this.taux = taux;
    }


    public String getname(){
        return this.devise;
    }

    public double getTaux(){
        return this.taux;
    }
}

