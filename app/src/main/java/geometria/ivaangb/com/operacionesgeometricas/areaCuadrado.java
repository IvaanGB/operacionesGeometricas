package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areaCuadrado extends AppCompatActivity {
    private EditText lado;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cuadrado);

        lado = findViewById(R.id.txtAreaCuadrado);
        recursos = getResources();
    }

    public void areaCuadrado (View v){
        Double medida, area;
        medida = Double.parseDouble(lado.getText().toString());

        area = medida*medida;
        area = metodos.truncarDecimales(area);

        metodos.alert(this, recursos.getString(R.string.ttlAreaCuadrado),
                recursos.getString(R.string.resArea)+": "+area+
        recursos.getString(R.string.cm2));

        opOperaciones op = new opOperaciones( recursos.getString(R.string.opAreaCuadrado),
                recursos.getString(R.string.opCuadrado)+": "+area, ""+area+recursos.getString(R.string.cm2));
        op.guardar();

        metodos.borrar(lado);

    }

    public void borrar (View v){
        borrar(lado);
    }

}
