package edu.handong.csee.java.hw2.converters;

/** This is a class for MILE to KM converter */
public class MILEToKMConverter implements Convertible {
    private double km ;
    private double mile ;

    /** Setter method */
    public void setFromValue(double fromValue) {
        mile = fromValue ;
    }

    /** Getter method */
    public double getConvertedValue() {
        return km ;
    }

    /** Converting method */
    public void convert() {
        km = mile * 1.6 ;
    }
}