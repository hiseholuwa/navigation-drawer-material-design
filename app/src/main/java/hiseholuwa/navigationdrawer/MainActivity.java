package hiseholuwa.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.inbox_id:
                Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT).show();
                break;

            case R.id.starred_id:
                Toast.makeText(this, "Starred", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sent_id:
                Toast.makeText(this, "Sent", Toast.LENGTH_SHORT).show();
                break;

            case R.id.drafts_id:
                Toast.makeText(this, "Drafts", Toast.LENGTH_SHORT).show();
                break;

            case R.id.all_mail_id:
                Toast.makeText(this, "All Mail", Toast.LENGTH_SHORT).show();
                break;

            case R.id.trash_id:
                Toast.makeText(this, "Trash", Toast.LENGTH_SHORT).show();
                break;

            case R.id.spam_id:
                Toast.makeText(this, "Spam", Toast.LENGTH_SHORT).show();
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
