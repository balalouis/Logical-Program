package leetcode

import java.util.*

fun removeMain() {
    val intArray = intArrayOf(3, 3, 6, 7, 7, 8, 8, 9, 9, 9)
    removeDuplicate(intArray)
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
    for (n in nums) {
        if (!arrayList.contains(n)) {
            arrayList.add(n)
        }
    }
    return arrayList.size
}
