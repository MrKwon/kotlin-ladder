package ladder.domain

import java.lang.IllegalArgumentException

class Direction(private var left: Boolean, private val current: Boolean) {
    init {
        when {
            left && current -> throw IllegalArgumentException()
        }
    }

    companion object {
        fun of(first: Boolean, second: Boolean) = Direction(first, second)

        fun first() = Direction(left = false, current = true)
    }

    fun move(): Int = when {
        left -> -1
        current -> 1
        else -> 0
    }

    fun next(nextCurrent: Boolean) = of(this.current, nextCurrent)

    fun next() = when (this.current) {
        true -> next(false)
        false -> next(RandomValueGenerator.generate())
    }

    fun last() = of(this.current, false)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Direction

        if (left != other.left) return false
        if (current != other.current) return false

        return true
    }

    override fun hashCode(): Int {
        var result = left.hashCode()
        result = 31 * result + current.hashCode()
        return result
    }
}
