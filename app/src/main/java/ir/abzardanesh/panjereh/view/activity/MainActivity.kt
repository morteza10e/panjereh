package ir.abzardanesh.panjereh.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import ir.abzardanesh.panjereh.view.fragment.ProfileFragment
import ir.abzardanesh.panjereh.R
import ir.abzardanesh.panjereh.view.fragment.SearchFragment
import ir.abzardanesh.panjereh.databinding.ActivityMainBinding
import ir.abzardanesh.panjereh.view.fragment.HomeFragment
import ir.abzardanesh.panjereh.view.fragment.NotificationFragment

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                moveToFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_search -> {
                moveToFragment(SearchFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_addpost -> {
                item.isChecked=false
                startActivity(Intent(this@MainActivity,
                    AddPostActivity::class.java))
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notifications -> {
                moveToFragment(NotificationFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                moveToFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        moveToFragment(HomeFragment())
        binding.navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

    }

    private fun moveToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
        .replace(R.id.fragment_container,fragment)
        .commit() }
}