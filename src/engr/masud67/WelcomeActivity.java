package engr.masud67;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


import android.widget.TextView;

public class WelcomeActivity extends Activity {
	
	
	Button cgpaButton,expectedButton;
	TextView welcomeTextWiew;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		
		
		
		cgpaButton=(Button) findViewById(R.id.cgpaButton);
		expectedButton=(Button) findViewById(R.id.expectedButton);
		
		
		cgpaButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentSubject=new Intent(WelcomeActivity.this, CalculateCGPA.class);
				startActivity(intentSubject);

			}
		});
		
		expectedButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent expected=new Intent(WelcomeActivity.this, ChoiceActivity.class);
				startActivity(expected);
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(WelcomeActivity.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(WelcomeActivity.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent intentCredit= new Intent(WelcomeActivity.this, DeveloperActivity.class);
			startActivity(intentCredit);
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(WelcomeActivity.this);
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
