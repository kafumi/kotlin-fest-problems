import java.lang.AssertionError
import java.util.*

// Submit your answer code using functions below.
// You can use additional function as well.
// Don't forget copy import statements, if you use some libraries.
// submit to:
// https://forms.gle/3pTnurkXmpvdr6kp6
fun answer1(list1: ListNode, list2: ListNode): ListNode {
    val head = ListNode(0)
    var tail = head
    var node1: ListNode? = list1
    var node2: ListNode? = list2
    var overflow = false
    while (node1 != null || node2 != null) {
        val value1 = node1?.value
        val value2 = node2?.value
        var sum = when {
            value1 != null && value2 != null -> value1 + value2
            value1 != null -> value1
            value2 != null -> value2
            else -> throw AssertionError()
        }
        if (overflow) {
            sum += 1
        }
        overflow = (sum >= 10)
        val node = ListNode(sum % 10)
        tail.next = node
        tail = node
        node1 = node1?.next
        node2 = node2?.next
    }
    if (overflow) {
        tail.next = ListNode(1)
    }
    return head.next!!
}

fun answer2(y: Int, b: Int, r: Int): Int {
    val numY = minOf(y, b - 1, r - 2)
    return 3 * numY + 3
}

fun answer3(inputs: Int): Long {
    val max = inputs.and(1.inv())
    val num = max / 2
    return num.toLong() * (2 + max) / 2
}

fun answer4(input: Sequence<Int>): Int {
    val flags = BitSet(Q4_MAX + 1)
    input.forEach {
        flags.set(it)
    }
    return Q4_MAX - flags.cardinality()
}

// ---- submit above ----

// These are dummy test cases.
// We will use more test cases to estimate your code.
fun main() {
    println("Q1")
    val list1 = ListNode(5)
    list1.next = ListNode(4)
    val list2 = ListNode(3)
    list2.next = ListNode(2)
    testListNode(listNodeOf(8, 6)) {
        return@testListNode answer1(list1, list2)
    }
    testListNode(listNodeOf(0)) {
        return@testListNode answer1(listNodeOf(0), listNodeOf(0))
    }
    testListNode(listNodeOf(0, 1)) {
        return@testListNode answer1(listNodeOf(0, 1), listNodeOf(0))
    }
    testListNode(listNodeOf(0, 0, 1)) {
        return@testListNode answer1(listNodeOf(1), listNodeOf(9 ,9))
    }

    println("Q2")
    testInt(9) {
        return@testInt answer2(13, 3, 6)
    }

    println("Q3")
    testLong(30) {
        return@testLong answer3(10)
    }
    testLong(2) {
            return@testLong answer3(2)
    }
    testLong(6) {
        return@testLong answer3(4)
    }

    println("Q4")
//    val testSequence = generateSequence(200_000_000, randomSet())
    testInt(10) {
        return@testInt answer4(sequenceOf())
    }
    testInt(8) {
        return@testInt answer4(sequenceOf(1, 10))
    }
    testInt(8) {
        return@testInt answer4(sequenceOf(1, 10, 10, 1))
    }
}

fun listNodeOf(vararg values: Int): ListNode {
    val head = ListNode(0)
    var tail = head
    for (value in values) {
        val node = ListNode(value)
        tail.next = node
        tail = node
    }
    return head.next!!
}