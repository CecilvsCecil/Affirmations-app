package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data
        val myDataset = Datasource().loadAffirmations()

        // Set up RecyclerView and its adapter
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(myDataset, this)

        /*
         * This improves performance if you know that changes
         * in content do not change the layout size of the RecyclerView
         */
        recyclerView.setHasFixedSize(true)

    }

}