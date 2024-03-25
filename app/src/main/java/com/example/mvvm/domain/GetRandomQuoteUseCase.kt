package com.example.mvvm.domain
import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider){

    operator fun invoke():QuoteModel{
        val quotes = quoteProvider.quotes
            val randomNumber: Int = (quotes.indices).random()
            return quotes[randomNumber]


    }
}