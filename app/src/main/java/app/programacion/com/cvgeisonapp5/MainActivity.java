package app.programacion.com.cvgeisonapp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincipal, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.datospersonales:
                ejecutarDP(null);

                return true;
            case R.id.estudiosrealizados:
                ejecutarER(null);

                return true;
            case R.id.experiencialaboral:
                ejecutarEL(null);
                return true;

            case R.id.referenciaspersonales:
                ejecutarRP(null);
                return true;

            case R.id.acercadeusted:
                ejecutarAU(null);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void ejecutarDP (View view){
        Intent intent = new Intent(this, Datos_Personales.class);
        startActivity(intent);
    }

    public void ejecutarER (View view){
        Intent intent = new Intent(this, Estudios_Realizados.class);
        startActivity(intent);
    }

    public void ejecutarEL (View view){
        Intent intent = new Intent(this, Experiencia_Laboral.class);
        startActivity(intent);
    }

    public void ejecutarRP (View view){
        Intent intent = new Intent(this, Referencias_Personales.class);
        startActivity(intent);
    }

    public void ejecutarAU (View view){
        Intent intent = new Intent(this, Acerca_de_Usted.class);
        startActivity(intent);
    }


}
