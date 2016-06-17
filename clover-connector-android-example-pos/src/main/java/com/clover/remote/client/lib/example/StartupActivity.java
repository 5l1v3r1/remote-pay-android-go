package com.clover.remote.client.lib.example;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.clover.remote.client.CloverConnector;
import com.clover.remote.client.ICloverConnector;
import com.clover.remote.client.device.CloverDeviceConfiguration;
import com.clover.remote.client.device.USBCloverDeviceConfiguration;
import com.clover.remote.client.device.WebSocketCloverDeviceConfiguration;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.prefs.PreferencesFactory;

public class StartupActivity extends Activity {

  public static final String TAG = StartupActivity.class.getName();
  public static final String EXAMPLE_APP_NAME = "EXAMPLE_APP";
  public static final String LAN_PAY_DISPLAY_URL = "LAN_PAY_DISPLAY_URL";
  public static final String CONNECTION_MODE = "CONNECTION_MODE";
  public static final String USB = "USB";
  public static final String LAN = "LAN";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_startup);

    loadBaseURL();

    getActionBar().hide();

    RadioGroup group = (RadioGroup)findViewById(R.id.radioGroup);
    group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
      @Override public void onCheckedChanged(RadioGroup group, int checkedId) {
        TextView textView = (TextView) findViewById(R.id.lanPayDisplayAddress);
        textView.setEnabled(checkedId == R.id.lanRadioButton);
      }
    });

    // initialize...
    TextView textView = (TextView) findViewById(R.id.lanPayDisplayAddress);
    String url = this.getSharedPreferences(EXAMPLE_APP_NAME, Context.MODE_PRIVATE).getString(LAN_PAY_DISPLAY_URL,  "http://192.168.1.101:14285");

    textView.setText(url);
    textView.setEnabled(((RadioGroup)findViewById(R.id.radioGroup)).getCheckedRadioButtonId() == R.id.lanRadioButton);

    String mode = this.getSharedPreferences(EXAMPLE_APP_NAME, Context.MODE_PRIVATE).getString(CONNECTION_MODE, USB);

    ((RadioButton)findViewById(R.id.lanRadioButton)).setChecked(LAN.equals(mode));
    ((RadioButton)findViewById(R.id.usbRadioButton)).setChecked(!LAN.equals(mode));
  }

  private boolean loadBaseURL() {

    String _serverBaseURL = PreferenceManager.getDefaultSharedPreferences(this).getString(ExamplePOSActivity.EXAMPLE_POS_SERVER_KEY, "http://10.0.0.101:14285");

    TextView tv = (TextView)findViewById(R.id.lanPayDisplayAddress);
    tv.setText(_serverBaseURL);

    Log.d(TAG, _serverBaseURL);
    return true;
  }

/*  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_startup, menu);
    return true;
  }*/

/*  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }*/



  public void connect(View view) {

    RadioGroup group = (RadioGroup)findViewById(R.id.radioGroup);
    Intent intent = new Intent();
    intent.setClass(this, ExamplePOSActivity.class);
    CloverDeviceConfiguration config = null;
    SharedPreferences prefs = this.getSharedPreferences(EXAMPLE_APP_NAME, Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = prefs.edit();


    if(group.getCheckedRadioButtonId() == R.id.usbRadioButton) {
      config = new USBCloverDeviceConfiguration(null, "Clover Example POS:1.0");
      editor.putString(CONNECTION_MODE, USB);
      editor.commit();
    } else { // (group.getCheckedRadioButtonId() == R.id.lanRadioButton)
      String uriStr = ((TextView)findViewById(R.id.lanPayDisplayAddress)).getText().toString();
      try {
        URI uri = new URI(uriStr);
        config = new WebSocketCloverDeviceConfiguration(uri, 10000, 2000, "Clover Example POS:1.0");
        editor.putString(LAN_PAY_DISPLAY_URL, uriStr);
        editor.putString(CONNECTION_MODE, LAN);
        editor.commit();
      } catch(URISyntaxException e) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Error");
        builder.setMessage("Invalid URL");
        builder.show();
      }
    }

    if(config != null) {
      intent.putExtra(ExamplePOSActivity.EXTRA_CLOVER_CONNECTOR_CONFIG, config);
      startActivity(intent);
    }

  }

  public void connectionMethodChange(View view) {
    RadioGroup grp = (RadioGroup)view;

  }
}
