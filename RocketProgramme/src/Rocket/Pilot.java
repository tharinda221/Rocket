package Rocket;

/**
 * Created by Ehelepola on 25/07/2015.
 */
abstract class Pilot {

    String name;
    int id;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }
}
