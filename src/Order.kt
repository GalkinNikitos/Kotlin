data class Order(
    val id: Int?, // идентификатор заказа
    val status: OrderStatus, // статус заказа
    val products: List<Product>, // список товаров
    val address: String // адрес
){
    init {
        require(address.isNotBlank()) {"Адрес не должен быть пустым"}
    }
}

enum class OrderStatus {
    PENDING,
    COMPLETED,
    CANCELLED
}

data class Product(
    val id: Int,
    val name: String,
    val price: Double
)

class OrderRepository {
    fun getOrderById(id: Int): Order {
        return Order(1, OrderStatus.COMPLETED, listOf(Product(1, "quail egg", 222.2),
                                                         Product(2, "coconut milk", 333.3),
                                                         Product(3, "olive oil", 444.4)), "prospekt Mira house 23 apartment 23")
    }
}

object OrderFactory {
    fun createOrder(id: Int?, status: OrderStatus, products: List<Product>, address: String): Order {
        return Order(id, status, products, address)
    }
}