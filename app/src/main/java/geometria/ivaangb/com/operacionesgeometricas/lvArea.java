package geometria.ivaangb.com.operacionesgeometricas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lvArea extends AppCompatActivity {

    private ListView lArea;
    private String [] opAreas;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_area);

        lArea = findViewById(R.id.lvArea);
        opAreas = getResources().getStringArray(R.array.areas);
        ArrayAdapter <String> adapterArea = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, opAreas);

        lArea.setAdapter(adapterArea);
        lArea.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        in = new Intent(lvArea.this, areaCuadrado.class);
                        startActivity(in);
                        break;

                    case 1:
                        in = new Intent(lvArea.this, areaRectangulo.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(lvArea.this, areaTriang.class);
                        startActivity(in);
                        break;

                    case 3:
                        in = new Intent(lvArea.this, areaCirculo.class);
                        startActivity(in);
                        break;
                }
            }
        });

    }




}
