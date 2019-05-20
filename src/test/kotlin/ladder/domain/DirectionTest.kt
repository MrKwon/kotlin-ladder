package ladder.domain

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

internal class DirectionTest {
    @Test
    fun 왼쪽으로_이동하기() {
        assertThat(Direction(left = true, current = false).move()).isEqualTo(-1)
    }

    @Test
    fun 오른쪽으로_이동하기() {
        assertThat(Direction(left = false, current = true).move()).isEqualTo(1)
    }

    @Test
    fun 이동_없음() {
        assertThat(Direction(left = false, current = false).move()).isEqualTo(0)
    }

    @Test
    fun 연속_트루_예외처리() {
        assertThrows<IllegalArgumentException> {
            Direction(true, true)
        }
    }
}