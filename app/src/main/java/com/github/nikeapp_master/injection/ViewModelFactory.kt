package com.github.nikeapp_master.injection

import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.nikeapp_master.model.Items
import com.github.nikeapp_master.model.SaveJson
import com.github.nikeapp_master.ui.Communicator
import com.github.nikeapp_master.ui.PostListViewModel
import com.github.nikeapp_master.ui.PostViewModel
import java.io.IOException
import java.io.OutputStreamWriter
import java.lang.IllegalArgumentException

class ViewModelFactory(private val activity: AppCompatActivity, var data: String) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostViewModel::class.java)){
            return PostViewModel() as T
        }
        throw IllegalArgumentException("Unchekecd ViewModel class")
    }


}