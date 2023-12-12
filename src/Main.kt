fun main() {
    val customerRepository = CustomerRepository()
    val orderRepository = OrderRepository()

    val customerFactory = CustomerFactory
    val orderFactory = OrderFactory

    val cusR = customerRepository.getCustomerById(1)
    val ordR = orderRepository.getOrderById(1)

    val cusF = customerFactory.createCustomer(2, "Nikoly", CardType.AMERICAN_EXPRESS, PaymentMethod.CASH)
    val ordF = orderFactory.createOrder(2, OrderStatus.CANCELLED, products = listOf(Product(1, "vsv", 1111.1),
        Product(2, "nmm", 555.5)), "prospekt Mira house 23 apartment 23")

    println("Создание покупателя" + "\n" + "Покупатель: идентификатор покупателя - ${cusF.id}, имя покупателя - ${cusF.name}," +
    " тип карты покупателя - ${cusF.cardType}, метод оплаты - ${cusF.paymentMethod}")
    println("Создание заказа" + "\n" + "Заказ: идентификатор заказа - ${ordF.id}, статус заказа - ${ordF.status}, список товаров - ${ordF.products}, адрес заказа - ${ordF.address}")
    println("Получение заказа по id" + "\n" + "Заказ: идентификатор заказа - ${ordR.id}, статус заказа - ${ordR.status}, список товаров - ${ordR.products}, адрес заказа - ${ordR.address}")
    println("Получение покупателя id" + "\n" + "Покупатель: идентификатор покупателя - ${cusR.id}, имя покупателя - ${cusR.name}," +
            " тип карты покупателя - ${cusR.cardType}, метод оплаты - ${cusR.paymentMethod}")
}