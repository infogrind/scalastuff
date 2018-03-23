package ch.hotstuff.stockmarket

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import Stockmarket._


@RunWith(classOf[JUnitRunner])
class StockmarketSuite extends FunSuite {
  test ("correct profit computed for simplest example") {
    assert(Stockmarket.maximumProfit(List(1,2)) === 1)
  }
  
  test("correct profit if it comes at the end") {
    assert(Stockmarket.maximumProfit(List(10,9,8,7,6,5,4,6)) === 2)
  }
  
  test("zero profit if stock only decreases") {
    assert(Stockmarket.maximumProfit(List(10,9,8,7,6,5)) === 0)
  }
  
  test("zero profit if stock stays flat") {
    assert(Stockmarket.maximumProfit(List(5,5,5,5,5)) === 0)
  }
  
  test("max profit on second jump") {
    assert(Stockmarket.maximumProfit(List(5, 10, 1, 7)) === 6)
  }
  
  test("max profit from www.interviewcake.com example") {
    assert(Stockmarket.maximumProfit(List(10,7,5,8,11,9)) === 6)
  }
}
