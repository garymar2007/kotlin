package com.garymar.kotlin

fun main(args: Array<String>) {
	System.out.println("Hello World in java system out")
	println("Hello World")

	val subject = "World"
	val message = "Hello, ${subject}"

	val ids = listOf(1,2,3,4).let {
		val first = it.get(0)

		val second = it[1]

		return@let emptyList<Int>()
	}

	val myFunc: (String) -> Int = { s -> s.length }
	val lengthOfString = myFunc("Hello")

	println(lengthOfString);

	fun myFunctionTakingAnotherFnction (
		callback: String.() -> Int) {
		callback("hello")
	}

	myFunctionTakingAnotherFnction {
		println("the string is ${this}")
		return@myFunctionTakingAnotherFnction 0
	}

	fun String.hello( name: String ) :String {
		return "hello, ${name}"
	}

	val name = "test"
	name.hello("world");
}
