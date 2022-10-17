package com.eyyuperdogan.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eyyuperdogan.recyclerview.databinding.ActivityMainBinding
import com.eyyuperdogan.recyclerview.databinding.RecyclerRowBinding

class LandmarkAdapter(var landmarklist:ArrayList<landmark>) : RecyclerView.Adapter<LandmarkAdapter.landmarkHolder>() {
    class landmarkHolder(var binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): landmarkHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return landmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: landmarkHolder, position: Int) {
        holder.binding.recyclerviewtextview.text=landmarklist.get(position).name
        holder.itemView.setOnClickListener(){
            val intent=Intent(holder.itemView.context,detailsActivity::class.java)
            intent.putExtra("landmark",landmarklist.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return landmarklist.size
    }
}