package com.ly.pagingsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.ly.pagingsample.R
import com.ly.pagingsample.db.Student

/**
 * Create by LiuYang on 2018/7/21 09:42
 */
class StudentViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)) {
    private val nameView = itemView.findViewById<TextView>(R.id.name)
    var student: Student? = null

    /**
     * Items might be null if they are not paged in yet. PagedListAdapter will re-bind the
     * ViewHolder when Item is loaded.
     */
    fun bindTo(student: Student?) {
        this.student = student
        nameView.text = student?.name
    }
}