@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.TriangleDownCircleFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _triangleDownCircleFilled ?: ImageVector.Builder(
                    name = "TriangleDownCircleFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(12.212f, 15.831f)
                    arcTo(0.3f, 0.3f, 90.09794482412407f, isMoreThanHalf = false, isPositiveArc = true, 11.982f, 15.722999999999999f)
                    lineTo(7.621999999999999f, 10.492999999999999f)
                    arcTo(0.3f, 0.3f, 139.95912703212358f, isMoreThanHalf = false, isPositiveArc = true, 7.851999999999999f, 9.999999999999998f)
                    lineTo(16.572f, 9.999999999999998f)
                    arcTo(0.3f, 0.3f, 270.09780556290906f, isMoreThanHalf = false, isPositiveArc = true, 16.802f, 10.491999999999997f)
                    lineTo(12.442f, 15.722999999999997f)
                    arcTo(0.3f, 0.3f, 39.791710547175164f, isMoreThanHalf = false, isPositiveArc = true, 12.212f, 15.830999999999998f)
                    moveTo(12.0f, 2.001f)
                    curveTo(6.478f, 2.0f, 2.0f, 6.476f, 2.0f, 12.0f)
                    curveTo(2.0f, 17.522f, 6.477f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.523f, 22.0f, 22.0f, 17.522f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.476f, 17.522f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _triangleDownCircleFilled = it
            }
    }


private var _triangleDownCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleDownCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TriangleDownCircleFilled.imageVector,
            contentDescription = null,
    )
}