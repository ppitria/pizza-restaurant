package lat.pam.pizzarestaurant

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class StoreActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        val selectedStore = intent.getStringExtra("SELECTED_STORE")
        val cityName = intent.getStringExtra("CITY_NAME")
        val enteredName = intent.getStringExtra("ENTERED_NAME")

        val labelStore = findViewById<TextView>(R.id.textStore)
        val nameCity = findViewById<TextView>(R.id.locCity)
        val usernameText = findViewById<TextView>(R.id.usernameText)


        labelStore.text = "$selectedStore"
        nameCity.text = "$cityName"
        usernameText.text = "Hello, $enteredName"
    }

    fun navigateToNextPage(view: View) {
        val enteredName = intent.getStringExtra("ENTERED_NAME")

        val intent = Intent(this, MenuActivity::class.java)
        intent.putExtra("ENTERED_NAME", enteredName)

        startActivity(intent)
    }
}