package com.monstertechno.blooddonationappaccountcreationui;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout first_layout,second_layout,fourth_Layout,fifth_Layout,sixth_Layout,seventh_Layout;

    //First Layout Button
    private Button signin, Create_accoount;

    //second Layout
    private ImageButton phonenumber;
    private EditText inputPhonenumber;

    //third layout
    private ProgressBar progressBar;

    //fourth layout
    private EditText verifiedNumber;
    private ImageButton verifiedNext;
    private TextView UserPhoneNumber;

    //fifth layout
    private EditText userName;
    private ImageButton usernext;

    //sixth Layout
    private Button groupA,groupB,gruopAB,groupO,groupContinue;
    String BloodeGroup;

    //seventh Layout
    private TextView UserNameFinal;
    private Button Request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_layout = (LinearLayout) findViewById(R.id.first_layout);
        second_layout = (LinearLayout) findViewById(R.id.second_layout);
        fourth_Layout = (LinearLayout) findViewById(R.id.fourth_layout);
        fifth_Layout = (LinearLayout) findViewById(R.id.five_layout);
        sixth_Layout = (LinearLayout) findViewById(R.id.sixth_layout);
        seventh_Layout = (LinearLayout) findViewById(R.id.seventh_layout);

        first_layout.setVisibility(View.VISIBLE);
        final ViewGroup transitionsContainerfirst = (ViewGroup) findViewById(R.id.first_layout);
        TransitionManager.beginDelayedTransition(transitionsContainerfirst);

        signin = (Button) transitionsContainerfirst.findViewById(R.id.signin);
        Create_accoount = (Button) transitionsContainerfirst.findViewById(R.id.create_account);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You click on the SIgn in Button",Toast.LENGTH_SHORT).show();
            }
        });

        Create_accoount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_layout.setVisibility(View.GONE);
                second_layout.setVisibility(View.VISIBLE);
            }
        });

        final ViewGroup transitionsContainersecond = (ViewGroup) findViewById(R.id.second_layout);
        TransitionManager.beginDelayedTransition(transitionsContainersecond);

        inputPhonenumber = (EditText) transitionsContainersecond.findViewById(R.id.edittext_phone);
        phonenumber = (ImageButton) transitionsContainersecond.findViewById(R.id.input_phoneNumber);

        String number = inputPhonenumber.getText().toString();
        phonenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_layout.setVisibility(View.GONE);
                fourth_Layout.setVisibility(View.VISIBLE);
            }
        });

        final ViewGroup transitionsContainerforth = (ViewGroup) findViewById(R.id.fourth_layout);
        TransitionManager.beginDelayedTransition(transitionsContainerfirst);

        verifiedNumber = (EditText) transitionsContainerforth.findViewById(R.id.verifiednumber);
        verifiedNext = (ImageButton) transitionsContainerforth.findViewById(R.id.verified_next);
        UserPhoneNumber = (TextView) transitionsContainerforth.findViewById(R.id.userPhoneNumber);
        UserPhoneNumber.setText(number);

        String verificationnumber = verifiedNumber.getText().toString();
        verifiedNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourth_Layout.setVisibility(View.GONE);
                fifth_Layout.setVisibility(View.VISIBLE);
            }
        });

        final ViewGroup transitionsContainerfifth = (ViewGroup) findViewById(R.id.first_layout);
        TransitionManager.beginDelayedTransition(transitionsContainerfifth);

        userName = (EditText) transitionsContainerfifth.findViewById(R.id.userName);
        usernext = (ImageButton) transitionsContainerfifth.findViewById(R.id.usernamenext);
        String UserName = userName.getText().toString();
        usernext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifth_Layout.setVisibility(View.GONE);
                sixth_Layout.setVisibility(View.VISIBLE);
            }
        });

        groupA = (Button) findViewById(R.id.groupA);
        groupB = (Button) findViewById(R.id.groupB);
        gruopAB = (Button) findViewById(R.id.groupAB);
        groupO = (Button) findViewById(R.id.groupO);
        groupContinue = (Button) findViewById(R.id.groupContinue);

        groupA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupA.setBackground(getDrawable(R.drawable.create_account_background));
                groupA.setTextColor(getResources().getColor(R.color.WHiTE));
                BloodeGroup = "A";
            }
        });
        groupB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupB.setBackground(getDrawable(R.drawable.create_account_background));
                groupB.setTextColor(getResources().getColor(R.color.WHiTE));
                BloodeGroup = "B";
            }
        });

        gruopAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gruopAB.setBackground(getDrawable(R.drawable.create_account_background));
                gruopAB.setTextColor(getResources().getColor(R.color.WHiTE));
                BloodeGroup = "AB";
            }
        });

        groupO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupO.setBackground(getDrawable(R.drawable.create_account_background));
                groupO.setTextColor(getResources().getColor(R.color.WHiTE));
                BloodeGroup = "O";
            }
        });

        groupContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixth_Layout.setVisibility(View.GONE);
                seventh_Layout.setVisibility(View.VISIBLE);
            }
        });

        UserNameFinal = (TextView) findViewById(R.id.userNameFinal);
        Request = (Button) findViewById(R.id.request);

        UserNameFinal.setText(UserName);
        Request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You click on Request Button",Toast.LENGTH_LONG).show();
            }
        });

    }

}
