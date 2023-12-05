fun main() {
    val customerRepository = CustomerRepository()
    val orderRepository = OrderRepository()

    val cus = customerRepository.getCustomerById(1)
    val ord = orderRepository.getOrderById(1)

    println("Заказ: идентификатор заказа - ${ord.id}, статус заказа - ${ord.status}, список товаров - ${ord.products}, адрес заказа - ${ord.address}")
    println("Покупатель: идентификатор покупателя - ${cus.id}, имя покупателя - ${cus.name}," +
            " тип карты покупателя - ${cus.cardType}, метод оплаты - ${cus.paymentMethod}")
}