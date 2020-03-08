package com.samelody.samples.kotlin.algorithms

import java.util.*
import java.util.LinkedList

class BinaryNode(val data: Int) {

    var left: BinaryNode? = null
    var right: BinaryNode? = null

    fun levelOrder(visit: (Int) -> Unit) {
        val queue: Queue<BinaryNode> = LinkedList()
        queue.offer(this)
        while (queue.isNotEmpty()) {
            val node = queue.poll() ?: continue
            visit(node.data)
            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }
    }
}