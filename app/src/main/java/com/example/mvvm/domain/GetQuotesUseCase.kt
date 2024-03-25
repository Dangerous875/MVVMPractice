package com.example.mvvm.domain

import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke() : List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}