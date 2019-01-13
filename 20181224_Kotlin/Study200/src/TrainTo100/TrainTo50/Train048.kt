package TrainTo100.TrainTo50

/*
048 힙 영역의 존재 이유
스택영역의 참조변수는 함수(블록)가 끝나고 나면 사라지지만 힙영역의 실제 변수 값은 사라지지 않음.
 */

class Product
{
    var name = ""
    var price = 0
}

fun main(args: Array<String>) {
    val product: Product;product = createProduct()
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)
}

fun createProduct(): Product{
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000

    return apple
}

fun processProduct(product: Product){
    product.price += 500
}

fun printProductInfo(product: Product) {
    println("이름:$product.name") // {}으로 변수를 감싸지 않을 경우 값이 제대로 나오지 않음.
    println("이름:${product.name}")
    println("가격:${product.price}")
}