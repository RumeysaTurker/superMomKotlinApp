package com.rumeysaturker.supermomkotlinapp.Profile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rumeysaturker.supermomkotlinapp.R
import com.rumeysaturker.supermomkotlinapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_profile.*


class ProfileActivity : AppCompatActivity() {

    private val ACTIVITY_NUMBER = 4
    private val TAG = "ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupToolBar()
        setupNavigationView()
    }
    //aktivite başlatma, imgProfileSettings ikonuna tıklanıldığında ProfileSettingsActivity'i başlat
    private fun setupToolBar() {
        imgProfileSettings.setOnClickListener{
            var intent=Intent(this,ProfileSettingsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }

    fun setupNavigationView() {
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)//fonksiyona companion object kullandığımız için direkt erişebiliyoruz.
        BottomNavigationViewHelper.setupNavigation(this, bottomNavigationView)
        var menu = bottomNavigationView.menu
        var menuItem = menu.getItem(ACTIVITY_NUMBER)
        menuItem.setChecked(true)
    }
}
