package jp.ac.asojuku.st.demeshi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        SendBtn.setOnClickListener{RequestRink()}
    }
    fun RequestRink(){
        val intent = Intent(this,ConfMail::class.java)
        intent.putExtra("TextFlag","Forgot")
        startActivity(intent)
    }
}
