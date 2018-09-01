package ph.edu.raphaelencarnacionust.labexer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class labexer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labexer2);

        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText numberEditText = (EditText) findViewById(R.id.numberEditText);

                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num = Integer.parseInt(numberEditText.getText().toString());
                int targetCount = 10;
                int currentCount = 0;

                while (targetCount < currentCount)
                {
                    if(num%2==0)
                    {
                        currentCount++;
                        resultTextView.setText("Even number: " + num);
                    }

                    num = num + 1;
                }


            }
        });












    }
}
