package DesignPatter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ojas
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject();
        observerOne sdf = new observerOne();
        observerTwo dfgdf = new observerTwo();
        subject.observerList.add(sdf);
        subject.observerList.add(dfgdf);
        subject.invoke(1);
    }

}

abstract class Observer{
    protected Subject subject;
    abstract void update();
}

class observerOne extends Observer{

    /*private String invoke;
    public observerOne(String invokeParam){this.invoke = invokeParam;}*/
    @Override
    void update() {
        System.out.println("Inside observer One : ");
    }
}


class observerTwo extends Observer{

    /*private String invoke;
    public observerOne(String invokeParam){this.invoke = invokeParam;}*/
    @Override
    void update() {
        System.out.println("Inside observer Two : ");
    }
}


class Subject{

    List<Observer> observerList = new ArrayList<>();

    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        invoke(this.state);
    }

    void add(Observer observer){

        this.observerList.add(observer);
    }

    void invoke(int invokeParam){
        for(Observer obs : observerList){
            obs.update();
        }
    }

}
