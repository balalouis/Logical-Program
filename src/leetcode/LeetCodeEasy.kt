package leetcode

fun removeMain() {
    val intArray = intArrayOf(0, 1, 2, 2, 3)
//    removeDuplicate(intArray)
//    removeElement(intArray, 2)
//    isValid("{[]}")
    val result = isValidParenthsis("(){}}{")
    println("Result: $result")
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

    println("Final array " + nums.contentToString())
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
    println("Nums: " + nums.contentToString())
    println("Nums: " + keyPosition)
    return arrayList.size
}

fun isValidParenthsis(s: String): Boolean {
    val expectSize = s.length % 2
    if (s.length <= 1 || expectSize == 1) {
        return false
    }
    val hashMap = hashMapOf<Char, Char>()
    hashMap['('] = ')'
    hashMap['['] = ']'
    hashMap['{'] = '}'
    val defaultKeys = hashMap.keys
    val actualKeys = mutableListOf<Char>()
    for ((i, c) in s.withIndex()) {
        if (i % 2 == 0 && !defaultKeys.contains(c)) {
            return false
        }
        if (defaultKeys.contains(c)) {
            actualKeys.add(c)
            continue
        } else {
            val curr = actualKeys[actualKeys.size - 1]
            if (hashMap[curr] == c) {
                actualKeys.removeAt(actualKeys.size - 1)
            }
        }
    }
    return actualKeys.size == 0
}
