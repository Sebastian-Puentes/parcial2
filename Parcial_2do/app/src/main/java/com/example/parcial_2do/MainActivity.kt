import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial_2do.EcundariaActivity

class MainActivity : AppCompatActivity() {

    private var env: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        env = findViewById<Button>(R.id.env)
        env?.setOnClickListener {
            val intent = Intent(this@MainActivity, EcundariaActivity::class.java)
            startActivity(intent)
        }
    }
}




