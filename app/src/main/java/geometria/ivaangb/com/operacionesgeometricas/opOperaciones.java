package geometria.ivaangb.com.operacionesgeometricas;

/**
 * Created by ivang on 15/4/2018.
 */

public class opOperaciones {
    private String operacion, datos, resultado;

    public opOperaciones(String operacion, String datos, String resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        opDatos.guardar(this);
    }
}
