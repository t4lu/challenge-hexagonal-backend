package io.devpass.creditcard.domainaccess

import io.devpass.creditcard.domain.objects.CreditCardInvoice

interface ICreditCardInvoiceServiceAdapter {
    fun getById(creditCardInvoiceId: String): CreditCardInvoice?

    fun payInvoice(invoiceId : String) : CreditCardInvoice?
}