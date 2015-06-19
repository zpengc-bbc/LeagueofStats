package ch.berufsbildungscenter.leagueofstats;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TabWidget;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

import ch.berufsbildungscenter.leagueofstats.json.LoadingSummonerIDTask;
import ch.berufsbildungscenter.leagueofstats.model.Summoner;


public class SummonerActivity extends ActionBarActivity implements ActionBar.TabListener {

    private String summonername;
    private String region;
    private URL url;


    private ProgressDialog mDialog;

    private static final String LOG_TAG = SummonerActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText(R.string.summomer_gamehistory).setTabListener(this), false);
        actionBar.addTab(actionBar.newTab().setText(R.string.summoner_overview).setTabListener(this), true);
        actionBar.addTab(actionBar.newTab().setText(R.string.summoner_stats).setTabListener(this), false);



        Intent intent = getIntent();
        summonername = intent.getStringExtra("summoner");
        region = intent.getStringExtra("region");

        mDialog = ProgressDialog.show(this, "Search Summoner", "Please wait...");

        try {
            url = new URL("https://euw.api.pvp.net/api/lol/"+region+"/v1.4/summoner/by-name/"+summonername+"?api_key=58453580-a12b-497a-bdde-d1255bd0fda3");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        LoadingSummonerIDTask loadingSummonerIDTask = new LoadingSummonerIDTask(this, mDialog);
        loadingSummonerIDTask.execute(url);






    }

    public void setData(Summoner summoner){
        TextView levelTextView = (TextView)findViewById(R.id.summonerLevel);
        TextView winsTextView = (TextView)findViewById(R.id.wins);

        levelTextView.setText("" + summoner.getSummonerLevel());
        winsTextView.setText(""+summoner.getWins());

        setTitle(summoner.getName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_summoner, menu);
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
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        if (tab.getPosition() == 0) {
            Log.i(LOG_TAG, "Game History");
        } else if (tab.getPosition() == 2) {
            Log.i(LOG_TAG, "Stats");
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

}