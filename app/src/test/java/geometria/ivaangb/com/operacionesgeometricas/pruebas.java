package geometria.ivaangb.com.operacionesgeometricas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ivang on 16/4/2018.
 */

public class pruebas {


    @Test
    public void areaCirculo(){
        assertEquals(12.57, formulas.areaCirculo(2.0),0.0);
    }

    @Test
    public void areaCuadrado(){
        assertEquals(9.0, formulas.areaCuadrado(3.0),0.0);
    }

    @Test
    public void areaRectangulo(){
        assertEquals(40.0, formulas.areaRectangulo(5.0, 8.0),0.0);
    }

    @Test
    public void areaTriangulo(){
        assertEquals(21.0, formulas.areaTriangulo(6.0, 7.0),0.0);
    }

    @Test
    public void volumenCilindo(){
        assertEquals(549.78, formulas.volumenCilindro(5.0, 7.0), 0.0);
    }

    @Test
    public void volumenCono(){
        assertEquals(117.29, formulas.volumenCono(4.0, 7.0), 0.0);
    }

    @Test
    public void volumenCubo(){
        assertEquals(64.0, formulas.volumenCubo( 4.0), 0.0);
    }

    @Test
    public void volumenEsfera(){
        assertEquals(523.6, formulas.volumenEsfera(5.0), 0.0);
    }
}
