package ir.abzardanesh.panjereh.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import ir.abzardanesh.panjereh.R
import ir.abzardanesh.panjereh.databinding.FragmentHomeBinding
import ir.abzardanesh.panjereh.databinding.StoryItemBinding
import ir.abzardanesh.panjereh.model.StoryModel

class StoryAdapter(
    val context: Context,
    val listStory:ArrayList<StoryModel>
): RecyclerView.Adapter<StoryAdapter.ViewHolder>() {

    inner class ViewHolder(binding: StoryItemBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(StoryItemBinding.inflate(LayoutInflater.from(context),
                parent,false))

        // TODO: add story
        }


    override fun getItemCount(): Int = listStory.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}