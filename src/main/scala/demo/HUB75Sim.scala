package demo

import spinal.sim._
import spinal.core._
import spinal.core.sim._


object HUB75Sim {
  def main(args: Array[String]): Unit = {
    SimConfig.withWave.compile(HUB75(4, 6, 1, 2, 5)).doSim{ dut =>
      dut.clockDomain.forkStimulus(period = 5)

      for(idx <- 0 until 1000/5*1000){
        dut.clockDomain.waitSampling()
      }
    }
  }

}
