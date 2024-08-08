package io.channel.bezier.compose.color_v2

import androidx.compose.ui.graphics.Color

interface BezierColor {
    val color: Color
}

internal val List<BezierColor>.colors: List<Color>
    get() = map { it.color }
