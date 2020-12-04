import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {
    @Test
    public void getsCharge(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        float charge = ls.getCharge();
        //Assertions
        assertEquals(100,charge);

    }
    @Test
    public void setsCharge(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        ls.setCharge(99);
        float charge = ls.getCharge();

        //Assertions
        assertEquals(99,charge);
    }
    @Test
    public void getsColor(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        String color = ls.getColor();
        //Assertions
        assertEquals("green",color);
    }

    @Test
    public void setsColor(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        ls.setColor("blue");
        String color = ls.getColor();
        //Assertions
        assertEquals("blue",color);
    }

    @Test
    public void getsJediSerialNumber(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        long serial = ls.getJediSerialNumber();
        //Assertions
        assertEquals(1324,serial);
    }

    @Test
    public void getsMinutesRemaining(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        float minutes = ls.getRemainingMinutes();
        //Assertions
        assertEquals(600,minutes);
    }

    @Test
    public void usesCorrectMinutes(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        ls.use(10.0f);
        float minutes = ls.getRemainingMinutes();

        //Assertions
        assertEquals(590,minutes,0.01);
    }

    @Test
    public void recharges(){
        //Setup
        LightSaber ls = new LightSaber(1324);

        //Execution
        ls.use(100);
        ls.recharge();
        float charge = ls.getCharge();
        //Assertions
        assertEquals(100,charge);
    }
}