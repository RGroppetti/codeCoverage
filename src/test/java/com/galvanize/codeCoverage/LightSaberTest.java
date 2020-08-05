package com.galvanize.codeCoverage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LightSaberTest{

    long jediSerialNumber = 12341234l;

    @Test
    void setCharge() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        float expected = 100.f;
        float actual = lightSaber.getCharge();
        assertEquals(expected, actual);
    }

    @Test
    void setColor() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        String expected = "green";
        String actual = lightSaber.getColor();
        assertEquals(expected,actual);
    }

    @Test
    void getCharge() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        float expected = 100.0f;
        float actual = lightSaber.getCharge();
        assertEquals(expected,actual);    }

    @Test
    void getJediSerialNumber() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        int expected = 12341234;
        int actual = (int)lightSaber.getJediSerialNumber();
        assertEquals(expected, actual);
    }

    @Test
    void use() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        lightSaber.use(60);
        Float expected = 90f;
        Float actual = lightSaber.getCharge();
        assertEquals(expected,actual);    }

    @Test
    void getRemainingMinutes() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        float expected = 300f;
        float actual = lightSaber.getRemainingMinutes();
        assertEquals(expected,actual);
    }

    @Test
    void recharge() {
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        lightSaber.use(1);
        lightSaber.recharge();
        float expected = 100.0f;
        float actual = lightSaber.getCharge();
        assertEquals(expected,actual);
    }
}
