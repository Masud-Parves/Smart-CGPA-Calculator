package engr.masud67;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ExpectedResultActivity extends Activity {
	
	TextView expectedResultTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expected_result_activity);
		
		expectedResultTextView=(TextView) findViewById(R.id.ExpectedResultID);
		
		float expectedFinalResult=0;
		float expected=0;
		
		try {
			Intent getExpectedResult=getIntent();
			expectedFinalResult=getExpectedResult.getFloatExtra("resultExpected", 0);
			expected=getExpectedResult.getFloatExtra("Expected", 0);
			
		} catch (Exception e) {
			expected=0;
			expectedFinalResult=0;
		}
		
		
		
		try {
			if(expectedFinalResult>4.00)
			{
				expectedResultTextView.setText("Sorry! Your expectation is illigal.\nTo obtain "+expected+" you need more than 4.00 point.\nThis is impassible.");

			}
			else
			{
				expectedResultTextView.setText("To obtain "+expected+" You need additional "+expectedFinalResult+"\nin the next each semester.\nAll The Best!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		DisplayMetrics displayMetrics=new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		
		int width=displayMetrics.widthPixels;
		int height=displayMetrics.heightPixels;
		
		getWindow().setLayout((int)(width*.8), (int)(height*.5));
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.expected_result, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(ExpectedResultActivity.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(ExpectedResultActivity.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent credit=new Intent(ExpectedResultActivity.this, DeveloperActivity.class);
			startActivity(credit);
			
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(ExpectedResultActivity.this);
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
