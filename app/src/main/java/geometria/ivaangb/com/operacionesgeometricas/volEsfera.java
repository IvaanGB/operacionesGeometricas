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
        double radio, volumen;
        radio = Double.parseDouble(txtRadio.getText().toString());

        volumen= (4*Math.PI*Math.pow(radio, 3))/3;
        volumen = metodos.truncarDecimales(volumen);
        metodos.alert(this, recursos.getString(R.string.ttlVolEsfera),
                recursos.getString(R.string.volRes)+": "+volumen+ recursos.getString(R.string.cm3));

        opOperaciones op = new opOperaciones( recursos.getString(R.string.opVolCilindro),
                recursos.getString(R.string.radio)+": "+radio, ""+volumen+recursos.getString(R.string.cm3));
        op.guardar();

        metodos.borrar(txtRadio);
    }

    public void borrar (View v){
        metodos.borrar(txtRadio);
    }


}
