package pec.test.todolist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ToDoListActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_to_do_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.to_do_list,menu);
		return true;
	}
//test git 07
}
