package edu.handong.csee.java.hw2.converters;

/** This is an interface for many convert class. */ 
public interface Convertible {
    /** Setter method */
    public void setFromValue(double fromValue);
    /** Getter method */
    public double getConvertedValue();
    /** Converting method */
    public void convert();

}