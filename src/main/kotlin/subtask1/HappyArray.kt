package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.size < 2) {
            return sadArray
        }

        val happyList = sadArray.toMutableList()
        var isHappy = false

        while (!isHappy) {
            isHappy = true
            for (i in 1 until happyList.size - 1) {
                if (happyList[i - 1] + happyList[i + 1] < happyList[i]) {
                    happyList.removeAt(i)
                    isHappy = false
                    break
                }
            }
        }
        return happyList.toIntArray()
    }
}
