package ladder.domain

import java.lang.IllegalArgumentException

class Position(var position: Int, private val max: Int) {
    init {
        when {
            validLowerBound() -> throw IllegalArgumentException("0 미만의 값은 위치 정보가 될 수 없습니다.")
            validUpperBound() -> throw IllegalArgumentException("위치 정보는 최댓값을 초과할 수 없습니다.")
        }
    }

    private fun validUpperBound() = position > max

    private fun validLowerBound() = position < 0

    companion object fun first(max: Int) = Position(max, 0)

    fun isFirst() = position == 0

    fun isLast() = position == max - 1

    fun moveNext() = Position(position + 1, max)

    fun movePrevious() = Position(position - 1, max)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position

        if (position != other.position) return false
        if (max != other.max) return false

        return true
    }

    override fun hashCode(): Int {
        var result = position
        result = 31 * result + max
        return result
    }
}