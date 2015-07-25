package Rocket;

import java.util.ArrayList;

/**
 * Created by Ehelepola on 25/07/2015.
 */
public class factory {


    private Pilot pilot;
    private ArrayList<Pilot> pilotList;

    public void addPilot(){
        pilot=new Pilot() {
            @Override
            public void setName(String name) {
                super.setName(name);
            }
        };
        pilotList.add(pilot);
    }
}
