package com.eyyuperdogan.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.eyyuperdogan.recyclerview.databinding.ActivityMainBinding

private lateinit var binding:ActivityMainBinding
private  lateinit var landmarkList:ArrayList<landmark>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList=ArrayList<landmark>()
        val eyfel=landmark("Eiffel","FRANCE",R.drawable.eyfel)
        val collesseum=landmark("Collesseum","ITALY",R.drawable.collesseum)
        val bridgeLondon=landmark("Bridge","LONDON",R.drawable.bridge)
        val pissa=landmark("Pissa","ITALY",R.drawable.pissa)


        landmarkList.add(eyfel)
        landmarkList.add(collesseum)
        landmarkList.add(bridgeLondon)
        landmarkList.add(pissa)




        binding.recyclerview.layoutManager=LinearLayoutManager(this)
        var landmarkAdapter =LandmarkAdapter(landmarkList)
         binding.recyclerview.adapter=landmarkAdapter
    }
}