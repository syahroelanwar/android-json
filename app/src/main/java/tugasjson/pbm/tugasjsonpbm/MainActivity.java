package tugasjson.pbm.tugasjsonpbm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button lJson;
    public static TextView showJson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lJson = (Button) findViewById(R.id.loadJSON);
        showJson = (TextView) findViewById(R.id.shjson);

        lJson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                parseDataJson prosesJson = new parseDataJson();
                prosesJson.execute();
            }
        });
    }
}
