package geometria.ivaangb.com.operacionesgeometricas;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.EditText;

/**
 * Created by ivang on 15/4/2018.
 */

public class metodos {

    public static void alert(final Context main, String titulo, String mensaje){
        AlertDialog alertDialog = new AlertDialog.Builder(main).create();
        alertDialog.setTitle(titulo);
        alertDialog.setMessage(mensaje);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public static double truncarDecimales(Double resultado){
        return resultado = (double)Math.round(resultado*100d)/100d;
    }

    public static boolean validar(EditText texto, String error){
        if (texto.getText().toString().isEmpty() || texto.getText().toString().equals(".")){
            texto.requestFocus();
            texto.setError(error);
            return false;
        }
        return true;
    }

    public static void borrar (EditText texto){
        texto.setText("");
    }
}
