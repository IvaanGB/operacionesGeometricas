package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areaCirculo extends AppCompatActivity {
    private static EditText txtRadio;
    private static Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);

        txtRadio = findViewById(R.id.txtRadioCirculo);
        recursos = getResources();
    }

    public void areaCirculoC(View v){
        if (metodos.validar(txtRadio, recursos.getString(R.string.error))) {
            Double radio, area;
            radio = Double.parseDouble(txtRadio.getText().toString());
            area = formulas.areaCirculo(radio);
            metodos.alert(this,
                    "" + recursos.getString(R.string.ttlACirculo),
                    recursos.getString(R.string.resArea)+" " + area + recursos.getString(R.string.cm2));

            opOperaciones op = new opOperaciones(
                    "" + recursos.getString(R.string.ttlACirculo),
                    recursos.getString(R.string.radio) + radio,
                    area + recursos.getString(R.string.cm2));
            op.guardar();

            metodos.borrar(txtRadio);

        }
    }

    public void borrar(View v){
        metodos.borrar(txtRadio);
    }
}
