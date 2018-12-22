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

public class AverageResult extends Activity {
	
	TextView averageTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_average_result);
		
		averageTextView= (TextView) findViewById(R.id.AverageResultID);
		
		Intent getAverageResult=getIntent();
		
		float averageFinalResult=getAverageResult.getFloatExtra("Average", 0);
		
		
		
		if(averageFinalResult==4.00)
		{
			averageTextView.setText("Hurrah! Congrats!\nYou've Average 'A+' grade.\nYour Average CGPA is: "+averageFinalResult+"\nYour are a genius.");
		}
		else if(averageFinalResult>=3.75 && averageFinalResult<=3.99)
		{
			averageTextView.setText("Congrats!\nYou've Average 'A' grade.\nYour Average CGPA is: "+averageFinalResult+"\nKeep It Up.");
		}
		else if(averageFinalResult>=3.50 && averageFinalResult<=3.74)
		{
			averageTextView.setText("Congrats!\nYou've Average 'A-' grade.\nYour Average CGPA is: "+averageFinalResult+"\nTry To Best.");
		}
		else if(averageFinalResult>=3.25 && averageFinalResult<=3.49)
		{
			averageTextView.setText("You've Avarage 'B+' grade.\nYour Average CGPA is: "+averageFinalResult+"\nTry To Best");
		}
		else if(averageFinalResult>=3.00 && averageFinalResult<=3.24)
		{
			averageTextView.setText("You've Average 'B' grade.\nYour Average CGPA is: "+averageFinalResult);
		}
		else if(averageFinalResult>=2.75 && averageFinalResult<=2.99)
		{
			averageTextView.setText("You've Average 'B-' grade.\nYour Average CGPA is: "+averageFinalResult+"\nDon't be hopeless!\nDo Something!");
		}
		else if(averageFinalResult>=2.50 && averageFinalResult<=2.74)
		{
			averageTextView.setText("You've Average 'C+' grade.\nYour Average CGPA is: "+averageFinalResult+"\nTry More And More!");
		}
		else if(averageFinalResult>=2.25 && averageFinalResult<=2.49)
		{
			averageTextView.setText("You've Average 'C' grade.\nYour Average CGPA is: "+averageFinalResult+"\nFeelling shame!");
		}
		else if(averageFinalResult>=2.00 && averageFinalResult<=2.24)
		{
			averageTextView.setText("You've Average 'D' grade.\nYour Average CGPA is: "+averageFinalResult+"\nFeelling shame!");
		}
		else
		{
			averageTextView.setText("Sorry! You've failed.\nYour CGPA is: "+"0.00."+"\nFeelling double shame!");
		}
		
		DisplayMetrics displayMetrics=new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		
		int width=displayMetrics.widthPixels;
		int height=displayMetrics.heightPixels;
		
		getWindow().setLayout((int)(width*.8), (int)(height*.5));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.average_result, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(AverageResult.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(AverageResult.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent credit=new Intent(AverageResult.this, DeveloperActivity.class);
			startActivity(credit);
			
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(AverageResult.this);
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
