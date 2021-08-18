package kotlin_Day01

fun main() {
    val ar = arrayOf(1500, 500, 250)
    for (price in ar) {
        println("Discounted price for $price is " + getDiscountedPrice(price.toFloat()))     // Call the function to return the discounted price
    }
}

fun getDiscountedPrice(price: Float): Float {    // declare the return type as float
    val discountedPrice: Float
    if (price < 300) {
        return price
    } else {
        val discount = price * 0.1f
        discountedPrice = if (discount < 100) price - discount
        else price - 100
    }
    return discountedPrice
}
