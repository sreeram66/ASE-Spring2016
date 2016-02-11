package com.applications.sreeram.nowhere;

/**
 * Created by sreeram on 2/3/16.
 */

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

    int TAKE_PHOTO_CODE = 0;
    ImageView userImage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button capture = (Button) findViewById(R.id.btnSelectPhoto);
        userImage = (ImageView) findViewById(R.id.imageView);
        //Button click eventlistener. Initializes the camera.
        capture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
            }
        });
    }
    //If the photo is captured then set the image view to the photo captured.
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TAKE_PHOTO_CODE && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            userImage.setImageBitmap(photo);
            Log.d("CameraDemo", "Pic saved");
        }



}



    public void signInValidation(View v) {
        EditText usernameCtrl = (EditText) findViewById(R.id.editText3);
        EditText passwordCtrl = (EditText) findViewById(R.id.editText2);
        EditText emailIdCtrl  = (EditText) findViewById(R.id.editText4);
        EditText nameCtrl  = (EditText) findViewById(R.id.editText);
        TextView errorText = (TextView) findViewById(R.id.lbl_Error);
        String userName = usernameCtrl.getText().toString();
        String password = passwordCtrl.getText().toString();
        String emailId = emailIdCtrl.getText().toString();
        String name = nameCtrl.getText().toString();

        boolean validationFlag = false;
        //Verify if the username and password are not empty.
        if (!userName.isEmpty() && !password.isEmpty() && !emailId.isEmpty() && !name.isEmpty() ) {

                validationFlag = true;

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

