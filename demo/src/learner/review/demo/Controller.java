package learner.review.demo;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Event> eventList = new ArrayList<>();

    public void addEvent(Event event){
        eventList.add(event);
    }

    public void run(){
        while (eventList.size() > 0){
            for (Event event : eventList) {
                if (event.ready()){
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
