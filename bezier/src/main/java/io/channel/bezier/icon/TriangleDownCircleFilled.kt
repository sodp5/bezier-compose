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

val BezierIcon.TriangleDownCircleFilled: ImageVector
    get() {
        return io.channel.bezier.icon._triangleDownCircleFilled ?: ImageVector.Builder(
                name = "TriangleDownCircleFilled",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.2116f, 15.8311f)
                curveTo(12.1266f, 15.8311f, 12.0416f, 15.7951f, 11.9816f, 15.7231f)
                lineTo(7.6216f, 10.4921f)
                curveTo(7.4596f, 10.2961f, 7.5976f, 10.0001f, 7.8526f, 10.0001f)
                lineTo(16.5716f, 10.0001f)
                curveTo(16.8256f, 10.0001f, 16.9646f, 10.2961f, 16.8016f, 10.4921f)
                lineTo(12.4416f, 15.7231f)
                curveTo(12.3826f, 15.7951f, 12.2966f, 15.8311f, 12.2116f, 15.8311f)
                close()
                moveTo(12.0006f, 2.0001f)
                curveTo(6.4776f, 2.0001f, 2.0006f, 6.4771f, 2.0006f, 12.0001f)
                curveTo(2.0006f, 17.5231f, 6.4776f, 22.0001f, 12.0006f, 22.0001f)
                curveTo(17.5226f, 22.0001f, 22.0006f, 17.5231f, 22.0006f, 12.0001f)
                curveTo(22.0006f, 6.4771f, 17.5226f, 2.0001f, 12.0006f, 2.0001f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._triangleDownCircleFilled = it
        }
    }

private var _triangleDownCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleDownCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TriangleDownCircleFilled,
            contentDescription = null,
    )
}
