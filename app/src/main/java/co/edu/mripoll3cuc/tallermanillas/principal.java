package co.edu.mripoll3cuc.tallermanillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class principal extends AppCompatActivity {

    private TextView total, subtotal;
    private EditText cantidad;
    private Spinner material, dije, tipo, moneda;
    private Resources resources;
    private String[] materiales;
    private String[] dijes;
    private String[] tipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        subtotal = (TextView) findViewById(R.id.lblVlrUnidad);
        total = (TextView) findViewById(R.id.lblVlrTotal);
        cantidad = (EditText) findViewById(R.id.txtCantidad);
        material = (Spinner) findViewById(R.id.cmbMaterial);
        dije = (Spinner) findViewById(R.id.cmbDije);
        tipo = (Spinner) findViewById(R.id.cmbTipo);
        moneda = (Spinner) findViewById(R.id.cmbMoneda);

        resources = this.getResources();

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.materiales, android.R.layout.simple_spinner_item);
        material.setAdapter(adapter);


        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.dijes, android.R.layout.simple_spinner_item);
        dije.setAdapter(adapter1);

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.tipos, android.R.layout.simple_spinner_item);
        tipo.setAdapter(adapter2);

        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.monedas, android.R.layout.simple_spinner_item);
        moneda.setAdapter(adapter3);
    }

    public void calcular (View v){

        int opcionMaterial, opcionDije, opcionTipo, opcionMoneda;
        double vlrTotal = 0, vlrUnidad = 0,cant = 0;

        if (validar()) {

            opcionMaterial = material.getSelectedItemPosition();
            opcionDije = dije.getSelectedItemPosition();
            opcionTipo = tipo.getSelectedItemPosition();
            opcionMoneda = moneda.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());

            switch (opcionMaterial){
                case 0:
                    switch (opcionDije){
                        case 0:
                            switch (opcionTipo) {
                                case 0:
                                    switch (opcionMoneda) {
                                        case 0:
                                            vlrUnidad = 100;
                                            vlrTotal = vlrUnidad * cant;
                                            break;
                                        case 1:
                                            vlrUnidad = 100;
                                            vlrTotal = vlrUnidad * cant;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 80;
                                            vlrTotal = vlrUnidad * cant;
                                            break;
                                        case 1:
                                            vlrUnidad = 80;
                                            vlrTotal = vlrUnidad * cant;
                                            vlrTotal =  vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 70;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 70;
                                            vlrTotal = cant *vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 1:
                            switch (opcionTipo) {
                                case 0:
                                    switch (opcionMoneda) {
                                        case 0:
                                            vlrUnidad = 120;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 120;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda) {
                                        case 0:
                                            vlrUnidad = 100;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 100;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 90;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 90;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                            }
                    }
                    break;
                case 1:
                    switch (opcionDije){
                        case 0:
                            switch (opcionTipo){
                                case 0:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 90;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 90;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 70;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 70;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda) {
                                        case 0:
                                            vlrUnidad = 50;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 50;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }

                            }
                            break;
                        case 1:
                            switch (opcionTipo){
                                case 0:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 110;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 110;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            vlrUnidad = 90;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrUnidad = 90;
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda) {
                                        case 0:
                                            vlrUnidad = 80;
                                            vlrTotal = cant * vlrUnidad;
                                            break;
                                        case 1:
                                            vlrTotal = cant * vlrUnidad;
                                            vlrTotal = vlrTotal * 3200;
                                            break;
                                    }
                            }
                    }
                    break;
            }

            subtotal.setText(" = $" + vlrUnidad);
            total.setText(" = $"  + vlrTotal);
        }
    }

    public boolean validar(){
        if(cantidad.getText().toString().isEmpty()){
            cantidad.setError(this.getResources().getString(R.string.mensajeError1));
            cantidad.requestFocus();
            return false;

        }
        if(Double.parseDouble( cantidad.getText().toString())==0){
            cantidad.requestFocus();
            cantidad.setError(this.getResources().getString(R.string.mensjaeError2));
            return false;
        }

        return true;
    }

    public void limpiar(View v){
        subtotal.setText("");
        total.setText("");
        cantidad.setText("");
        cantidad.requestFocus();
    }

}
