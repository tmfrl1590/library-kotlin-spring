package com.group.libraryapp.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JunitCalculatorTest {

    @Test
    fun addTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        assertThat(calculator.number).isEqualTo(8)   // assertThat : 확인하고 싶은 값, isEqualTo : 기대
    }

    @Test
    fun minusTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        assertThat(calculator.number).isEqualTo(2)
    }

    @Test
    fun multiPlyTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        assertThat(calculator.number).isEqualTo(15)
    }

    @Test
    fun divideTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(3)

        // then
        assertThat(calculator.number).isEqualTo(1)
    }

    @Test
    fun divideExceptionTest(){
        // given
        val calculator = Calculator(5)

        // when, then
        val message = assertThrows<IllegalArgumentException> {  // IllegalArgumentException 익센션을 기대한다.
            calculator.divide(0)
        }.message

        assertThat(message).isEqualTo("0으로 나눌 수 없다.")
    }
}