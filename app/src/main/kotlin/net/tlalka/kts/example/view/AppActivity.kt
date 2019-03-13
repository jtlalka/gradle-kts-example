package net.tlalka.kts.example.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import net.tlalka.kts.example.R
import net.tlalka.kts.example.view.extension.safeCommit
import net.tlalka.kts.example.view.hello.HelloFragment
import kotlinx.android.synthetic.main.main_activity.main_navigation as navigation

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(R.layout.main_activity)

        showFragment(HelloFragment())
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager
            .safeCommit(R.id.container, fragment)
    }
}
