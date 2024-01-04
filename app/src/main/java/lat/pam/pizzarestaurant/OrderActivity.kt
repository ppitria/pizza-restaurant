package lat.pam.pizzarestaurant

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class OrderActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val layoutTY = findViewById<LinearLayout>(R.id.layoutTY)
        val doneButton = findViewById<Button>(R.id.sendButton)

        doneButton.setOnClickListener {
            layoutTY.visibility = View.VISIBLE
        }

    }
}