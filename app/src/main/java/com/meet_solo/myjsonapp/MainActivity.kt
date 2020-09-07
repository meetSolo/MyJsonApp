package com.meet_solo.myjsonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.viewpager.widget.ViewPager
//import com.meet_solo.myjsonapp.adapters.ViewPagerAdapter
import com.meet_solo.myjsonapp.fragments.FavouritesFragment
import com.meet_solo.myjsonapp.fragments.HomeFragment
import com.meet_solo.myjsonapp.fragments.SettingsFragment
import com.meet_solo.myjsonapp.fragments.AudycjeFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

   // lateinit var toggle = ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // recyclerView.layoutManager = LinearLayoutManager(this)
        // recyclerView.adapter = ContactAdapter()


      //  toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
    //    drawerLayout.addDrawerListener(toggle)
     //  toggle.syncState()

       // supportActionBar.setHomeButtonEnabled(true)
       // supportActionBar.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.miItem1 -> Toast.makeText(applicationContext, "clicked 1", Toast.LENGTH_SHORT  ). show()
                R.id.miItem2 -> Toast.makeText(applicationContext, "clicked 2", Toast.LENGTH_SHORT  ). show()
                R.id.miItem3 -> Toast.makeText(applicationContext, "clicked 3", Toast.LENGTH_SHORT  ). show()

            }
            true
        }
        setUpTabs()




    }

   override fun onOptionsItemSelected(item: MenuItem): Boolean {
 //       if(toggle.onOptionsItemSelected(item)){
           return true
  //      }
 //       return super.onOptionsItemSelected(item)
    }


    private fun setUpTabs()
    {
    val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), title = "POLECANE")
        adapter.addFragment(FavouritesFragment(), title = "WYDARZENIA")
        adapter.addFragment(SettingsFragment(), title = "SPORT")
        adapter.addFragment(AudycjeFragment(), title = "AUDYCJE")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_books_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_sports_handball_24)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_baseline_speaker_24)
    }



}