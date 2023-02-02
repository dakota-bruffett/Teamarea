package com.example.teamarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var team_1:TextView
    private lateinit var Team_2:TextView
    private lateinit var Results:TextView
    private lateinit var Name:EditText
    private lateinit var Name_2:EditText
    private lateinit var Fancy_Button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       team_1 = findViewById(R.id.Team_Name_1)
        Team_2 = findViewById(R.id.Team_name_2)
        Name= findViewById(R.id.team_1)
        Name_2 =findViewById(R.id.Team_2)
        Fancy_Button= findViewById(R.id.Fancy_button)
        Results = findViewById(R.id.Results)

        Fancy_Button.setOnClickListener{
            ShowRandomTeam()
        }

        }
        private fun ShowRandomTeam() {
            val Team = listOf("Name,Name_2").random()
            if (Team == "Team_1")
                    Name.visibility = View.VISIBLE

        else
            Name_2.visibility= View.VISIBLE
        }
}