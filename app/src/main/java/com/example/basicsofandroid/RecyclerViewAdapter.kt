package com.example.basicsofandroid


import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.basicsofandroid.databinding.ListItemBinding

class RecyclerViewAdapter(
    private val contactList: MutableList<Contact>
): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int = contactList.size
}

class ViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(contact: Contact){
        binding.name.text = contact.name
        binding.phoneNumber.text = contact.phoneNumber.toString()
        binding.imageView.setImageResource(R.drawable.baseline_person_24)
    }
}