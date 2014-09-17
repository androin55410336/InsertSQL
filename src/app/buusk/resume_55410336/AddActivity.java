package app.buusk.resume_55410336;

import java.security.PublicKey;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class AddActivity extends Activity {
	private EditText edtN, edtU, edtF;
	private Button btn_save;
	public void onCreate(Bundle saveInstanceState){
		super.onCreate(saveInstanceState);
		setContentView(R.layout.activity_add);
		
		 edtN = (EditText) findViewById(R.id.edt1);
		 edtU = (EditText) findViewById(R.id.edt2);
		 edtF = (EditText) findViewById(R.id.edt3);
		 
		 btn_save = (Button) findViewById(R.id.btnsaveadd);
		 
		 btn_save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//if(SaveData())
				//{
				//	Intent newActivity =new Intent(AddActivity.this, MainActivity.class);
				//	startActivity(newActivity);
				//}
				if (v == btn_save) 
					SaveData();
				Intent newActivity =new Intent(AddActivity.this, MainActivity.class);
				startActivity(newActivity);				
			}
		});
	}
		
		public boolean SaveData()
		{
			  
			
			final AlertDialog.Builder adb = new AlertDialog.Builder(this);
			AlertDialog ad = adb.create();
			
			if (edtN.getText().length() == 0) {
				ad.setMessage("Please input Name");
				ad.show();
				edtN.requestFocus();
				return false;
			}
			if (edtU.getText().length() == 0) {
				ad.setMessage("Please input Name");
				ad.show();
				edtU.requestFocus();
				return false;
			}
			if (edtF.getText().length() == 0) {
				ad.setMessage("Please input Name");
				ad.show();
				edtF.requestFocus();
				return false;
			}
			
			 myDBClass myDB = new myDBClass(this);
			
			long savedata = myDB.InsertData(edtN.getText().toString(),
					edtU.getText().toString(),edtF.getText().toString());
			
			if (savedata <= 0) {
				ad.setMessage("Error");
				ad.show();
				return false;
			}
			
			Toast.makeText(AddActivity.this, "Add Data Successfully",
					Toast.LENGTH_SHORT).show();
			return true;
			 
			
		}

		}