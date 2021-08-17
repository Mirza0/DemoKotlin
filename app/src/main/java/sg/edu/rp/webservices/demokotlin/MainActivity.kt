package sg.edu.rp.webservices.demokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            etDOB.text.toString()
            val userDOB = etDOB.text.toString()
            if (userDOB.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                tvShowAge.text = "Your age is $age"
                var output = ""
                if(age < 18){
                    output = "Underage"
                }
                else if (age in 18..65) {
                    output = "Young People"
                }
                else if (age in 66..79){
                    output = "Middle-aged"
                }
                else if (age in 80..99){
                    output = "Elderly"
                }
                else{
                    output = "Long-lived elderly"
                }
                tvAgeGroup.text = output
            }
            else {
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show()
            }

        }
    }
}