package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class volCubo extends AppCompatActivity {
    private EditText txtLado;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol_cubo);

        txtLado = findViewById(R.id.txtLadoCubo);
        recursos = getResources();

    }

    public void volumenCubo (View v){
        Double medida, area;
        medida = Double.parseDouble(txtLado.getText().toString());

        area = medida*medida*medida;
        area = metodos.truncarDecimales(area);

        metodos.alert(this, recursos.getString(R.string.ttlVolCubo),
                recursos.getString(R.string.volRes)+": "+area+
                        recursos.getString(R.string.cm3));

        opOperaciones op = new opOperaciones( recursos.getString(R.string.opVolCubo),
                recursos.getString(R.string.txtLado)+": "+medida, ""+area+recursos.getString(R.string.cm2));
        op.guardar();

        metodos.borrar(txtLado);

    }

    public void borrar (View v){
        borrar(txtLado);
    }

}


