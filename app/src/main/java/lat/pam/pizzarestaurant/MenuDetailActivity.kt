package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_detail)
    }

    // Fungsi untuk menangani klik tombol "Back"
    fun navigateBack(view: View) {
        onBackPressed()
    }

    // Fungsi untuk menangani klik tombol "Order Now"
    fun navigateToNextPage(view: View) {
        val intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }
}