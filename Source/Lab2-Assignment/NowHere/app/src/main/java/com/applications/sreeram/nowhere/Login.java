package com.applications.sreeram.nowhere;

/**
 * Created by sreeram on 2/3/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;



import com.applications.sreeram.nowhere.*;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


    }



    public void signInValidation(View v) {
        EditText usernameCtrl = (EditText) findViewById(R.id.editText);
        EditText passwordCtrl = (EditText) findViewById(R.id.editText2);
        TextView errorText = (TextView) findViewById(R.id.lbl_Error);
        String userName = usernameCtrl.getText().toString();
        String password = passwordCtrl.getText().toString();

        boolean validationFlag = false;
        //Verify if the username and password are not empty.
        if (!userName.isEmpty() && !password.isEmpty()) {
            if (userName.equals("user") && password.equals("passkey")) {
                validationFlag = true;

            }
        }
        if (!validationFlag) {
            errorText.setVisibility(View.VISIBLE);
        } else {
            //This code redirects the from login page to the home page.
            Intent redirect = new Intent(Login.this, MapsActivity.class);
            startActivity(redirect);
        }

    }
}

