package leetcode

import java.util.*

fun removeMain() {
    val intArray = intArrayOf(0, 1, 2, 2, 3)
//    removeDuplicate(intArray)
    removeElement(intArray, 2)
}

fun removeDuplicate(nums: IntArray) {
    val arrayList = mutableListOf<Int>()
    var k = 0
    var actual = -1
    for (n in nums) {
        actual++
        if (!arrayList.contains(n)) {
            arrayList.add(n)
            if (k != 0) {
                nums[k] = nums[actual]
            }
            k++
        }
    }

    System.out.println("Final array " + nums.contentToString())
    System.out.println("K: $k")
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    val arrayList = mutableListOf<Int>()
    var keyPosition = 0
    for ((n, value) in nums.withIndex()) {
        if (value != `val`) {
            arrayList.add(value)
            nums[keyPosition] = nums[n]
            keyPosition++
        }
    }
    System.out.println("Nums: " + nums.contentToString())
    System.out.println("Nums: " + keyPosition)
    return arrayList.size
}
