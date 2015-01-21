package th.ac.tu.siit.cholwich.lab1exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 /*   public void bottonClicked(View v) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("convert");
    }*/

    double var;
    double cel;
    public void calculate_click(View v) {

        EditText etInput = (EditText) findViewById(R.id.etInput);
        String s = etInput.getText().toString();

        Double d = Double.parseDouble(s);


        RadioGroup rgFrom = (RadioGroup) findViewById(R.id.rgFrom);
        int selFrom = rgFrom.getCheckedRadioButtonId();

        if (selFrom == R.id.rbFrmC) {
            cel = d;

        } else if (selFrom == R.id.rbFrmF) {
            cel = (d-32)*5.0/9.0;

        } else if (selFrom == R.id.rbFrmK) {
            cel = d-273.15;

        }


        RadioGroup rgTo= (RadioGroup) findViewById(R.id.rgTo);
        int selTo = rgTo.getCheckedRadioButtonId();

        if (selTo == R.id.rbToC) {
            var = cel;

        } else if (selTo == R.id.rbToF) {
            var = (cel*9.0/5.0)+32;

        } else if (selTo == R.id.rbToK) {
            var = cel+273.15;

        }

        TextView tv = (TextView)findViewById(R.id.tvOutput);
        tv.setText(Double.toString(var));

    }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
