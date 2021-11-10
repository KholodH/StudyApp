package com.example.studyapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_sc)

        val items = arrayListOf(
            arrayListOf("var and val", "Declaring variables.", "Detailed notes here."),
            arrayListOf("User Input", "Getting user input.", "Detailed notes here."),
            arrayListOf("Strings", "String concatenations, interpolation, and methods.", "Detailed notes here."),
            arrayListOf("Data Types", "Understanding data types.", "Detailed notes here."),
            arrayListOf("Basic Operations", "Performing math operations in Kotlin.", "Detailed notes here."),
            arrayListOf("If Statements", "Understanding when and how to use if, else if, and else statements.", "Detailed notes here."),
            arrayListOf("Error Handling", "Using try blocks to avoid runtime errors.", "Detailed notes here."),
            arrayListOf("For Loops", "Using for loops to automate code.", "Detailed notes here."),
            arrayListOf("While Loops", "Using while loops to automate code.", "Detailed notes here."),
            arrayListOf("First App", "Hello world .", "Fun main{\n" +
                    "Print “Hello world! “   }\n"),
        arrayListOf("Print Statements", "How to print.", "\n" +
                "Print “Hello world! “   // print in the same line\n" +
                "Println “Hello world! “      //print in new line\n"),
        arrayListOf("Data Types ", "Number, String, Double,Integer, Long, Char .", "val numFloat = 6 --> 6\n" +
                " val numFloat = 6f --> 6.0\n" +
                "var String = “Hi” --> Hi\n" +
                "var Boolean = True -->True\n" +
                "numFloat!!.toInt(), numFloat!!.toString() // to change the data type\n"),
        )

        val rvKotlin = findViewById<RecyclerView>(R.id.rvKotlin)
        rvKotlin.adapter = RVAdapter(this, items)
        rvKotlin.layoutManager = LinearLayoutManager(this)

        title = "Kotlin Review"
    }
}