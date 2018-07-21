package com.ly.pagingsample.adapter

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil
import android.view.ViewGroup
import com.ly.pagingsample.db.Student

/**
 * Create by LiuYang on 2018/7/21 09:48
 */
class StudentAdapter : PagedListAdapter<Student, StudentViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder =
            StudentViewHolder(parent)

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Student>() {
            override fun areItemsTheSame(oldItem: Student?, newItem: Student?): Boolean =
                    oldItem!!.id == newItem!!.id

            override fun areContentsTheSame(oldItem: Student?, newItem: Student?): Boolean =
                    oldItem == newItem
        }
    }
}