package day3of100days.app.abdccassiano.com.day3of100days;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner sprLeng;
    private Button btnLeng;
    private TextView tvSelect;
    private ImageView imgIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sprLeng = (Spinner)findViewById(R.id.spinner1);
        btnLeng = (Button)findViewById(R.id.btnLeng);
        tvSelect = (TextView)findViewById(R.id.tvSelect);
        imgIcon = (ImageView)findViewById(R.id.imgIcon);

        btnLeng.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLeng:
                String option = sprLeng.getSelectedItem().toString();
                if (option.equals("SELECT LENGUAGE")){
                    Toast.makeText(getApplication(),"Select One Option Please!", Toast.LENGTH_SHORT).show();
                }else{

                    tvSelect.setText(option);
                    switch (option){
                        case "PHP":
                            imgIcon.setImageResource(R.drawable.php);
                            break;
                        case "JAVASCRIPT":
                            imgIcon.setImageResource(R.drawable.js);
                            break;
                        case "PYTHON":
                            imgIcon.setImageResource(R.drawable.py);
                            break;
                        case "JAVA":
                            imgIcon.setImageResource(R.drawable.java);
                            break;
                        case "RUBY":
                            imgIcon.setImageResource(R.drawable.ruby);
                            break;
                        case "PERL":
                            imgIcon.setImageResource(R.drawable.perl);
                            break;
                        case "C++":
                            imgIcon.setImageResource(R.drawable.cmas);
                            break;
                        case "C#":
                            imgIcon.setImageResource(R.drawable.cchar);
                            break;
                        case "PASCAL":
                            imgIcon.setImageResource(R.drawable.pascal);
                            break;
                        case "C":
                            imgIcon.setImageResource(R.drawable.c);
                            break;
                        default:
                            break;
                    }

                    //Toast.makeText(getApplication(),"Contenido "+ v.getId(), Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(getApplication(),"Contenido "+ option, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu, this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.spinner_ex1, menu);
        return true;
    }*/
}
