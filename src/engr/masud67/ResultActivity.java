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

public class ResultActivity extends Activity {
	
	TextView cgpaTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		cgpaTextView=(TextView) findViewById(R.id.cgpaResultTextView);

		Intent getResult=getIntent();
		
		float result=getResult.getFloatExtra("Result",0);
		
		if(result==4.00)
		{
			cgpaTextView.setText("Hurrah! Congrats!\nYou've Passed with 'A+' grade.\nYour CGPA is: "+result+"\nYour are a genius.");
		}
		else if(result>=3.75 && result<=3.99)
		{
			cgpaTextView.setText("Hurrah! Congrats!\nYou've Passed with 'A' grade.\nYour CGPA is: "+result+"\nYour are a genius.");
		}
		else if(result>=3.50 && result<=3.74)
		{
			cgpaTextView.setText("Hurrah! Congrats!\nYou've Passed with 'A-' grade.\nYour CGPA is: "+result+"\nYour are a talented.");
		}
		else if(result>=3.25 && result<=3.49)
		{
			cgpaTextView.setText("Congrats!\nYou've Passed with 'B+' grade.\nYour CGPA is: "+result);
		}
		else if(result>=3.00 && result<=3.24)
		{
			cgpaTextView.setText("Congrats!\nYou've Passed with 'B' grade.\nYour CGPA is: "+result);
		}
		else if(result>=2.75 && result<=2.99)
		{
			cgpaTextView.setText("You've Passed with 'B-' grade.\nYour CGPA is: "+result+"\nDon't be hopeless!\nCarry on your interesting subject.");
		}
		else if(result>=2.50 && result<=2.74)
		{
			cgpaTextView.setText("You've Passed with 'C+' grade.\nYour CGPA is: "+result+"\nFeelling shame!");
		}
		else if(result>=2.25 && result<=2.49)
		{
			cgpaTextView.setText("You've Passed with 'C' grade.\nYour CGPA is: "+result+"\nFeelling shame!");
		}
		else if(result>=2.00 && result<=2.24)
		{
			cgpaTextView.setText("You've Passed with 'D' grade.\nYour CGPA is: "+result+"\nFeelling shame!");
		}
		else
		{
			cgpaTextView.setText("Sorry! You've failed.\nYour CGPA is: "+"0.00."+"\nFeelling double shame!");
		}
		DisplayMetrics displayMetrics=new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		
		int width=displayMetrics.widthPixels;
		int height=displayMetrics.heightPixels;
		
		getWindow().setLayout((int)(width*.8), (int)(height*.5));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(ResultActivity.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(ResultActivity.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent credit=new Intent(ResultActivity.this, DeveloperActivity.class);
			startActivity(credit);
			
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(ResultActivity.this);
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
