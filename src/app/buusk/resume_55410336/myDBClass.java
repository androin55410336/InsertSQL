package app.buusk.resume_55410336;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class myDBClass extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "mydatabase";
	private static final String TABLE_MEMBER = "members";

	public myDBClass(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE "+ TABLE_MEMBER +
				"(MemberID INTEGER PRIMARY KEY AUTOINCREMENT," +
				" Name TEXT(100)," +
				" University TEXT(100)," +
				" Faculty TEXT(100));");
		
		Log.d("CREATE TABLE", "Create Table Sucsessfully.");
		
	}
	
	public long InsertData(String strName, String strUnv, String strFac) {
		try {
			SQLiteDatabase db;
			db =  this.getWritableDatabase(); // Write Data
			
			ContentValues Val = new ContentValues(); //Create Table
			Val.put("Name", strName); // "Name" >> Table Name
			Val.put("University", strUnv);
			Val.put("Faculty", strFac);
			
			long rows = db.insert(TABLE_MEMBER, null, Val);
			db.close();
			return rows;
			
		}catch (Exception e){
			return -1;
		}
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);
		onCreate(db);
			
	}

}
