class MyHashMap(size: Int) {
    private val array = arrayOfNulls<MutableList<MyObject>>(size)

    private fun getHashCode(key: String): Int {
        var hash = 0
        for (i in key.indices) {
            hash = (hash + (key.codePointAt(i)) * i) % array.size
        }
        return hash
    }

    fun setValue(key: String, value: String) {
        val address = getHashCode(key)
        if (array[address].isNullOrEmpty()) {
            array[address] = arrayListOf()
        }
        array[address]?.add(MyObject(key, value))
    }

    fun getValue(key: String): String? {
        val current = array[getHashCode(key)]
        println("Address list size is: ${current?.size}")
        if (current != null) {
            for (myObject in current) {
                if (key == myObject.key) {
                    return myObject.value
                }
            }
        }
        return null
    }

    fun getKeyList(): ArrayList<String> {
        val keyList = arrayListOf<String>()
        for (myList in array) {
            myList?.let {
                for (myObject in myList) {
                    keyList.add(myObject.key)
                }
            }
        }
        return keyList
    }

    fun printKeyList(arrayList: ArrayList<String>) {
        for (key in arrayList) {
            println("Key: $key")
        }
    }
}

data class MyObject(var key: String, var value: String)