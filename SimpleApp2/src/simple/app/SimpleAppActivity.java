package simple.app;



import android.view.View;
//import com.powenko.myedittextapp.Button;
import android.view.View.OnClickListener;
//import com.powenko.myedittextapp.R;
//import com.powenko.myedittextapp.View;

//import com.powenko.myimageviewer.Intent;
//import com.powenko.myimageviewer.MainActivity;
//import com.powenko.myimageviewer.page2;
import android.content.Intent;
//import com.example.myapp.R;
//import com.example.myapp.TextView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class SimpleAppActivity extends Activity {
//public class SimpleAppActivity extends ActionBarActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ////
        final TextView mmyTextView=(TextView) findViewById(R.id.textView1);
    EditText mmyTextView2=(EditText) findViewById(R.id.editText1);
            Button button1=(Button) findViewById(R.id.button1);
    		button1.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					// TODO Auto-generated method stub
					mmyTextView.setText("sit you");
					mmyTextView.setText("sit 1111you");
					Intent intent = new Intent();
					intent.setClass(SimpleAppActivity.this, page2.class);
					startActivity(intent);
				//	finish(); 
				}

    			});
            
            

      //  mmyTextView.setText("How Are you");
      //  mmyTextView.setBackgroundColor(Color.RED);
      //  mmyTextView.setTextColor(Color.rgb(0, 255, 0));
       // mmyTextView.setHeight(100);
       // mmyTextView.setTextSize(20);
         mmyTextView2.setText("How Are you3");
        mmyTextView2.setBackgroundColor(Color.RED);
    
    }
}