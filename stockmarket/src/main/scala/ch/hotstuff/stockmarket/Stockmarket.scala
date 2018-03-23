package ch.hotstuff.stockmarket

object Stockmarket extends App {
  println("Hello, world!")
  
  def maximumProfit(stock : List[Int]) : Int = {
    def maximumProfitRec(idx: Int, absMinIdx: Int, buyIdx: Int, sellIdx: Int) : Int =
      if (idx == stock.length) stock(sellIdx) - stock(buyIdx)
      else {
        val currMaxProfit = stock(sellIdx) - stock(buyIdx)
        val sellNowProfit = stock(idx) - stock(buyIdx)
        val newMinProfit = stock(idx) - stock(absMinIdx)
        val newAbsMinIdx = if (stock(idx) < stock(absMinIdx)) idx else absMinIdx
        
        if (currMaxProfit > sellNowProfit && currMaxProfit > newMinProfit)
          maximumProfitRec(idx + 1, newAbsMinIdx, buyIdx, sellIdx)
        else if (sellNowProfit > currMaxProfit && sellNowProfit > newMinProfit)
          maximumProfitRec(idx + 1, newAbsMinIdx, buyIdx, idx)
        else // newMinProfit is largest
          maximumProfitRec(idx + 1, newAbsMinIdx, absMinIdx, idx)
      }
    
    maximumProfitRec(0, 0, 0, 0)
  }
}
