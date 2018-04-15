package geometria.ivaangb.com.operacionesgeometricas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lvVolumen extends AppCompatActivity {
    private ListView lVolumen;
    private String [] opVolumen;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_volumen);

        lVolumen = findViewById(R.id.lvVolumen);
        opVolumen = getResources().getStringArray(R.array.volumenes);
        ArrayAdapter<String> adapterArea = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, opVolumen);

        lVolumen.setAdapter(adapterArea);
        lVolumen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        in = new Intent(lvVolumen.this, volEsfera.class);
                        startActivity(in);
                        break;

                    case 1:
                        in = new Intent(lvVolumen.this, volCilindro.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(lvVolumen.this, volCono.class);
                        startActivity(in);
                        break;

                    case 3:
                        in = new Intent(lvVolumen.this, volCubo.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}

