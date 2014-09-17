package app.buusk.resume_55410336;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity  implements OnClickListener {
	private Button btn1, btn2, btn3;
	private TextView txt4, txt5, txt6;
	private String show1,show2,show3;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMatching();
	}
	private void ViewMatching() {
	btn1 = (Button) findViewById(R.id.btnEdit);
	btn2 = (Button) findViewById(R.id.btnimg);
	btn3 = (Button) findViewById(R.id.btnInsert);
	
	btn1.setOnClickListener(this);
	btn2.setOnClickListener(this);
	btn3.setOnClickListener(this);
	
	txt4 = (TextView) findViewById(R.id.txtn);
	txt5 = (TextView) findViewById(R.id.txtu);
	txt6 = (TextView) findViewById(R.id.txtf);
	
	//txt4.setText("Kanyawee Chusathan");
	//txt5.setText("Burapha");
	//txt6.setText("Business Computer");
	
	show1 = getIntent().getStringExtra("txtN");
	show2 = getIntent().getStringExtra("txtU");
	show3 = getIntent().getStringExtra("txtF");
	
	txt4.setText(show1);
	txt5.setText(show2);
	txt6.setText(show3);
		}
	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnEdit:
		Intent i = new Intent(getApplicationContext(), EditActivity.class);
		startActivity(i);
		break;
	case R.id.btnimg:
		Intent j = new Intent(getApplicationContext(), imageActivity.class);
		startActivity(j);
		break;
	case R.id.btnInsert:
		Intent k = new Intent(getApplicationContext(), AddActivity.class);
		startActivity(k);
		break;
		
		default:
		break;
		}
		}
		}
	