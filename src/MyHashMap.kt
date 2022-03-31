class MyHashMap(size: Int) {
    private val array = arrayOfNulls<MutableList<Any>>(size)

    private fun getHashCode(key: String): Int {
        var hash = 0
        for (i in key.indices) {
            hash = (hash + (key.codePointAt(i)) * i) % array.size
        }
        return hash
    }

    fun setValue(key: String, value: String) {
        val address = getHashCode(key)
        println("-----> $address")
        if (array[address].isNullOrEmpty()) {
            array[address] = arrayListOf()
        }
        array[address]?.add(value)
    }

    fun getValue(key: String) {
        val current = array[getHashCode(key)]

        if (current != null) {
            for (ad in current) {
                println("Hello world: $ad")
            }
        }
    }
}