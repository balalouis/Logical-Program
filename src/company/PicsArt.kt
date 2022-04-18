package company

import java.lang.System.out

class PicsArt {

    /*
        Find max no of repeated number is array
        Example: [21,243,45,6]
        1 -> 1 , 2 -> 2, 3-> 1, 4-> 2, 5-> 1, 6-> 1

        1, 3, 5, 6 is repeated for one times,
        2, 4, is repeated for two times
     */
    fun programOne() {
        val numArray = arrayOf(21, 243, 45, 6)
        val numHashMap = mutableMapOf<Int, Int>()
        for (digit in numArray) {
            splitAndInsertIntoMap(digit, numHashMap as HashMap<Int, Int>)
        }

        maxRepeatedItem(numHashMap as HashMap<Int, Int>)
    }

    private fun splitAndInsertIntoMap(digit: Int, numHashMap: HashMap<Int, Int>) {
        var num = digit
        var key = 0
        while (num > 0) {
            key = num % 10
            num /= 10
            if (numHashMap.containsKey(key)) {
                val value = numHashMap.getValue(key) + 1
                numHashMap[key] = value
            } else {
                numHashMap[key] = 1
            }
        }
    }

    private fun maxRepeatedItem(numHashMap: HashMap<Int, Int> /* = java.util.HashMap<kotlin.Int, kotlin.Int> */) {
        val numList = mutableListOf<Int>()
        var maxValue = 0
        for ((k, v) in numHashMap) {
            if (v > maxValue) {
                println("$k = $v")
                numList.clear()
                numList.add(k)
                maxValue = v
            }
        }
        out.println(numList.toString())

    }

    /*
            Sample
            Input -> abbaaaac : Output -> 1a2b4a1c
            Input -> a : Output -> 1a
     */

    fun programTwo(inputString: String) {
        val char = inputString.toCharArray()
        var prevChar: Char? = char[0]
        val finalString: StringBuilder = java.lang.StringBuilder()
        var currPos = 0
        for (c in char) {
            if (char.size == 1) {
                val tt = 1
                finalString.append(tt.toString())
                finalString.append(c)
            } else {
                if (currPos == 0) {
                    prevChar = c
                    currPos++
                } else {
                    if (prevChar != c) {
                        finalString.append(currPos)
                        finalString.append(prevChar)
                        prevChar = c
                        currPos = 1
                    } else {
                        currPos++
                    }
                }
            }
        }
        finalString.append(currPos)
        finalString.append(prevChar)
        println("-----> $finalString")
    }

}