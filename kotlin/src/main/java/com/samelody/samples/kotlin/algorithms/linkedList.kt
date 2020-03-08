package com.samelody.samples.kotlin.algorithms

class Node(val data: Int, var next: Node? = null)

class LinkedList(var head: Node? = null) {

    fun reverse() {
        var prev: Node? = null
        var curr: Node? = null
        var next = head
        while (next != null) {
            curr = next
            next = next.next
            curr.next = prev
            prev = curr
        }
        head = curr
    }

    fun prepend(data: Int) {
        val node = Node(data)
        node.next = head
        head = node
    }

    fun mergeSorted(list: LinkedList?) {
        if (list?.head == null) return

        if (head == null) {
            head = list.head
            return
        }

        var n1 = head
        var n2 = list.head
        if (n1!!.data < n2!!.data) {
            head = n1
            n1 = n1.next
        } else {
            head = n2
            n2 = n2.next
        }

        var curr = head
        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                curr?.next = n1
                n1 = n1.next
            } else {
                curr?.next = n2
                n2 = n2.next
            }
            curr = curr?.next
        }

        curr?.next = n1 ?: n2
    }

    fun print() {
        var curr = head
        while (curr != null) {
            print("${curr.data} ")
            curr = curr.next
        }
        println()
    }
}

fun main() {
    val list1 = LinkedList()
    list1.prepend(9)
    list1.prepend(8)
    list1.prepend(6)
    list1.prepend(5)
    list1.prepend(4)
    list1.prepend(2)

    val list2 = LinkedList()
    list2.prepend(7)
    list2.prepend(3)
    list2.prepend(1)

    list1.mergeSorted(list2)
    list1.print()
}
