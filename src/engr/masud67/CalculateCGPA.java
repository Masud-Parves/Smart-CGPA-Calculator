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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;




public class CalculateCGPA extends Activity {
	
	EditText C1,C2,C3,C4,C5,C6,C7,C8;
	EditText P1,P2,P3,P4,P5,P6,P7,P8;
	Button submitButton;
	TextView calculateTextView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculate_cgp);
		
		
		C1=(EditText) findViewById(R.id.creditOne);
		C1.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C2=(EditText) findViewById(R.id.creditTwo);
		C2.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C3=(EditText) findViewById(R.id.creditThree);
		C3.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C4=(EditText) findViewById(R.id.creditFour);
		C4.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C5=(EditText) findViewById(R.id.creditFive);
		C5.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C6=(EditText) findViewById(R.id.creditSix);
		C6.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C7=(EditText) findViewById(R.id.creditSeven);
		C7.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		C8=(EditText) findViewById(R.id.creditEight);
		C8.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "5")});
		
		P1 = (EditText) findViewById(R.id.pointOne);
		P1.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P2 = (EditText) findViewById(R.id.pointTwo);
		P2.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P3 = (EditText) findViewById(R.id.pointThree);
		P3.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P4 = (EditText) findViewById(R.id.pointFour);
		P4.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P5 = (EditText) findViewById(R.id.pointFive);
		P5.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P6 = (EditText) findViewById(R.id.pointSix);
		P6.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P7 = (EditText) findViewById(R.id.pointSeven);
		P7.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		P8 = (EditText) findViewById(R.id.pointEight);
		P8.setFilters(new InputFilter[]{ new InputFilterMinMax("2", "4")});
		
		submitButton=(Button) findViewById(R.id.caculateButton);
		
submitButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				float fC1=0,fC2=0,fC3=0,fC4=0,fC5=0,fC6=0,fC7=0,fC8=0;
				float fP1=0,fP2=0,fP3=0,fP4=0,fP5=0,fP6=0,fP7=0,fP8=0;

					try{
						fC1=Float.parseFloat(C1.getText().toString());
						fP1=Float.parseFloat(P1.getText().toString());
						}
						catch (Exception e) {
							fP1=0;
							fC1=0;
							
						}
					try{
						fC2=Float.parseFloat(C2.getText().toString());
						fP2=Float.parseFloat(P2.getText().toString());
						}
						catch (Exception e) {
							fC2=0;
							fP2=0;
							}
						
					try{
						fC3=Float.parseFloat(C3.getText().toString());
						fP3=Float.parseFloat(P3.getText().toString());
						}
						catch (Exception e) {
							fC3=0;
							fP3=0;
						}
					try{
						
						fC4=Float.parseFloat(C4.getText().toString());
						fP4=Float.parseFloat(P4.getText().toString());
						}
						catch (Exception e) {
							fC4=0;
							fP4=0;
						}
					try{
						
						fC5=Float.parseFloat(C5.getText().toString());
						fP5=Float.parseFloat(P5.getText().toString());
						}
						catch (Exception e) {
							fC5=0;
							fP5=0;
						}
					try{
						
						fC6=Float.parseFloat(C6.getText().toString());
						fP6=Float.parseFloat(P6.getText().toString());
						}
						catch (Exception e) {
							fC6=0;
							fP6=0;
						}
					try{
						
						fC7=Float.parseFloat(C7.getText().toString());
						fP7=Float.parseFloat(P7.getText().toString());
						}
						catch (Exception e) {
							fC7=0;
							fP7=0;
						}
					try{
						fC8=Float.parseFloat(C8.getText().toString());
						fP8=Float.parseFloat(P8.getText().toString());
						
						}
						catch (Exception e) {
							fC8=0;
							fP8=0;
						}
					
					float mOfC1andP1=fC1*fP1;
					float mOfC2andP2=fC2*fP2;
					float mOfC3andP3=fC3*fP3;
					float mOfC4andP4=fC4*fP4;
					float mOfC5andP5=fC5*fP5;
					float mOfC6andP6=fC6*fP6;
					float mOfC7andP7=fC7*fP7;
					float mOfC8andP8=fC8*fP8;
					
					float tCandP=mOfC1andP1+mOfC2andP2+mOfC3andP3+mOfC4andP4+mOfC5andP5+mOfC6andP6+mOfC7andP7+mOfC8andP8;
					float totalCredit=fC1+fC2+fC3+fC4+fC5+fC6+fC7+fC8;
					float finalResultCGPA=tCandP/totalCredit;
				
	
				Intent intentCGPA=new Intent(CalculateCGPA.this, ResultActivity.class);
				intentCGPA.putExtra("Result", finalResultCGPA);
				startActivity(intentCGPA);
				
				
				
			}
		});
	
		Spinner mySpinner=(Spinner) findViewById(R.id.spinnerOne);
		ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner.setAdapter(myAdapter);
		
		mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View view,
					int i, long l) {
				
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		Spinner mySpinner2=(Spinner) findViewById(R.id.spinnerTwo);
		ArrayAdapter<String> myAdapter2=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner2.setAdapter(myAdapter);
		
		Spinner mySpinner3=(Spinner) findViewById(R.id.spinnerThree);
		ArrayAdapter<String> myAdapter3=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner3.setAdapter(myAdapter);
		
		Spinner mySpinner4=(Spinner) findViewById(R.id.spinnerFour);
		ArrayAdapter<String> myAdapter4=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner4.setAdapter(myAdapter);
		
		Spinner mySpinner5=(Spinner) findViewById(R.id.spinnerFive);
		ArrayAdapter<String> myAdapter5=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner5.setAdapter(myAdapter);
		
		Spinner mySpinner6=(Spinner) findViewById(R.id.spinnerSix);
		ArrayAdapter<String> myAdapter6=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner6.setAdapter(myAdapter);
		
		Spinner mySpinner7=(Spinner) findViewById(R.id.spinnerSeven);
		ArrayAdapter<String> myAdapter7=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		myAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner7.setAdapter(myAdapter);
		
		Spinner mySpinner8=(Spinner) findViewById(R.id.spinnerEight);
		ArrayAdapter<String> myAdapter8=new ArrayAdapter<String>(CalculateCGPA.this,
				android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerOne));
		
		myAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner8.setAdapter(myAdapter);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.calculate_cg, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch (item.getItemId()) {
		case R.id.action_home:
				Intent intentHome = new Intent(CalculateCGPA.this,WelcomeActivity.class);
				startActivity(intentHome);
			break;
			
		case R.id.action_help:
			Intent intentHelp = new Intent(CalculateCGPA.this,HelpActivity.class);
			startActivity(intentHelp);
			break;
		case R.id.action_credit:
			Intent credit=new Intent(CalculateCGPA.this, DeveloperActivity.class);
			startActivity(credit);
			
			break;
		case R.id.action_settings:
			break;
			
		case R.id.action_exit:
			final AlertDialog.Builder builder = new AlertDialog.Builder(CalculateCGPA.this);
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
