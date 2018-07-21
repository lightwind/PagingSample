package com.ly.pagingsample

import java.util.concurrent.Executors

/**
 * Create by LiuYang on 2018/7/21 09:36
 */
private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

fun ioThread(f: () -> Unit) {
    IO_EXECUTOR.execute(f)
}