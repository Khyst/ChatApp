package com.example.khystchatapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText mInputMessage;
    private Button mSendMessage;
    private LinearLayout mMessageLog;
    private TextView mCpuMessage;
    private TextView mUserMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mInputMessage = (EditText) findViewById(R.id.input_Message);
        mSendMessage = (Button) findViewById(R.id.send_Massage);

        mMessageLog = (LinearLayout) findViewById(R.id.Message_log);

        mCpuMessage = (TextView) findViewById(R.id.cpu_Massage);
        mUserMessage = (TextView) findViewById(R.id.user_Massage);

        mSendMessage.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(mSendMessage)) {
            String inputText = mInputMessage.getText().toString();
            String answer;

            mUserMessage.setText(inputText);
            if(inputText.contains("안녕")){
                answer = "안녕하세요";
            }
            else if(inputText.contains("피곤"))
            {
                answer = "고생했어요~";
            }
            else
            {
                answer = "그거 괜찮네요!";
            }

            /*mUserMessage.setText(inputText);
            mCpuMessage.setText("그거 괜찮네요");
            mInputMessage.setText("");*/
            //Toast.makeText(this, "onClick()", Toast.LENGTH_SHORT).show();
        }
    }
}