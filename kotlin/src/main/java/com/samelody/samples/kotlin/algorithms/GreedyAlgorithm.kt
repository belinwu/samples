package com.samelody.samples.kotlin.algorithms

fun main() {
    //初始化广播台信息
    val broadcasts = hashMapOf<String, HashSet<String>>()
    broadcasts["K1"] = hashSetOf("ID", "NV", "UT")
    broadcasts["K2"] = hashSetOf("WA", "ID", "MT")
    broadcasts["K3"] = hashSetOf("OR", "NV", "CA")
    broadcasts["K4"] = hashSetOf("NV", "UT")
    broadcasts["K5"] = hashSetOf("CA", "AZ")
    //需要覆盖的全部地区
    val allAreas = hashSetOf("ID", "NV", "UT", "WA", "MT", "OR", "CA", "AZ")
    //所选择的广播台列表
    val selects: MutableList<String> = ArrayList()
    val tempSet: MutableSet<String> = HashSet()
    var maxKey: String? = null
    while (allAreas.isNotEmpty()) {
        maxKey = null
        for (key in broadcasts.keys) {
            tempSet.clear()
            val areas = broadcasts[key]!!
            tempSet.addAll(areas)
            //求出2个集合的交集，此时tempSet会被赋值为交集的内容，所以使用临时变量
            tempSet.retainAll(allAreas)
            //如果该集合包含的地区数量比原本的集合多
            if (tempSet.size > 0 && (maxKey == null || tempSet.size > broadcasts[maxKey]!!.size)) {
                maxKey = key
            }
        }
        if (maxKey != null) {
            selects.add(maxKey)
            allAreas.removeAll(broadcasts[maxKey]!!)
        }
    }
    print("selects:$selects")
}