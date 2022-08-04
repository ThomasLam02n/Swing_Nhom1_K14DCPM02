package javaSwingObserver;

import java.util.Observable;

import javax.swing.event.ChangeEvent;

public class MessageObservable extends Observable {
    MessageObservable() {	
        super();
    }
    void changeData(Object data) {
        setChanged(); // the two methods of Observable class
        notifyObservers(data);
    }
}
