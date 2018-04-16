package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areaCuadrado extends AppCompatActivity {
    private EditText txtlado;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cuadrado);

        txtlado = findViewById(R.id.txtAreaCuadrado);
        recursos = getResources();
    }

    public void areaCuadrado (View v){
        if (metodos.validar(txtlado,recursos.getString(R.string.error))) {
            Double lado, area;
            lado = Double.parseDouble(txtlado.getText().toString());

            area = formulas.areaCuadrado(lado);

            metodos.alert(this,
                    "" + recursos.getString(R.string.ttlACuadrado),
                    recursos.getString(R.string.resArea) + ": " + area + recursos.getString(R.string.cm2));

            opOperaciones op = new opOperaciones(
                    "" + recursos.getString(R.string.ttlACuadrado),
                    recursos.getString(R.string.lado) + lado,
                    "" + area + recursos.getString(R.string.cm2));
            op.guardar();

            metodos.borrar(txtlado);
        }

    }

    public void borrar (View v){
        metodos.borrar(txtlado);
    }

}
