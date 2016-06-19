package com.example.android.wf13;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.Window;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends ActionBarActivity {

    // Declaring Your View and Variables

    private Toolbar toolbar = null;
    Toolbar toolbar1;
    int i;

    private ViewPager pager;
    private ViewPagerAdapter adapter;
    private TabLayout mTabLayout;
    private SlidingTabLayout tabs;
    private String[] Titles = {"HOME", "LEARN", "BIOshop", "DIFM"};
    private int[] tabIconsRes = new int[]{
            R.drawable.ic_home_green,
            R.drawable.ic_learn_green,
            R.drawable.ic_bioshop_green,
            R.drawable.ic_bioconnect_green
    };
    private int Numboftabs = 4;
    private String message = "1";
    /**
     * 1
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    // private GoogleApiClient client;
 /*   @Override
    public boolean onCreateOptionsMenu (Menu menu){
        if (toolbar1 == null) {
            EnhancedMenuInflater.inflate(getMenuInflater(), menu, false);
        }
        return super.onCreateOptionsMenu(menu);
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo);

        pager = (ViewPager) findViewById(R.id.pager);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(pager);
        setupTabIcons();
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    // Helper method to setup tab icons
    private void setupTabIcons() {
        for (int i = 0; i < Numboftabs; i++) {
            mTabLayout.getTabAt(i).setIcon(tabIconsRes[i]);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String message = intent.getStringExtra("message");
                pager.setCurrentItem(Integer.parseInt(message));

            }
        }
    }


    // Setting the ViewPager For the SlidingTabsLayout
//

    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //getMenuInflater().inflate(R.menu.lower_menu_main, menu);

        return true;
    }

    /**
     * This method will take however many items you have in your
     * menu/menu_main.xml and distribute them across your devices screen
     * evenly using a Toolbar. Enjoy!!
     */
    public void buttonOnClick1(View v) {
        Intent intent = new Intent(this, PeopleFollowed.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0);
    }

    public void buttonOnClick2(View v) {
        Intent intent = new Intent(this, tokra.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0);
    }

    public void buttonOnClick3(View v) {
        Intent intent = new Intent(this, Biopic.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0);
    }

    public void buttonOnClick4(View v) {
        Intent intent = new Intent(this, Mybio.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0);
    }

    public void buttonOnClick5(View v) {
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.android.wf13/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.android.wf13/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}


