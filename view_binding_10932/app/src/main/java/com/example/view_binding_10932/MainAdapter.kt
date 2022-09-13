package com.example.view_binding_10932

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.view_binding_10932.databinding.RecyclerviewItemBinding

class MainAdapter(val taskList: List<Task>) : RecyclerView.Adapter<MainAdapter.viewHolder>() {
    inner class viewHolder(val itemBinding: RecyclerviewItemBinding): RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(task: Task) {
            itemBinding.chapter.text = task.chapter
            itemBinding.itemTitle.text = task.title
            itemBinding.itemDetail.text = task.details
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bind(taskList[position])
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}