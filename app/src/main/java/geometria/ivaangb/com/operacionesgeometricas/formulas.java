package geometria.ivaangb.com.operacionesgeometricas;

/**
 * Created by ivang on 15/4/2018.
 */

public class formulas {

    public static double areaCirculo(Double radio){
        Double area;

        area = Math.PI * (Math.pow(radio, 2));
        area = metodos.truncarDecimales(area);

        return area;
    }

    public static double areaCuadrado(Double lado){
        Double area;
        area = lado*lado;
        area = metodos.truncarDecimales(area);
        return area;
    }

    public static double areaRectangulo(Double base, Double altura){
        Double area;
        area = base*altura;

        area = metodos.truncarDecimales(area);
        return area;
    }

    public static double areaTriangulo(Double base, Double altura){
        Double area;
        area = (base*altura)/2;

        area = metodos.truncarDecimales(area);
        return area;
    }

    public static double volumenCilindro(Double radio, Double altura){
        Double volumen;
        volumen= Math.PI* Math.pow(radio,2)*altura;

        volumen = metodos.truncarDecimales(volumen);

        return volumen;
    }

    public static double volumenCono(Double radio, Double altura){
        Double volumen;
        volumen= (Math.PI* Math.pow(radio,2)*altura)/3;

        volumen = metodos.truncarDecimales(volumen);

        return volumen;
    }


    public static double volumenCubo(Double lado){
        Double volumen;
        volumen = lado*lado*lado;
        volumen = metodos.truncarDecimales(volumen);
        return volumen;
    }

    public static double volumenEsfera(Double radio){
        Double volumen;
        volumen = (4*Math.PI*Math.pow(radio, 3))/3;

        volumen = metodos.truncarDecimales(volumen);
        return volumen;
    }



}
