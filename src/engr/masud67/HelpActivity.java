package engr.masud67;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.help, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(HelpActivity.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(HelpActivity.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent credit=new Intent(HelpActivity.this, DeveloperActivity.class);
			startActivity(credit);
			
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(HelpActivity.this);
			builder.setMessage("Are you sure you want to exit?");
			builder.setTitle("EXIT");
			
			builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialogInterface, int i) {
					dialogInterface.cancel();
					
				}
			});
			builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialogInterface, int i) {
					finish();
					
				}
			});
			AlertDialog alertdialog = builder.create();
			alertdialog.show();
	
			break;	

		default:
			break;
		}

		return super.onOptionsItemSelected(item);
		
	}


}
