package com.group.libraryapp.calculator

import net.bytebuddy.pool.TypePool.Resolution.Illegal

fun main(){
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiFlyTest()
    calculatorTest.divideFlyTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {



    fun addTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if(calculator.number != 8){
            throw IllegalStateException()
        }
    }

    fun minusTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(2)

        // then
        if(calculator.number != 3){
            throw IllegalStateException()
        }
    }

    fun multiFlyTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(2)

        // then
        if(calculator.number != 10){
            throw IllegalStateException()
        }
    }

    fun divideFlyTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if(calculator.number != 2){
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest(){
        // given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        }catch (e: IllegalArgumentException){
            if(e.message != "0으로 나눌 수 없다."){
                throw IllegalStateException("메세지가 다릅니다.")
            }
            // 테스트 성공
            return
        }catch (e: Exception){
            throw IllegalStateException()
        }

        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다")
    }
}