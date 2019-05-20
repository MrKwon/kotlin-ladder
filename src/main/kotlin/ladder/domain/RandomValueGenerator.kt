package ladder.domain

import java.util.*

class RandomValueGenerator {
    companion object {
        private val random = Random()

        fun generate() = random.nextBoolean()
    }
}