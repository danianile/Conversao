import com.company.Conversao;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversaoTests {

    @Test
    //Conversão de Celsius para Kelvin
    public void testCelsiusKelvin() {
        int tempCelsius = 1;
        int tempKelvin = Conversao.celsiusKelvin(tempCelsius);
        assertEquals(274, tempKelvin,0.01);
    }

    @Test
    //Conversão de Kelvin para Celsius
    public void testKelvinCelsius() {
        int tempKelvin = 274;
        int tempCelsius = Conversao.kelvinCelsius(tempKelvin);
        assertEquals(1, tempCelsius,0.01);
    }

    @Test
    //Conversão de Metro por segundo para Quilômetro por hora
    public void testMetroKm() {
        double valorMetro = 3;
        double valorKm = Conversao.metroKm(valorMetro);
        assertEquals(10.8, valorKm,0.01);
    }

    @Test
    //Conversão de Quilômetro por hora para Metro por segundo
    public void testKmMetro() {
        double valorKm = 10.8;
        double valorMetro = Conversao.kmMetro(valorKm);
        assertEquals(3.0, valorMetro,0.01);
    }

    @Test
    //Conversão de Metro para Centimetro
    public void testMetroCm() {
        double valorMetro = 1.5;
        double valorCm = Conversao.metroCm(valorMetro);
        assertEquals(150.0, valorCm,0.01);
    }

    @Test
    //Conversão de Centimetro para Metro
    public void testCmMetro() {
        double valorCm = 150.0;
        double valorMetro = Conversao.cmMetro(valorCm);
        assertEquals(1.5, valorMetro,0.01);
    }

    @Test
    //Conversão de Segundo para Minuto
    public void testSegMin() {
        double valorSeg = 30;
        double valorMin = Conversao.segMin(valorSeg);
        assertEquals(0.5, valorMin,0.01);
    }

    @Test
    //Conversão de Segundo para Minuto
    public void testMinSeg() {
        double valorMin = 2;
        double valorSeg = Conversao.minSeg(valorMin);
        assertEquals(120, valorSeg,0.01);
    }
}
