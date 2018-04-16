package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class volEsfera extends AppCompatActivity {
    private static EditText txtRadio;
    private static Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol_esfera);

        txtRadio = findViewById(R.id.txtRadioEsfera);
        recursos = getResources();
    }

    public void volumenEsfera (View v){
        if (metodos.validar(txtRadio, recursos.getString(R.string.error))) {
            double radio, volumen;
            radio = Double.parseDouble(txtRadio.getText().toString());
            volumen = formulas.volumenEsfera(radio);

            metodos.alert(this,
                    ""+recursos.getString(R.string.ttlVEsfera),
                    ""+recursos.getString(R.string.resVolumen) + ": " + volumen + recursos.getString(R.string.cm3));

            opOperaciones op = new opOperaciones(
                    ""+recursos.getString(R.string.ttlVEsfera),
                    recursos.getString(R.string.radio) + ": " + radio,
                    "" + volumen + recursos.getString(R.string.cm3));
            op.guardar();

            metodos.borrar(txtRadio);
        }
    }

    public void borrar (View v){
        metodos.borrar(txtRadio);
    }


}
