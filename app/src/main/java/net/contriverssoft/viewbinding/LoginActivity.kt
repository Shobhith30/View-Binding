package net.contriverssoft.viewbinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.contriverssoft.viewbinding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)

        loginBinding.btnLogin.setOnClickListener {

            val name = loginBinding.etName.text.toString()
            val password = loginBinding.etPassword.text.toString()
            if (name == "root" && password == "root") {
                val loginIntent = Intent(this, HomeActivity::class.java)
                startActivity(loginIntent)
            }

        }
    }
}