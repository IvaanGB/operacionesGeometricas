package geometria.ivaangb.com.operacionesgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areaRectangulo extends AppCompatActivity {
    private EditText txtBase, txtAltura;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_rectangulo);

        txtBase = findViewById(R.id.txtBaseRectangulo);
        txtAltura = findViewById(R.id.txtAlturaRectangulo);
        recursos = getResources();
    }

    public void areaRectangulo (View v){
        double base, altura, area;
        base = Double.parseDouble(txtBase.getText().toString());
        altura = Double.parseDouble(txtAltura.getText().toString());
        area = base*altura;

        area = metodos.truncarDecimales(area);
        metodos.alert(this,recursos.getString(R.string.ttlAreaRectangulo),
                recursos.getString(R.string.resArea)+": "+area+ recursos.getString(R.string.cm2));

        opOperaciones op = new opOperaciones( recursos.getString(R.string.opAreaRectangulo),
                recursos.getString(R.string.base)+": "+base+ "\n" +
                recursos.getString(R.string.altura)+": "+altura, ""+area+recursos.getString(R.string.cm2));
        op.guardar();

        metodos.borrar(txtAltura);
        metodos.borrar(txtBase);
    }

    public void borrar (View v){
        metodos.borrar(txtAltura);
        metodos.borrar(txtBase);
    }

}
