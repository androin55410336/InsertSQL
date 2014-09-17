package app.buusk.resume_55410336;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 
public class EditActivity extends Activity implements OnClickListener{
	private Button btnsubmit;
	private EditText etxt1, etxt2, etxt3;
	private String txt4, txt5, txt6;
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.editresume);
		super.onCreate(savedInstanceState);
		ViewMatching();
	}
	private void ViewMatching() {
		btnsubmit = (Button) findViewById(R.id.btnSave3);
		btnsubmit.setOnClickListener(this); 
		etxt1 = (EditText) findViewById(R.id.edtName);
		etxt2 = (EditText) findViewById(R.id.edtUniversity);
		etxt3 = (EditText) findViewById(R.id.edtFaculty);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnSave3:
		txt4 = (etxt1.getText().toString());
		txt5 = (etxt2.getText().toString());
		txt6 = (etxt3.getText().toString());
		Intent R = new Intent(getApplicationContext(), MainActivity.class);
		R.putExtra("txtN", txt4);
		R.putExtra("txtU", txt5);
		R.putExtra("txtF", txt6);
		startActivity(R);
		break;
		default:
		break;
	}
	}
}

		