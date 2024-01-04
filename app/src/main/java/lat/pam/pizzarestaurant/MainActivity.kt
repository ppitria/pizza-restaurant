package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var listStore: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listStore = findViewById(R.id.listStore)

        val storeOptions = arrayOf("Cihampelas", "Ujung Berung", "Jatinangor")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, storeOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        listStore.adapter = adapter

        // Menambahkan listener untuk Spinner
        listStore.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }

    fun navigateToNextPage(view: View) {
        val selectedStore = listStore.selectedItem.toString()
        val cityName = findViewById<EditText>(R.id.kota).text.toString()
        val enteredName = findViewById<EditText>(R.id.editNama).text.toString()

        val intent = Intent(this, StoreActivity::class.java)
        intent.putExtra("SELECTED_STORE", selectedStore)
        intent.putExtra("CITY_NAME", cityName)
        intent.putExtra("ENTERED_NAME", enteredName)
        startActivity(intent)

    }
}