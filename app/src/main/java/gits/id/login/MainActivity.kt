package gits.id.login

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide navigation bar
        if (Build.VERSION.SDK_INT >= 19) {
            val v = window.decorView
            v.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        }

        btnLogin.setOnClickListener {

            val tempPassword = etPassword.text.toString()
            val tempUsername = etUsername.text.toString()

            if (tempUsername.trim().isEmpty()) {
                Toast.makeText(this, R.string.text_error_username, Toast.LENGTH_SHORT).show()
            } else if (tempPassword.trim().isEmpty()) {
                Toast.makeText(this, R.string.text_error_password, Toast.LENGTH_SHORT).show()
            } else if (tempPassword == "123456" && tempUsername == "hallo") {
                Toast.makeText(this, R.string.text_success_login, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, R.string.text_error_login, Toast.LENGTH_SHORT).show()
            }

        }

    }
}
