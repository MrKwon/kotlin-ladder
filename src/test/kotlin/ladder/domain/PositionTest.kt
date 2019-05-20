package ladder.domain

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

internal class PositionTest {
    @Test
    fun 포지션_설정() {
        assertThat(Position(0, 5).position).isEqualTo(0)
    }

    @Test
    fun 포지션_0미만_에러_처리() {
        assertThrows<IllegalArgumentException> {
            Position(-1, 5)
        }
    }

    @Test
    fun 맥스_초과_에러_처리() {
        assertThrows<IllegalArgumentException> {
            Position(6, 3)
        }
    }

    @Test
    fun 첫번째_포지션_확인() {
        assertTrue(Position(0,5).isFirst())
    }


    @Test
    fun 마지막_포지션_확인() {
        assertTrue(Position(4,5).isLast())
    }

    @Test
    fun 다음으로_이동() {
        assertThat(Position(0,5).moveNext()).isEqualTo(Position(1,5))
    }

    @Test
    fun 이전으로_이동() {
        assertThat(Position(2,5).movePrevious()).isEqualTo(Position(1,5))
    }
}