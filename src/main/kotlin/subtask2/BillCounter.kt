package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annBill = (bill.sum() - bill[k]) / 2
        return if (b - annBill == 0) "Bon Appetit"
        else (b - annBill).toString()
    }
}
