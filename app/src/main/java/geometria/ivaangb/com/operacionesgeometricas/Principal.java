package geometria.ivaangb.com.operacionesgeometricas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lvPrincipal;
    private String [] opPrincipal;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lvPrincipal = findViewById(R.id.lstOpciones);
        opPrincipal = getResources().getStringArray(R.array.lvPrincipal);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, opPrincipal);

        lvPrincipal.setAdapter(adapter);
        lvPrincipal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Principal.this, lvArea.class);
                        startActivity(in);
                        break;

                    case 1:
                        in = new Intent(Principal.this, lvVolumen.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(Principal.this, opRealizadas.class);
                        startActivity(in);
                        break;
                }
            }
        });

    }
}
