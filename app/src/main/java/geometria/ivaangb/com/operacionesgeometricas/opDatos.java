package geometria.ivaangb.com.operacionesgeometricas;

import java.util.ArrayList;

/**
 * Created by ivang on 15/4/2018.
 */

public class opDatos {

    private static ArrayList<opOperaciones> operaciones = new ArrayList<>();

    public static void guardar(opOperaciones op){
        operaciones.add(op);
    }

    public static ArrayList<opOperaciones> obtener(){
        return operaciones;
    }

}
