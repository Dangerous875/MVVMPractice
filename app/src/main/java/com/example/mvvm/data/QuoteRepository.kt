package com.example.mvvm.data

import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider
import com.example.mvvm.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}