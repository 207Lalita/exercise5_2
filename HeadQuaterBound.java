/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5_2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author ACER
 */
public class HeadQuaterBound {
    
       private String scoreLine;

    public static final String PROP_SCORELINE = "scoreLine";

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = scoreLine;
        propertyChangeSupport.firePropertyChange(PROP_SCORELINE, oldScoreLine, scoreLine);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
