package javaDailySessions.objectAsVariableExample;

public class Vehicles {

    Cars c;

    public Vehicles() {
       c = new Cars();

    }
    public void whatIsDisplayedInCarsMethodSecond(){

        c.display();
    }

    public void whatIsDisplayedInCarsMethod(){

        c.display();
    }



    public static void main(String args[]){
        Vehicles v = new Vehicles();
        v.whatIsDisplayedInCarsMethodSecond();
        v.whatIsDisplayedInCarsMethod();

    }
}
