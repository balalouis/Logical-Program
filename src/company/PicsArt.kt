package company

class PicsArt {

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