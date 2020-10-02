package com.example.madlevel4example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel4example.R
import com.example.madlevel4example.model.Reminder
import kotlinx.android.synthetic.main.item_reminder.view.*

class ReminderAdapter(private val reminders: List<Reminder>) :
    RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context


        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_reminder, parent, false)
        )
    }


    override fun getItemCount(): Int {
        return reminders.size

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(reminders[position])
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun databind(reminder: Reminder) {
            itemView.tvReminder.text = reminder.reminderText
        }
    }
}