package com.abhik.profileapplication

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var arrowBtn: ImageButton
    private lateinit var arrowRightBtn: ImageButton
    private lateinit var arrowRightBtn2: ImageButton
    private lateinit var arrowRightBtn3: ImageButton
    private lateinit var profileImage: ImageView
    private lateinit var userName: TextView
    private lateinit var creditScore: TextView
    private lateinit var cashbackPoints: TextView
    private lateinit var checkText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        arrowBtn = findViewById(R.id.arrowbtn)
        arrowRightBtn = findViewById(R.id.arrowrightbtn)
        arrowRightBtn2 = findViewById(R.id.arrowrightbtn2)
        arrowRightBtn3 = findViewById(R.id.arrowrightbtn3)
        profileImage = findViewById(R.id.profileImage)
        userName = findViewById(R.id.userName)
        creditScore = findViewById(R.id.credscorenum)
        cashbackPoints = findViewById(R.id.cashbackpts)
        checkText = findViewById(R.id.checktxt)

        userName.text = "Abhik Goswami"
        creditScore.text = "757"
        cashbackPoints.text = "3"
        checkText.text = "Check"

        arrowBtn.setOnClickListener {
            Toast.makeText(this, "Back button clicked", Toast.LENGTH_SHORT).show()
            finish()
        }

        arrowRightBtn.setOnClickListener {
            Toast.makeText(this, "Credit score clicked", Toast.LENGTH_SHORT).show()

        }

        arrowRightBtn2.setOnClickListener {
            Toast.makeText(this, "Cashback clicked", Toast.LENGTH_SHORT).show()
        }

        arrowRightBtn3.setOnClickListener {
            Toast.makeText(this, "Bank Balance clicked", Toast.LENGTH_SHORT).show()
        }

        profileImage.setOnClickListener {
            Toast.makeText(this, "Profile picture clicked", Toast.LENGTH_SHORT).show()
        }
    }
}