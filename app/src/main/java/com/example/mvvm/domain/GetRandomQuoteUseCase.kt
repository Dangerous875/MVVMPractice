package com.example.mvvm.domain
import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel{
        val quotes = QuoteProvider.quotes
            val randomNumber: Int = (quotes.indices).random()
            return quotes[randomNumber]


    }
}