package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class volCilindro extends AppCompatActivity {
    private EditText txtAltura, txtRadio;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol_cilindro);

        txtAltura = findViewById(R.id.txtAlturaCilindro);
        txtRadio = findViewById(R.id.txtRadioCilindro);
        recursos = getResources();
    }

    public void volumenCilindro (View v) {

        if (metodos.validar(txtRadio, recursos.getString(R.string.error))
                && metodos.validar(txtAltura, recursos.getString(R.string.error))) {

        double altura, radio, volumen;
        altura = Double.parseDouble(txtAltura.getText().toString());
        radio = Double.parseDouble(txtRadio.getText().toString());

        volumen = formulas.volumenCilindro(radio, altura);
        metodos.alert(this,
                ""+recursos.getString(R.string.ttlVCilindro),
                ""+recursos.getString(R.string.resVolumen) + ": " + volumen + recursos.getString(R.string.cm3));

        opOperaciones op = new opOperaciones(
                ""+recursos.getString(R.string.ttlVCilindro),
                ""+recursos.getString(R.string.altura)+": "+altura+"\n"+ recursos.getString(R.string.radio) + ": " + radio,
                ""+volumen + recursos.getString(R.string.cm3));
        op.guardar();

        metodos.borrar(txtAltura);
        metodos.borrar(txtRadio);
        }
    }

    public void borrar (View v){
        metodos.borrar(txtAltura);
        metodos.borrar(txtRadio);
    }



}
