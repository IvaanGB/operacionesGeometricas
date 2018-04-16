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

    public void volumenCubo (View v) {

        if (metodos.validar(txtLado, recursos.getString(R.string.error))){

        Double lado, area;
        lado = Double.parseDouble(txtLado.getText().toString());

        area = formulas.volumenCubo(lado);

        metodos.alert(this,
                "" + recursos.getString(R.string.ttlVCubo),
                "" + recursos.getString(R.string.resVolumen) + ": " + area + recursos.getString(R.string.cm3));

        opOperaciones op = new opOperaciones(
                "" + recursos.getString(R.string.ttlVCubo),
                recursos.getString(R.string.lado) + ": " + lado,
                "" + area + recursos.getString(R.string.cm3));
        op.guardar();

        metodos.borrar(txtLado);
    }

    }

    public void borrar (View v){
        metodos.borrar(txtLado);
    }

}


