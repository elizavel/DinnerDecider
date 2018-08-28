package elizavel.com.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodlist = arrayListOf("Fried Chicken","Spaghetti","Salad","Chillz","Carbonara")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decideBtn.setOnClickListener {
            var random = Random()
            var randomint = random.nextInt(foodlist.count())
            selectedFoodTxt.text = foodlist[randomint]
        }

        addBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodlist.add(newFood)
            addFoodTxt.text = null
            Toast.makeText(this,"$newFood added",Toast.LENGTH_SHORT).show()
        }
    }
}
