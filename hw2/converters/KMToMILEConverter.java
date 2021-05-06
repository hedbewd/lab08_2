package edu.handong.csee.java.hw2.converters;

/** This is a class for KM to MILE converter */
public class KMToMILEConverter implements Convertible {
    private double km ;
    private double mile ;

    /** Setter method */
    public void setFromValue(double fromValue) {
        km = fromValue ;
    }

    /** Getter method */
    public double getConvertedValue() {
        return mile ;
    }

    /** Converting method */
    public void convert() {
        mile = km * 0.625 ;
        mile = Math.round(mile * 100000) / 100000.0 ;
    }
}