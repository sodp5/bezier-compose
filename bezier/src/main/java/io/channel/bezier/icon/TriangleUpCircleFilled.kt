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

val BezierIcons.TriangleUpCircleFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _triangleUpCircleFilled ?: ImageVector.Builder(
                    name = "TriangleUpCircleFilled",
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
                    moveTo(11.952f, 8.168f)
                    curveTo(12.037f, 8.168f, 12.122f, 8.203999999999999f, 12.182f, 8.276f)
                    lineTo(16.542f, 13.508f)
                    arcTo(0.3f, 0.3f, 319.95843903673824f, isMoreThanHalf = false, isPositiveArc = true, 16.311f, 14.001f)
                    lineTo(7.59f, 14.001f)
                    arcTo(0.3f, 0.3f, 89.93806540169308f, isMoreThanHalf = false, isPositiveArc = true, 7.359999999999999f, 13.508f)
                    lineTo(11.719999999999999f, 8.276f)
                    arcTo(0.3f, 0.3f, 219.79171054717517f, isMoreThanHalf = false, isPositiveArc = true, 11.95f, 8.168f)
                    moveTo(12.0f, 2.0f)
                    curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                    curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _triangleUpCircleFilled = it
            }
    }


private var _triangleUpCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleUpCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TriangleUpCircleFilled.imageVector,
            contentDescription = null,
    )
}
