package tw.pu.edu.csim.hsiien.newrefrigerator


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bottom navigation buttons
        findViewById<Button>(R.id.refrigerator).setOnClickListener {
            // Handle Home button click
        }
        findViewById<Button>(R.id.recipe).setOnClickListener {
            // Handle List button click
        }
        findViewById<Button>(R.id.recommend).setOnClickListener {
            // Handle Cloud button click
        }
        findViewById<Button>(R.id.account).setOnClickListener {
            // Handle User button click
        }

        // Initialize RecyclerView
        val fridgeRecyclerView = findViewById<RecyclerView>(R.id.fridgeRecyclerView)
        fridgeRecyclerView.layoutManager = LinearLayoutManager(this)

        val fridgeList = listOf(
            Fridge("蔡譯嫺's fridge", "https://c.animaapp.com/m8msq2rjLUzXOu/img/rectangle-4.svg"),
            // Add more fridges here
        )

        val adapter = FridgeAdapter(fridgeList)
        fridgeRecyclerView.adapter = adapter

        // Search button click logic
        findViewById<Button>(R.id.joinButton).setOnClickListener {
            val fridgeId = findViewById<EditText>(R.id.fridgeIdInput).text.toString()
            // Handle join fridge by ID
        }
    }
}
