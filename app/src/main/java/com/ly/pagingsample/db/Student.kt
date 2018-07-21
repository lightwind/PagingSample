package com.ly.pagingsample.db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Create by LiuYang on 2018/7/21 09:20
 */
@Entity
data class Student(@PrimaryKey(autoGenerate = true) val id: Int,
                   val name: String)