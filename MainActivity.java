import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText numero1;
    EditText numero2;
    TextView result = (TextView) findViewById(R.id.result);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText) findViewById(R.id.num1);
        numero2 = (EditText) findViewById(R.id.num2);

        Button bsoma = (Button) findViewById(R.id.bsoma);
    }


    @Override
    public void onClick(View view) {
        double nume1, nume2,soma;

        nume1 = Double.parseDouble(numero1.getText().toString());
        nume2= Double.parseDouble(numero2.getText().toString());

        soma= nume2 + nume1;
        result.setText("O resultado é"+soma);
    }
}
