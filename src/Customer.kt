data class Customer(
    val id: Int?, // идентификатор покупателя
    val name: String, // имя покупателя
    val cardType: CardType, // тип карты
    val paymentMethod: PaymentMethod // метод оплаты
)

enum class CardType {
    VISA,
    MASTER_CARD,
    AMERICAN_EXPRESS
}

enum class PaymentMethod {
    CASH,
    CREDIT_CARD,
    PAYPAL
}

class CustomerRepository {
    fun getCustomerById(id: Int): Customer {
        return Customer(1, "Nikson", CardType.MASTER_CARD, PaymentMethod.CASH)
    }
}

object CustomerFactory {
    fun createCustomer(id: Int?, name: String, cardType: CardType, paymentMethod: PaymentMethod): Customer {
        return Customer(id, name, cardType, paymentMethod)
    }
}
