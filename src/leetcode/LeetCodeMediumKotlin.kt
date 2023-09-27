package leetcode

class LeetCodeMediumKotlin {

    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val finalArray = IntArray(nums.size)
        var finalPos = 0
        val firstHalf = IntArray(nums.size)
        var firstPos = 0
        val secondHalf = IntArray(nums.size)
        var secondPos = 0
        var sameNumCount = 0
        for (n in nums) {
            if (n < pivot) {
                firstHalf[firstPos++] = n
                finalArray[finalPos++] = n
            } else if (n > pivot) {
                secondHalf[secondPos++] = n
            } else {
                sameNumCount++
            }
        }

        while (sameNumCount != 0) {
            finalArray[finalPos++] = pivot
            sameNumCount--
        }

        for (s in secondHalf) {
            if (s != 0) {
                finalArray[finalPos++] = s
            }
        }
        println(finalArray.contentToString())
        return finalArray
    }

}