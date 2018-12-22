package engr.masud67;



import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ChoiceActivity extends Activity {
	
	
	EditText S1,S2,S3,S4,S5,S6,S7,S8,S9,S10,S11,ExpectedEditText;
	Button seeCGPAButton,seeExpectedButton;
	TextView expectedMainTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choice);
		
		S1=(EditText) findViewById(R.id.SemesterOneEditText);
		S1.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S2=(EditText) findViewById(R.id.SemesterTwoEditText);
		S2.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S3=(EditText) findViewById(R.id.SemesterThreeEditText);
		S3.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S4=(EditText) findViewById(R.id.SemesterFourEditText);
		S4.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S5=(EditText) findViewById(R.id.SemesterFiveEditText);
		S5.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S6=(EditText) findViewById(R.id.SemesterSixEditText);
		S6.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S7=(EditText) findViewById(R.id.SemesterSevenEditText);
		S7.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S8=(EditText) findViewById(R.id.SemesterEightEditText);
		S8.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S9=(EditText) findViewById(R.id.SemesterNineEditText);
		S9.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S10=(EditText) findViewById(R.id.SemesterTenEditText);
		S10.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		S11=(EditText) findViewById(R.id.SemesterElevenTextView);
		S11.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		ExpectedEditText= (EditText) findViewById(R.id.ExpectedEditText);
		ExpectedEditText.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		
		expectedMainTextView=(TextView) findViewById(R.id.EachSemesterNotic);
		
		seeCGPAButton=(Button) findViewById(R.id.seeCGPAButton);
		seeExpectedButton=(Button) findViewById(R.id.seeExpectedButton);
		
		seeCGPAButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View scB) {
				
				int SemesterNumber=0;
				float fS1=0,fS2=0,fS3=0,fS4=0,fS5=0,fS6=0,fS7=0,fS8=0,fS9=0,fS10=0,fS11=0;
					
					
					try{
						fS1=Float.parseFloat(S1.getText().toString());
						SemesterNumber=1;
						}
						catch (Exception e) {
							fS1=0;
							
						}
					try{
						fS2=Float.parseFloat(S2.getText().toString());
						SemesterNumber=2;
						}
						catch (Exception e) {
							fS2=0;
						}
					try{
						fS3=Float.parseFloat(S3.getText().toString());
						SemesterNumber=3;
						}
						catch (Exception e) {
							fS3=0;
						}
					try{
						fS4=Float.parseFloat(S4.getText().toString());
						SemesterNumber=4;
						}
						catch (Exception e) {
							fS4=0;
						}
					try{
						
						fS5=Float.parseFloat(S5.getText().toString());
						SemesterNumber=5;
						}
						catch (Exception e) {
							fS5=0;
						}
					try{
						
						fS6=Float.parseFloat(S6.getText().toString());
						SemesterNumber=6;
						}
						catch (Exception e) {
							fS6=0;
						}
					try{
						
						fS7=Float.parseFloat(S7.getText().toString());
						SemesterNumber=7;
						}
						catch (Exception e) {
							fS7=0;
						}
					try{
						
						fS8=Float.parseFloat(S8.getText().toString());
						SemesterNumber=8;
						}
						catch (Exception e) {
							fS8=0;
						}
					try{
						
						fS9=Float.parseFloat(S9.getText().toString());
						SemesterNumber=9;
						}
						catch (Exception e) {
							fS9=0;
						}
					try{
						
						fS10=Float.parseFloat(S10.getText().toString());
						SemesterNumber=10;
						}
						catch (Exception e) {
							fS10=0;
						}
					try{
						
						fS11=Float.parseFloat(S11.getText().toString());
						SemesterNumber=11;
						}
						catch (Exception e) {
							fS11=0;
						}
					
				float AverageCGPA=(fS1+fS2+fS3+fS4+fS5+fS6+fS7+fS8+fS9+fS10+fS11)/SemesterNumber;
				
				
				Intent resultAverage = new Intent(ChoiceActivity.this,AverageResult.class);
				resultAverage.putExtra("Average", AverageCGPA);
				startActivity(resultAverage);
				
				
				
			}
			
		});
		seeExpectedButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int SemesterNumber=0;
				float fS1=0,fS2=0,fS3=0,fS4=0,fS5=0,fS6=0,fS7=0,fS8=0,fS9=0,fS10=0,fS11=0;
				float ExpectedCGPA=0;	
					
					try{
						
						fS1=Float.parseFloat(S1.getText().toString());
						SemesterNumber=1;
						}
						catch (Exception e) {
							fS1=0;
							
						}
					try{
						
						fS2=Float.parseFloat(S2.getText().toString());
						SemesterNumber=2;
						}
						catch (Exception e) {
							fS2=0;
						}
					try{
						
						fS3=Float.parseFloat(S3.getText().toString());
						SemesterNumber=3;
						}
						catch (Exception e) {
							fS3=0;
						}
					try{
						
						fS4=Float.parseFloat(S4.getText().toString());
						SemesterNumber=4;
						}
						catch (Exception e) {
							fS4=0;
						}
					try{
						
						fS5=Float.parseFloat(S5.getText().toString());
						SemesterNumber=5;
						}
						catch (Exception e) {
							fS5=0;
						}
					try{
						
						fS6=Float.parseFloat(S6.getText().toString());
						SemesterNumber=6;
						}
						catch (Exception e) {
							fS6=0;
						}
					try{
						
						fS7=Float.parseFloat(S7.getText().toString());
						SemesterNumber=7;
						}
						catch (Exception e) {
							fS7=0;
						}
					try{
						
						fS8=Float.parseFloat(S8.getText().toString());
						SemesterNumber=8;
						}
						catch (Exception e) {
							fS8=0;
						}
					try{
						
						fS9=Float.parseFloat(S9.getText().toString());
						SemesterNumber=9;
						}
						catch (Exception e) {
							fS9=0;
						}
					try{
						
						fS10=Float.parseFloat(S10.getText().toString());
						SemesterNumber=10;
						}
						catch (Exception e) {
							fS10=0;
						}
					try{
						
						fS11=Float.parseFloat(S11.getText().toString());
						SemesterNumber=11;
						}
						catch (Exception e) {
							fS11=0;
						}
				
				try{
					
					 	ExpectedCGPA=Float.parseFloat(ExpectedEditText.getText().toString());
					}
					catch (Exception e) {
						ExpectedCGPA=0;
					}
				
				int ExtraSemester=12-SemesterNumber;
				float totalGetPoint=fS1+fS2+fS3+fS4+fS5+fS6+fS7+fS8+fS9+fS10+fS11;
				float extraRequiredPoint=ExpectedCGPA*12;
				float lastPoint=extraRequiredPoint-totalGetPoint;
				float FinalResult=lastPoint/ExtraSemester;
				Intent resultExpected = new Intent(ChoiceActivity.this,ExpectedResultActivity.class);
				resultExpected.putExtra("resultExpected", FinalResult);
				resultExpected.putExtra("Expected", ExpectedCGPA);
				startActivity(resultExpected);
				
			}
		});
		
		
		
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choice, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(ChoiceActivity.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(ChoiceActivity.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent credit=new Intent(ChoiceActivity.this, DeveloperActivity.class);
			startActivity(credit);
			
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(ChoiceActivity.this);
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
