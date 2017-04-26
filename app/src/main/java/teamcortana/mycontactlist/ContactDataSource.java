package teamcortana.mycontactlist;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


public class ContactDataSource {

    private SQLiteDatabase database; //1
    private ContactDBHelper dbHelper;
    public ContactDataSource(Context context) { //2 dbHelper = new ContactDBHelper(context);
    }
    public void open() throws SQLException { //3 database = dbHelper.getWritableDatabase();
    }
    public void close() { //4 dbHelper.close();
    }
}