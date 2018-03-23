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
}
